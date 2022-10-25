package pl.edu.lafk.calculator;

import java.util.Scanner;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Main {

  enum Options {ADD, SUBTRACT, DIVIDE}

  public static void main(String[] args) {
    System.out.println("Welcome to calculator. Choose your option:");
    menu();
    Scanner scanner = new Scanner(System.in);
    System.out.println(choosingAnOptionAndPerformingTheOperation(scanner));

  }

  private static int choosingAnOptionAndPerformingTheOperation(Scanner scanner) {
    switch (scanner.nextLine().toUpperCase()) {
      case "0", "ADD":
        System.out.println("adding, give me 2 numbers");
        return scanner.nextInt()+scanner.nextInt();
      case "1", "SUBTRACT":
        System.out.println("subtracting, give me 2 numbers");
        return scanner.nextInt()-scanner.nextInt();
      case "2", "DIVIDE":
        System.out.println("dividing, give me 2 numbers");
        return scanner.nextInt()/scanner.nextInt();
    }
    return -1;
  }

  private static void menu() {
    for (Options value : Options.values()) {
      System.out.println(value.ordinal() + ". " + value);
    }
  }
}
