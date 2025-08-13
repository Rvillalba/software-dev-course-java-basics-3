package org.example;

public class LoopExercises {
    public int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public int sumUntilEven(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n ){
            sum += i;
            if (sum % 2 == 0){
                return sum;
            }
            i++;
        }// Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        return sum;
    }
}
