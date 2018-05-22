package pl.edu.lafk.colours;

/**
 * @see <a href="https://gist.github.com/LIttleAncientForestKami/d04b97fcac4e81ca17106436d785ef94" target="_top">My gist</a>
 */
enum ANSI {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private final String escapeCode;

    ANSI(String ansiVal) {
        this.escapeCode = ansiVal;
    }

    @Override
    public String toString() {
        return escapeCode;
    }

}
