package com.company;

public class Point{

    //fields
    private static int innerID = 0;
    private int x, y;
    private int id;

    //get-set
    public int[] getPoints() {
        int[] points = new int[2];
        points[0] = x;
        points[1] = x;
        return points;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Constructors
    public Point(){
        this.id = innerID++;
    }

    public Point(int x, int y){
        this.setPoint(x , y);
    }

    //Methods
    public double findDistance(Point a){
        double height = Math.abs(a.getX() - x);
        double width = Math.abs(a.getY() - y);
        return Math.sqrt((height*height)+(width*width));
    }
}
