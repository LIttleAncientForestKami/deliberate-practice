package pl.edu.lafk.guessing_game;

import java.util.Scanner;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
class Main {

  public static void main(String[] args) {
    Range range = new Range(89, 79);
    System.out.println("Hello! I'm a guessing game. I'll now randomize a number from a " + range);
    NumberToCompareTo randomizedNumber = range.randomize();
    var scanner = new Scanner(System.in);
    System.out.println(randomizedNumber);
    NumberToCompareTo guess = NumberToCompareTo.differentFrom(randomizedNumber, range);
    do {
      System.out.println("Give me your best shot! Your input ("+ range +")? ");
      try {
        guess = new NumberToCompareTo(scanner.nextInt(), range);
      } catch (IllegalArgumentException iae) {
        System.err.println(iae.getMessage());
        continue;
      }
      scanner.nextLine();
      range = range.adjust(guess, randomizedNumber);
    } while(!guess.equals(randomizedNumber));
    System.out.println("Well done, you've guessed it");
  }
}
