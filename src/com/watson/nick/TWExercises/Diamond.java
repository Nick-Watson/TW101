package com.watson.nick.TWExercises;

public class Diamond extends Triangle {
    public String drawIsoscelesTriangle (int n) {
       String triangle = "";
       int height = 1;
       while (height < n) {
            triangle =
                    triangle
                    + drawHorizontalLine((n - height), " ")
                    + drawHorizontalLine((height * 2) - 1, drawAsterisk())
                    + drawHorizontalLine((n - height), " ")
                    + "\n";
            height++;
       }

       return triangle + drawHorizontalLine((n * 2) - 1, drawAsterisk());
    }

    private String removeLastRow(String triangle, int n) {
        return triangle.substring(0, (triangle.length() - (n*2)));
    }

    public String drawDiamond (int n) {
        return  removeLastRow(drawIsoscelesTriangle(n), n)
                + "\n"
                + new StringBuilder(drawIsoscelesTriangle(n)).reverse().toString();
    }

    public String drawDiamondWithName (int n, String name) {
        return  removeLastRow(drawIsoscelesTriangle(n), n)
                + "\n"
                + name
                + "\n"
                + new StringBuilder(removeLastRow(drawIsoscelesTriangle(n), n)).reverse().toString();
    }
}
