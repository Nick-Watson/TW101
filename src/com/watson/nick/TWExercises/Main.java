package com.watson.nick.TWExercises;

public class Main {

    public static void main(String[] args) {
        Triangle one = new Triangle();
        System.out.println(one.drawAsterisk());
        System.out.println(one.drawHorizontalLine(3, "*"));
        System.out.println(one.drawVerticalLine(3));
        System.out.println(one.drawRightAngleTriangle(3));

        Diamond two = new Diamond();
        System.out.println(two.drawIsoscelesTriangle(3));
        System.out.println(two.drawDiamond(3));
        System.out.println(two.drawDiamondWithName(3, "Nick"));
    }
}
