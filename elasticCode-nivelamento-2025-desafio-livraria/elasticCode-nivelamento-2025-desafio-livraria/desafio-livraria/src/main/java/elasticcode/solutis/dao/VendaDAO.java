package elasticcode.solutis.dao;

import elasticcode.solutis.entity.Eletronico;
import elasticcode.solutis.entity.Impresso;
import elasticcode.solutis.entity.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class VendaDAO {

    EntityManagerFactory emf;
    EntityManager em;

    public VendaDAO() {
        emf = Persistence.createEntityManagerFactory("desafiolivraria");
        em = emf.createEntityManager();
    }

    public void salvar(Venda venda){
        em.getTransaction().begin();
        em.merge(venda);
        em.getTransaction().commit();
    }

    public List<Venda> listarTodos() {
        em.getTransaction().begin();
        List<Venda> vendas = em.createQuery("select vendas from Venda vendas", Venda.class)
                .getResultList();
        em.getTransaction().commit();
        return vendas;
    }

    public void fechar(){
        em.close();
        emf.close();
    }
}
