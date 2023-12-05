package org.example;
import java.util.Scanner;
import Models.Aktor;
import Models.Film;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //obiekt z pustego konstruktora
        Film pulpFiction = new Film();
        pulpFiction.setTitle("Pulp fiction");
        pulpFiction.setRating('3');
        pulpFiction.setCategory("B");
        pulpFiction.setBudget(66.5);

        Film topGun = new Film("Top Gun", "Opis test", "Director Y", 190.4, 'A', "Action");

        double budzetFilmuPulpFiction;
        double budzetFilmuTopGun;

        budzetFilmuPulpFiction = pulpFiction.getBudget();
        budzetFilmuTopGun = topGun.getBudget();

        System.out.println("Budżet filmu Pulp Fiction wynosi: " + budzetFilmuPulpFiction);
        System.out.println("Budżet filmu Top Gun wynosi: " + budzetFilmuTopGun);

        Aktor tomCruise = new Aktor("tomCruise", "Tom", "Cruise", 12,false);

        System.out.println(tomCruise.getFirstName()+" "+tomCruise.getLastName() + " Rating: " + tomCruise.getRating());



        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);
        }
    }
