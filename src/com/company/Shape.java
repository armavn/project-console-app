package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Shape {

    ArrayList<Point> points;

    public Shape(ArrayList<Point> points) {
        setPoints(points);
    }

    public Shape(){
        points = new ArrayList<>();
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public double longestSide(){
        if (points.size() == 0 || points.size() == 1) {return -1;}

        double longest = 0;

        for(int i = 0; i < points.size(); i++){
            double distance = 0;
            if(i == points.size()-1) {
                distance = points.get(i).findDistance(points.get(0));
            }
            else {
                distance = points.get(i).findDistance(points.get(1 + i));
            }
            if (distance > longest) longest = distance;
        }

        return longest;
    }

    public double avarageSide(){

        if ((points.size() == 0) || (points.size() == 1)) return -1;

        double avarage = 0;

        for(int i = 0; i < points.size(); i++){
            double distance = 0;
            if(i == points.size()-1) {
                distance = points.get(i).findDistance(points.get(0));
            }
            else {
                distance = points.get(i).findDistance(points.get(1 + i));
            }
            avarage += distance;
        }

        return avarage/points.size();
    }

    public double perimeter(){

        if ((points.size() == 0) || (points.size() == 1)) return -1;

        double perimeter = 0;

        for(int i = 0; i < points.size(); i++){
            double distance = 0;
            if(i == points.size()-1) {
                distance = points.get(i).findDistance(points.get(0));
            }
            else {
                distance = points.get(i).findDistance(points.get(1 + i));
            }
            perimeter += distance;
        }

        return perimeter;
    }


}
