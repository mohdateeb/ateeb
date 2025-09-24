import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 1. Prime Number check
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }