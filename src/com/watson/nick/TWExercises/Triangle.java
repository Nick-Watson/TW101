package com.watson.nick.TWExercises;

public class Triangle {
    public String drawAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(int n, String value) {
        int length = 0;
        String line = "";
        while (length < n) {
            line = line + value;
            length++;
        }

        return line;
    }

    public String drawVerticalLine(int n) {
        if (n < 1) return "";
        int height = 1;
        String line = "";
        while (height < n) {
            line = line + drawAsterisk() + "\n";
            height++;
        }

        return line + drawAsterisk();
    }

    public String drawRightAngleTriangle(int n) {
        if (n < 1) return "";
        int height = 1;
        String triangle = "";
        while (height < n) {
            triangle = triangle + drawHorizontalLine(height, drawAsterisk()) + "\n";
            height++;
        }

        return triangle + drawHorizontalLine(n, drawAsterisk());
    }
}
