package pl.edu.lafk;

public class Recursion1 {

    public int powerN(int base, int n) {
        if (n == 1) return base;
        return base*powerN(base, n-1);
    }

    public int countX(String str) {
        if (str == null || str.isEmpty() || !str.contains("x")) return 0;
        if (str.equals("x")) return 1;
        return 1 + countX(str.substring(str.indexOf("x")+1));
    }

    public int countHi(String str) {
        if (str == null || str.isEmpty() || !str.contains("hi")) return 0;
        if (str.equals("hi")) return 1;
        return 1 + countHi(str.substring(str.indexOf("hi")+2));
    }

    public int countHi_2(String str) {
      if (str.length() <= 1) return 0;
      int count = 0;
      if (str.substring(0, 2).equals("hi")) count = 1;  // could use startsWith()
      return count + countHi_2(str.substring(1));
    }

    public String changeXY(String str) {
        if (str == null || !str.contains("x")) return str;
        String ret = str.substring(0,1);
        return ret.replace("x","y")+changeXY(str.substring(1));
    }

    public String changeXY_trick(String str) {
        return str.replaceAll("x","y");
    }

    public String changePi(String str) {
        if (str == null || !str.contains("pi")) return str;
        if (str.startsWith("pi")) return "3.14" + changePi(str.substring(2));
        return str.substring(0,1)+changePi(str.substring(1));
    }

    public String changePi_trick(String str) {
        return str.replaceAll("pi", "3.14");
    }

    public String noX(String str) {
        if (str == null) return str;
        int pos = str.indexOf("x");
        if (pos == -1) return str;
        return noX(str.replaceFirst("x", ""));
    }

    public static void main(String[] args) {
        Recursion1 r1 = new Recursion1();
//        System.out.println(r1.count8_3(88888));
        System.out.println(r1.countX(null));
        System.out.println(r1.countX(""));
        System.out.println(r1.countX("nie ma takiego znaku"));
        System.out.println(r1.countX("x"));
        System.out.println(r1.countX("o"));
        System.out.println(r1.countX("ox"));
        System.out.println(r1.countX("xxhixx"));

        System.out.println(r1.countHi(null));
        System.out.println(r1.countHi(""));
        System.out.println(r1.countHi("nie ma takiego napisu"));
        System.out.println(r1.countHi("hi"));
        System.out.println(r1.countHi("h"));
        System.out.println(r1.countHi("ih"));
        System.out.println(r1.countHi("xxhixhix"));
    }
}
