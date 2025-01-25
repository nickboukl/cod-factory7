package gr.aueb.cf.ch14.model;

import gr.aueb.cf.ch14.services.HelloUtil;
import gr.aueb.cf.ch14.services.Point;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1, "Ath.", "Androutsos");
        Teacher teacher2 = new Teacher(3, "A.", "Giannoutsou");
        Teacher teacher3 = new Teacher (3, "C.", "Ppadopoulos");


        HelloUtil.sayHello();

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();




    }

}
