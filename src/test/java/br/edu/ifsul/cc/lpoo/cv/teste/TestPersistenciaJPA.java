/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.cv.teste;

import br.edu.ifsul.cc.lpoo.cv.model.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author 20211PF.CC0001
 */
public class TestPersistenciaJPA {
    
    @Test
    public void testeConexaoJPA()
    {
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta())
        {
            System.out.println("conectou no BD via jpa ...");
        }
        else 
        {
            System.out.println("NAO conectou no BD via jpa ...");
        }  
    }
}
