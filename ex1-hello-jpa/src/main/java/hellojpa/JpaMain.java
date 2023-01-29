package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{
            /*
            // INSERT
            Member member = new Member();
            member.setId(1L);
            member.setUsername("helloA");

            em.persist(member);


            // SELECT
            Member findMember = em.find(Member.class, 1L);


            // UPDATE
            Member findMember = em.find(Member.class, 1L);
            findMember.setUsername("helloJPA");
            // em.persist 하지않고 객체의 값만 바꿔도 update 된다.

            */

            tx.commit();

        }catch(Exception e){
            tx.rollback();;
        }finally {
            em.close();;
        }

        emf.close();
    }
}
