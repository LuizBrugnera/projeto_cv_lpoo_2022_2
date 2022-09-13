package br.edu.ifsul.cc.lpoo.cv.model;

import br.edu.ifsul.cc.lpoo.cv.model.Cliente;
import br.edu.ifsul.cc.lpoo.cv.model.Funcionario;
import br.edu.ifsul.cc.lpoo.cv.model.Medico;
import br.edu.ifsul.cc.lpoo.cv.model.Status;
import br.edu.ifsul.cc.lpoo.cv.model.TipoProduto;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-09-13T11:26:57", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Agenda.class)
public class Agenda_ { 

    public static volatile SingularAttribute<Agenda, Calendar> data_inicio;
    public static volatile SingularAttribute<Agenda, Cliente> cliente;
    public static volatile SingularAttribute<Agenda, Calendar> data_fim;
    public static volatile SingularAttribute<Agenda, String> observacao;
    public static volatile SingularAttribute<Agenda, TipoProduto> tipo;
    public static volatile SingularAttribute<Agenda, Medico> medico;
    public static volatile SingularAttribute<Agenda, Integer> id;
    public static volatile SingularAttribute<Agenda, Funcionario> funcionario;
    public static volatile SingularAttribute<Agenda, Status> status;

}