package ch03;

import java.util.Scanner;

/**
 * 정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력하시오.
 */
public class Ex_1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int d = 0;


        if(a>b) {
            c = a - b;
            System.out.println(c);
        }else if(a<b) {
            d = b - a;
            System.out.println(d);
        } else System.out.println("0");
    }
}
