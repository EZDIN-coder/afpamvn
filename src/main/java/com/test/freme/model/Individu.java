/**
 * 
 */
package com.test.freme.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 77011-53-02
 *
 */

@Setter
@Getter
@Data
@Builder
public class Individu {
	private String nom;
	private String prenom;
	private int age;
	private String adress;
	@Override
	public String toString() {
		return "Individu [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adress=" + adress + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}
