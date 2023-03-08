package edu.java.array04;

import java.util.Random;

public class ArrayMain04 {

    public static void main(String[] args) {
        // 정수 5개를 저장할 수 있는 배열을 선언.
        int[] numbers = new int[5];
        
        // 0 이상 9 이하의 정수 난수 5개를 배열에 저장.
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        
        // 배열의 내용을 출력.
        for (int x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // 배열의 모든 원소의 합을 계산하고 출력.
        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i]; // sum = sum + numbers[i];
////            System.out.println("sum = " + sum);
//        }
        for (int x : numbers) {
            sum += x;
        }
        System.out.println("sum = " + sum);

        // 배열 원소들의 평균을 double 타입으로 계산하고 출력.
        double average = (double) sum / numbers.length;
        System.out.println("average = " + average);

    }

}
