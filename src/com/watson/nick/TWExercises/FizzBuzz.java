package com.watson.nick.TWExercises;

public class FizzBuzz {
    public String fizzBuzz() {
        int count = 1;
        String output = "";
        while (count <= 100) {
            if (count % 3 == 0 && count % 5 == 0) output = output + "FizzBuzz\n";
            else if (count % 5 == 0) output = output + "Buzz\n";
            else if (count % 3 == 0) output = output + "Fizz\n";
            else output = output + count + "\n";

            count++;
        }

        return output.substring(0, output.length() - 1);
    }
}
