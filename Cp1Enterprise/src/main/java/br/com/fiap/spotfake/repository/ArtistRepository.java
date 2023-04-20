package br.com.fiap.spotfake.repository;

import br.com.fiap.spotfake.models.Artist;
import jakarta.persistence.EntityManager;

public class ArtistRepository {
    private EntityManager entityManager;

    public ArtistRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Iterable<Artist> findAllArtist(){
        String jpql = "SELECT a FROM Artist a";
        var query = entityManager.createQuery(jpql,Artist.class);
        var artists = query.getResultList();
        return artists;
    }

    public void insertArtist(Artist artist) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(artist);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }
}
