package br.edu.ifsul.cc.lpoo.cv.model;

import br.edu.ifsul.cc.lpoo.cv.model.Cliente;
import br.edu.ifsul.cc.lpoo.cv.model.Consulta;
import br.edu.ifsul.cc.lpoo.cv.model.Funcionario;
import br.edu.ifsul.cc.lpoo.cv.model.Pagamento;
import br.edu.ifsul.cc.lpoo.cv.model.Produto;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-09-27T09:59:58", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Float> valor_total;
    public static volatile SingularAttribute<Venda, Pagamento> formaPagamento;
    public static volatile SingularAttribute<Venda, Cliente> cliente;
    public static volatile SingularAttribute<Venda, String> observacao;
    public static volatile SingularAttribute<Venda, Calendar> data;
    public static volatile ListAttribute<Venda, Produto> produtos;
    public static volatile ListAttribute<Venda, Consulta> consultas;
    public static volatile SingularAttribute<Venda, Integer> id;
    public static volatile SingularAttribute<Venda, Funcionario> funcionario;

}