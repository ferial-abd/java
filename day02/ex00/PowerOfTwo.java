import java.util.*;


class Main {

     static boolean isPower(int n)
    {
        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
        public static void main(String args[]) { 

        Scanner x = new Scanner(System.in);
        System.out.println("Entrer un nombre "); 
        int ent = x.nextInt() ; 
        if (isPower(ent))
            System.out.println("est une puissance de 2");
        else
            System.out.println("n'est pas une puissance de 2");
      } 
}