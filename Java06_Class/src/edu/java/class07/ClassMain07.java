package edu.java.class07;

public class ClassMain07 {

    public static void main(String[] args) {
        // 기본 생성자를 사용해서 Score 객체 생성.
        Score score1 = new Score();
        System.out.println(score1);
        score1.printScore();

        // argument를 갖는 생성자를 호출해서 Score 객체를 생성.
        Score score2 = new Score(100, 90, 94);
        System.out.println(score2);
        score2.printScore();
        System.out.println("score2 총점: " + score2.getTotal());
        System.out.println("score2 평균: " + score2.getAverage());
        
    }

}
