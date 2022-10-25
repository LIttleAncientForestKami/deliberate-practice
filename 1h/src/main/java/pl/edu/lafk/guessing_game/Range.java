package pl.edu.lafk.guessing_game;

import java.util.Random;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
class Range {
  private final int floor;
  private final int ceiling;

  Range(int floor, int ceiling) {
    this.floor = Math.min(floor, ceiling);
    this.ceiling = Math.max(floor, ceiling);
  }

  @Override
  public String toString() {
    return String.format("range <%d,%d>",floor,ceiling);
  }

  NumberToCompareTo randomize() {
    return new NumberToCompareTo(new Random().nextInt(floor, ceiling+1), this);
  }

  //TODO: consider a better name
  public boolean isInside(int anInt) {
    return floor <= anInt && anInt <= ceiling;
  }

  Range adjust(NumberToCompareTo guess, NumberToCompareTo randomizedNumber) {
    if (guess.intValue() > randomizedNumber.intValue()) {
      System.out.println(HINTS.LOWER);
      return new Range(floor, guess.intValue());
    }
    if (guess.intValue() < randomizedNumber.intValue()) {
      System.out.println(HINTS.HIGHER);
      return new Range(guess.intValue(), ceiling);
    }
    return this;
  }
}
