/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.lpoo.cv.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author 20211PF.CC0001
 */
@Entity
@Table(name = "tb_consulta")
public class Medico extends Pessoa implements Serializable{
    
    @Column(nullable = false, length = 100)
    private String numero_crmv;

    public Medico() {
        super();
    }

    public String getNumero_crmv() {
        return numero_crmv;
    }

    public void setNumero_crmv(String numero_crmv) {
        this.numero_crmv = numero_crmv;
    }
    
}
