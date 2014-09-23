package ch.friedli.infosystem.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Breakingnews.class)
public abstract class Breakingnews_ {

	public static volatile SingularAttribute<Breakingnews, Date> date;
	public static volatile SingularAttribute<Breakingnews, String> author;
	public static volatile SingularAttribute<Breakingnews, Short> isBlinking;
	public static volatile SingularAttribute<Breakingnews, Integer> id;
	public static volatile SingularAttribute<Breakingnews, String> text;
	public static volatile SingularAttribute<Breakingnews, Short> isActive;

}

