package ch03;

import java.util.Scanner;

/**
 * 정수 1개 입력받아 분석하기
 */
public class Ex_1067 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a>0) {
            System.out.println("plus");
            if(a%2==0) {
                System.out.println("even");
            } else System.out.println("odd");
        }

        else if(a<0) {
            System.out.println("minus");
            if(a%2==0) {
                System.out.println("even");
            } else System.out.println("odd");
        }
    }
}
