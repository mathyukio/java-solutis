package br.com.solutis.repository;

import br.com.solutis.modelo.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ProdutoRepository {

    EntityManagerFactory emf;
    EntityManager em;

    public ProdutoRepository() {
        emf = Persistence.createEntityManagerFactory("controleestoque");
        em = emf.createEntityManager();
    }

    public void salvar(Produto produto){
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();
    }

    public void atualizarPrecoProduto(int id, Double novoPreco) {
        em.getTransaction().begin();
        Produto produto = em.find(Produto.class, id);
        if (produto != null) {
            produto.setPreco(novoPreco);
            System.out.printf("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
        em.getTransaction().commit();
    }

    public void removerProdutoPorId(int id) {
        em.getTransaction().begin();
        Produto produto = em.find(Produto.class, id);
        if (produto != null) {
            em.remove(em.merge(produto));
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
        em.getTransaction().commit();
    }

    public List<Produto> listarTodos() {
        em.getTransaction().begin();
        List<Produto> produtos = em.createQuery("select produtos from Produto produtos", Produto.class)
                .getResultList();
        em.getTransaction().commit();
        return produtos;
    }


    public void fechar(){
        em.close();
        emf.close();
    }
}
