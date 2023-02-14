package ch03;
/**
 * 두 수의 대소 비교
 */

import java.util.Scanner;

public class Ex_1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) System.out.println(">");
        else if (b>a) System.out.println("<");
        else System.out.println("=");
    }
}//
