package TP6ex4;

import java.util.Arrays;
import java.util.Scanner;

public class TP6ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab; // celui-ci un tableau vide qui contient les numéro en type int
		int n;
		n = 5;
		tab = new int[n]; // creer un tableau 10 élements
		Scanner src = new Scanner(System.in);
		boolean bool = true;
		int index = 0;
		while (bool) {
			System.out.println("Saissiez votre numero, svp");
			tab[index] = src.nextInt();
			if (tab[index] == 0 || index >= n-1) {
				bool = false;
			}
			index++;
		};
		
		n=index;
		int[] tabFinal = new int[n]; //creer un nouveau tableau qui contient les numéros saisis
		for(int i = 0; i< n;i++) {
			tabFinal[i]=tab[i];
		};

		System.out.println("Tableau origin est: " + Arrays.toString(tabFinal));
	}

}
