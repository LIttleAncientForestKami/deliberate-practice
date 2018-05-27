package pl.edu.lafk;

public class Recursion1_count8 {
    public int count8(int n) {
        return count8Acu(n, false);
    }

    //8818 -> 4, funkcja z akumulatorem
    public int count8Acu(int n, boolean found8Previously) {
        if (n<10 && n != 8) return 0;
        if (n<10 && n == 8) return found8Previously ? 2 : 1;
        int rightMostDigit = n%10;
        boolean found8Now = rightMostDigit == 8;
        int count = found8Now ? 1 : 0;
        if (found8Previously && found8Now) count+=1;
        return count + count8Acu(n/10, found8Now);
    }

    public int count8_2(int n) {
        if(n/10==0 && n%10==8) return 1;
        if(n/10==0 && n%10!=8) return 0;

        if(n%10==8 && (n/10)%10==8) return 2 +count8_2(n/10);
        if(n%10==8 && (n/10)%10!=8) return 1 +count8_2(n/10);

        return count8_2(n/10);
    }

    public static void main(String[] args) {
        Recursion1_count8 r1 = new Recursion1_count8();
        System.out.println(r1.count8(1));
        System.out.println(r1.count8(11));
        System.out.println(r1.count8(15));
        System.out.println(r1.count8(81));
        System.out.println(r1.count8(8818));
        System.out.println(r1.count8(88));
        System.out.println(r1.count8(88888));

        System.out.println(r1.count8_2(1));
        System.out.println(r1.count8_2(11));
        System.out.println(r1.count8_2(15));
        System.out.println(r1.count8_2(81));
        System.out.println(r1.count8_2(8818));
        System.out.println(r1.count8_2(88));
        System.out.println(r1.count8_2(88888));
    }
}
