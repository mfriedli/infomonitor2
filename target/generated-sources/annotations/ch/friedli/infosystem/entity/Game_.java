package ch.friedli.infosystem.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Game.class)
public abstract class Game_ {

	public static volatile SingularAttribute<Game, Short> scoreGuest;
	public static volatile SingularAttribute<Game, Date> date;
	public static volatile SingularAttribute<Game, Short> scoreHome;
	public static volatile SingularAttribute<Game, Serializable> isOvertime;
	public static volatile SingularAttribute<Game, String> guest;
	public static volatile SingularAttribute<Game, String> location;
	public static volatile SingularAttribute<Game, Integer> id;
	public static volatile SingularAttribute<Game, Integer> ihsGameNbr;
	public static volatile SingularAttribute<Game, Date> time;
	public static volatile SingularAttribute<Game, String> home;
	public static volatile SingularAttribute<Game, Serializable> isPenaltyShootOut;
	public static volatile SingularAttribute<Game, Serializable> isCompleted;

}

