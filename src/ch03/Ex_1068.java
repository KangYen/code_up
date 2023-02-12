package ch03;

import java.util.Scanner;

/**
 * 정수 1개 입력받아 평가 출력하기
 */
public class Ex_1068 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 40) {
            grade = 'C';
        } else
            grade = 'D';

            System.out.println(grade);

    }
}