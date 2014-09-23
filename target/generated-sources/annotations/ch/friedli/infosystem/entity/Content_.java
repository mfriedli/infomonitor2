package ch.friedli.infosystem.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Content.class)
public abstract class Content_ {

	public static volatile SingularAttribute<Content, String> protocol;
	public static volatile SingularAttribute<Content, Date> creationTime;
	public static volatile SingularAttribute<Content, String> contentUri;
	public static volatile SingularAttribute<Content, Integer> sortOrder;
	public static volatile SingularAttribute<Content, Integer> width;
	public static volatile SingularAttribute<Content, Integer> id;
	public static volatile SingularAttribute<Content, Short> isActive;
	public static volatile SingularAttribute<Content, String> contentType;
	public static volatile SingularAttribute<Content, String> extWebUrl;
	public static volatile SingularAttribute<Content, Integer> intervalShow;
	public static volatile SingularAttribute<Content, Integer> height;

}

