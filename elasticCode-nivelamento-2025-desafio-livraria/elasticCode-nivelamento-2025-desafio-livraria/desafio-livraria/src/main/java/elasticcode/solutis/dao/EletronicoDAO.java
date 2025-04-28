package elasticcode.solutis.dao;

import elasticcode.solutis.entity.Eletronico;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class EletronicoDAO {

    EntityManagerFactory emf;
    EntityManager em;

    public EletronicoDAO() {
        emf = Persistence.createEntityManagerFactory("desafiolivraria");
        em = emf.createEntityManager();
    }

    public void salvar(Eletronico eletronico){
        em.getTransaction().begin();
        em.merge(eletronico);
        em.getTransaction().commit();
    }

    public List<Eletronico> listarTodos() {
        em.getTransaction().begin();
        List<Eletronico> eletronicos = em.createQuery("select eletronicos from Eletronico eletronicos", Eletronico.class)
                .getResultList();
        em.getTransaction().commit();
        return eletronicos;
    }

    public void fechar(){
        em.close();
        emf.close();
    }
}
