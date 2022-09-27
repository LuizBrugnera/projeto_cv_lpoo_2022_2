/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.teste;

import br.edu.ifsul.cc.lpoo.cv.model.Fornecedor;
import br.edu.ifsul.cc.lpoo.cv.model.Produto;
import br.edu.ifsul.cc.lpoo.cv.model.TipoProduto;
import br.edu.ifsul.cc.lpoo.cv.model.dao.PersistenciaJPA;
import java.util.Calendar;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author 20211PF.CC0001
 */
public class TestPersistenciaJPA {

    //@Test
    public void testeConexaoJPA() {
        PersistenciaJPA jpa = new PersistenciaJPA();
        if (jpa.conexaoAberta()) {
            System.out.println("conectou no BD via jpa ...");
        } else {
            System.out.println("NAO conectou no BD via jpa ...");
        }
    }

    //@Test
    public void testListProduto() throws Exception {
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if (jpa.conexaoAberta()) {
            List<Produto> lista = jpa.listProdutos();
            for (Produto p : lista) {

                System.out.println("Produto: " + p);
            }

            jpa.fecharConexao();
        } else {
            System.out.println("nao conectou no BD ...");

        }
    }

    @Test
    public void testPersitenciaProduto() throws Exception {
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if (jpa.conexaoAberta()) {

            List<Produto> lista = jpa.listProdutos();
            if (lista.isEmpty()) {

                Produto p = new Produto();
                p.setNome("teste");
                p.setFornecedor(getFornecedor(jpa));
                p.setQuantidade(0f);
                p.setTipo(TipoProduto.ATENDIMENTO_AMBULATORIAL);
                p.setValor(100f);
                jpa.persist(p);
                System.out.println("Incluiu o produto: " + p.getId());

            } else {

                for (Produto p : lista) {
                    jpa.remover(p);
                }

                System.out.println("Removeu todos os " + lista.size() + " produtos");
            }

            jpa.fecharConexao();
        } else {
            System.out.println("nao conectou no BD ...");

        }
    }

    private Fornecedor getFornecedor(PersistenciaJPA jpa) throws Exception {
        //criar um objeto do tipo PersistenciaJPA.     
        if (jpa.conexaoAberta()) {

            List<Fornecedor> lista = jpa.listFornecedores();
            if (lista.isEmpty()) {

                Fornecedor f = new Fornecedor();
                f.setNome("teste");
                f.setCnpj("08316535000");
                f.setIe("");
                f.setData_cadastro(Calendar.getInstance());
                f.setNome("Laboratório Santa Inês");
                f.setRg("123");
                f.setSenha("123");
                f.setCpf("00001337788");
                jpa.persist(f);

                return f;

            } else {

                return lista.get(0);
            }

        } else {
            System.out.println("nao conectou no BD ...");

        }

        return null;
    }
}
