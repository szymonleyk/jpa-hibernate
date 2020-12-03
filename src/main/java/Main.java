import pl.szymonleyk.jpa.entities.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                javax.persistence.Persistence.createEntityManagerFactory("courier-db");
        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();
            Address address = new Address("Zielona", "234", 5, "12-123", "Gdańsk");
            em.persist(address);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

    }
}
