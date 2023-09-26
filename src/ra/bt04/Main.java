package ra.bt04;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fan fanon = new Fan(Fan.FAST,true,10,"yellow" );

        Fan fanoff = new Fan(false,5,"blue");
        System.out.println(fanon);
        System.out.println(fanoff);

    }
}
