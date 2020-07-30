/**
 * 
 */
package com.test.freme;



import org.apache.log4j.Logger;

import com.test.freme.model.Individu;
import com.test.freme.model.Person;

import lombok.extern.log4j.Log4j;

/**
 * @author 77011-53-02
 *
 */
@Log4j
public class Appmain {

	/**
	 * @param args
	 */
	private static final Logger log = Logger.getLogger(Appmain.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("entree dans la methode main");
		log.info("Creation person");
		Person p = new Person ();
		
		p.setAdress("25 rue de la poste 77000");
		p.setAge(13);
		p.setNom("Durant");
		log.info("Person: "+p.toString());
		//System.out.println(p.toString());
		
		log.info("Creation individu");
		Individu individu = Individu.builder().build();
		individu.setAdress("26 rue de la poste 77000");
		individu.setAge(15);
		individu.setNom("EZDIN");
		log.info("Individu: "+individu.toString());
		//System.out.println(individu.toString());
		
		log.info("Creation individu2");
		Individu individu2 = Individu
				.builder()
				.nom("Albert")
				.prenom("Fred")
				.age(25)
				.adress("15 avenue marceau")
				.build();
		log.info("Individu2: "+individu2.toString());
		

	}

}
