package many_to_many_uni_pl.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni_pl.dto.Language;
import many_to_many_uni_pl.dto.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		
		Person person1=new Person();
		person1.setId(1);
		person1.setName("rakesh");
		person1.setAddress("blr");
		person1.setPhone(987654);
		
		Person person2=new Person();
		person2.setId(2);
		person2.setName("tej");
		person2.setAddress("blr");
		person2.setPhone(2134654);
		
		Person person3=new Person();
		person3.setId(3);
		person3.setName("martin");
		person3.setAddress("blr");
		person3.setPhone(56987654);
		
		Language language1=new Language();
		language1.setId(501);
		language1.setName("kannada");
		language1.setOrigin("karnataka");
		language1.setCounutry("India");
		
		Language language2=new Language();
		language2.setId(502);
		language2.setName("tamil");
		language2.setOrigin("TN");
		language2.setCounutry("India");
		
		Language language3=new Language();
		language3.setId(503);
		language3.setName("punjabi");
		language3.setOrigin("punjab");
		language3.setCounutry("India");
		
		List<Language>list1=new ArrayList<Language>();
		list1.add(language1);
		list1.add(language3);
		
		List<Language>list2=new ArrayList<Language>();
		list2.add(language2);
		list2.add(language3);
		
		List<Language>list3=new ArrayList<Language>();
		list3.add(language1);
		list3.add(language2);
		
		person1.setL(list3);
		person2.setL(list2);
		person3.setL(list1);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(language1);
		entityManager.persist(language2);
		entityManager.persist(language3);
		
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		
		
		
		entityTransaction.commit();
		
		
	}

}
