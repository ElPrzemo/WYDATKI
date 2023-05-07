package org.example;

import java.util.Scanner;

public class ExpensesApp {

    public void start(){
        Scanner scanner = new Scanner(System.in);
        ExpenseMenager expenseMenager = new ExpenseMenager();

        while (true){
            System.out.println("1. Wyświetl wszystkie wydatki");
            System.out.println("2. Wyświetl wydatki z wybranego miesiąca");
            System.out.println("3. Dodaj wydatek");
            System.out.println("4. Zakończ aplikacje");
            System.out.println("Wybierz opcje");

          int choice =  Integer.parseInt(scanner.nextLine()); // jak byśmy tu zrobili next int to metoda nie bierze pod uwagę znaku końc linii;

            switch (choice){
                case 1 -> expenseMenager.displayAllExpenses();
                case 2 -> expenseMenager.displayMonthlyExpenses(scanner);
                case 3 -> expenseMenager.addExpense(scanner);
                case 4-> {
                    scanner.close();
                    System.exit(0);
                }
            }






        }

    }
}
