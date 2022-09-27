package br.edu.ifsul.cc.lpoo.cv.model;

import br.edu.ifsul.cc.lpoo.cv.model.Agenda;
import br.edu.ifsul.cc.lpoo.cv.model.Pet;
import br.edu.ifsul.cc.lpoo.cv.model.Produto;
import br.edu.ifsul.cc.lpoo.cv.model.Status;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-09-27T09:59:58", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Procedimento.class)
public class Procedimento_ { 

    public static volatile SingularAttribute<Procedimento, String> observacao;
    public static volatile ListAttribute<Procedimento, Produto> produtos;
    public static volatile SingularAttribute<Procedimento, Float> valor;
    public static volatile SingularAttribute<Procedimento, Integer> id;
    public static volatile SingularAttribute<Procedimento, Agenda> agenda;
    public static volatile SingularAttribute<Procedimento, Pet> pet;
    public static volatile SingularAttribute<Procedimento, Status> status;

}