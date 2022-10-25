package pl.edu.lafk.guessing_game;

import java.util.Objects;

/**
 * //TODO:  implement Comparable
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
class NumberToCompareTo {
  private int anInt;

  NumberToCompareTo(int anInt, Range range) {
    if (range.isInside(anInt)) {
      this.anInt = anInt;
    } else throw new IllegalArgumentException("The number passed in falls outside of a given range. FYI, " + range);
  }

  static NumberToCompareTo differentFrom(NumberToCompareTo randomizedNumber, Range range) {
    //TODO: ugly code. Take out randomized item in the Range, put all else in a data structure, randomize from that data structure.
    NumberToCompareTo shouldBeDifferent = range.randomize();
    do {
      shouldBeDifferent = range.randomize();
    } while (shouldBeDifferent.equals(randomizedNumber));
    return shouldBeDifferent;
  }

  int intValue() {
    return anInt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NumberToCompareTo that = (NumberToCompareTo) o;
    return anInt == that.anInt;
  }

  @Override
  public int hashCode() {
    return Objects.hash(anInt);
  }

  @Override
  public String toString() {
    return "" + anInt;
  }
}

