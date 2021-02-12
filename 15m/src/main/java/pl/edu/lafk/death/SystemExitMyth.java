package pl.edu.lafk.death;

/**
 * Demonstrates the case when System.exit will not work
 *
 * @author Tomasz @LAFK_pl Borek
 */
class SystemExitMyth {

    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkExit(int status) {
                throw new ThreadDeath();
            }
        });

        try {
            throw new Exception();
        } catch (Exception e) {
        System.exit(0);
        }  finally {
            System.out.println("sasasasa!");
        }

    }
}
