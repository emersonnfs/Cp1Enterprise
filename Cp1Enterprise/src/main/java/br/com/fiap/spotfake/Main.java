package br.com.fiap.spotfake;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.
                        createEntityManagerFactory(
                                "TESTE-PU");

        EntityManager entityManager = entityManagerFactory.
                createEntityManager();

        entityManager.close();
        entityManagerFactory.close();
    }
}
