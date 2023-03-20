package edu.java.inheritance06;

import java.util.Objects;

public class Point {
    // 필드
    private int x;
    private int y;

    // 생성자: (1) 기본 생성자, (2) argument가 2개인 생성자.
    public Point() {}
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // getters & setters
    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    // toString override: "Point(x=0, y=0)"
    @Override
    public String toString() {
//        return "Point(x=" + this.x + ", y=" + this.y + ")";
        String s = String.format("Point(x=%d, y=%d)", this.x, this.y);
        return s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass()) // 클래스 이름이 다르면
            return false;
        // 클래스 이름이 같으면 -> casting 할 수 있음.
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }
    
}
