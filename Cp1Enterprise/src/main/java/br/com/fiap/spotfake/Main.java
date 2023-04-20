package br.com.fiap.spotfake;

import br.com.fiap.spotfake.models.Artist;
import br.com.fiap.spotfake.repository.ArtistRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try{
            EntityManagerFactory entityManagerFactory =
                    Persistence.
                            createEntityManagerFactory(
                                    "TESTE-PU");

            EntityManager entityManager = entityManagerFactory.
                    createEntityManager();

            var artistaRepository = new ArtistRepository(entityManager);
            var artista = new Artist();
            artista.setName("Michael Jackson");
            artista.setType("Pop");
            artistaRepository.insertArtist(artista);
            entityManager.close();
            entityManagerFactory.close();
        }catch (Exception e){
            throw e;
        }
    }
}
