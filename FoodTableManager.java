
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class FoodTableManager {

    public int getFoodSetIdJpa(String m, String e, String w){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("per_sistence_HiberDog");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query1 = em.createNativeQuery("SELECT id FROM mixfood1 WHERE morningFood = " + "'" + m + "'" +
                " AND eveningFood = " + "'" + e + "'" + " AND water = " + "'" + w + "'");
        List collection1 = query1.getResultList();

        int foodSetId = (Integer)collection1.get(0);
        em.getTransaction().commit();
        em.close();

        return foodSetId;
    }
}
