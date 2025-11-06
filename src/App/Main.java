package App;

import Algorithms.alg1;
import Algorithms.alg2;

public class Main {
    public static void main(String[] args) {
        //System.out.println(args[1]);

        String algorithm = args[0];
        String num1 = args[1];
        String num2 = args[2];

        RunAlgorithm(algorithm, num1, num2);
    }

    public static void RunAlgorithm(String Algorithm, String num1, String num2) {
        switch (Algorithm) {
            case "--alg1":
                alg1.run(num1, num2);
                break;
            case "--alg2":
                alg2.run(num1, num2);
                break;
            default:
                System.out.println("Unknown Algorithm: " + Algorithm);
                break;
        }
    }
}

