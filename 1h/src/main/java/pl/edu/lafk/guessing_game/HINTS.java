package pl.edu.lafk.guessing_game;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
enum HINTS {
  HIGHER("Your number is higher than that. Adjusted the range."),
  LOWER("Your number is lower than that. Adjusted the range.");

  private String txt;

  HINTS(String txt) {
    this.txt = txt;
  }

  @Override
  public String toString() {
    return txt;
  }
}
