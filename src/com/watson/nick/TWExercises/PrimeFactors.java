package com.watson.nick.TWExercises;

public class PrimeFactors {

    private boolean isPrime(int n) {
        if(n > 2 && (n & 1) == 0) return false;
        for(int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public String generate(int i) {
        if (i < 2) return "";
        String output = "";
        int count = 2;
        while (count <= i) {
            if (isPrime(count) && i % count == 0) output = output + count + ",";
            count ++;
        }

        return output.substring(0, output.length() - 1);
    }
}
