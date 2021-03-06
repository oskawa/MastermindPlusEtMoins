package com.sdz.ClassFille;

import java.util.Scanner;

import com.sdz.AbstractClass.Erreur;
import com.sdz.AbstractClass.Jeu;
import com.sdz.AbstractClass.Joueur;


/**
 * /*************************************************************************
 * 
 * Classe fille correspondant à l'utilisateur héritant de la classe mère Joueur.
 * 
 * @author Delomez Matthieu
 *************************************************************************/

public class Humain extends Joueur {

	/*
	 * Constructeur de la classe Humain retournant aucune valeur.
	 */
	public void Humain() {

	}

	/*
	 * Méthodes qui retourne la proposition du joueur dans le mode console.
	 */
	public void proposerNbr() {

		System.out.println("Proposition :");

		do {
			Scanner sc = new Scanner(System.in);
			proposition = sc.nextLine();

			LongProposition = String.valueOf(proposition).length();

			if (!proposition.matches("[0_9]+") || LongProposition != Jeu.LongueurCodeSecret)
				Erreur.erreurNbr();

		} while (LongProposition != Jeu.LongueurCodeSecret || !proposition.matches("[0-9]+"));

	}
}
