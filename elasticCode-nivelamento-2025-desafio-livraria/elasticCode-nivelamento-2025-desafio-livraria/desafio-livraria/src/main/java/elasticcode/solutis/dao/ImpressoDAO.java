package elasticcode.solutis.dao;

import elasticcode.solutis.entity.Eletronico;
import elasticcode.solutis.entity.Impresso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ImpressoDAO {

    EntityManagerFactory emf;
    EntityManager em;

    public ImpressoDAO() {
        emf = Persistence.createEntityManagerFactory("desafiolivraria");
        em = emf.createEntityManager();
    }

    public void salvar(Impresso impresso){
        em.getTransaction().begin();
        em.merge(impresso);
        em.getTransaction().commit();
    }

    public List<Impresso> listarTodos() {
        em.getTransaction().begin();
        List<Impresso> impressos = em.createQuery("select impressos from Impresso impressos", Impresso.class)
                .getResultList();
        em.getTransaction().commit();
        return impressos;
    }

    public void decrementarEstoque(Integer id) {
        em.getTransaction().begin();
        Impresso impresso = em.find(Impresso.class, id);
        if (impresso != null && impresso.getEstoque() > 0) {
            impresso.setEstoque(impresso.getEstoque() - 1);
            em.merge(impresso);
        }
        em.getTransaction().commit();
    }

    public void fechar(){
        em.close();
        emf.close();
    }
}
