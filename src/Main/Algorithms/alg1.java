package Main.Algorithms;

public class alg1 {

    public static void run(String num1, String num2) {

        //System.out.println("Give me first number!");
        //Scanner scanner = new Scanner(System.in);
        //String name1 = scanner.nextLine();
        String name1 = num1;
        String[] digits1 = name1.split("");

        //System.out.println("Give me second number!");
        //Scanner scanner2 = new Scanner(System.in);

        //String name2 = scanner2.nextLine();
        String name2 = num2;

        String[] digits2 = name2.split("");


        //int length1 = name1.length();
        //int length2 = name2.length();
        int length1 = digits1.length;
        int length2 = digits2.length;

        int[] result2 = new int[length1 + length2];

        for (int i = length2 - 1; i >= 0; i--) {
            int d1 = Integer.parseInt(digits2[i]);
            for (int j = length1 - 1; j >= 0; j--) {
                int d2 = Integer.parseInt(digits1[j]);
                int sum = result2[i + j + 1] + d1 * d2;
                result2[i + j + 1] = sum % 10;
                result2[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (k < result2.length && result2[k] == 0) k++;
        for (; k < result2.length; k++) sb.append(result2[k]);

        if (sb.length() == 0) {
            System.out.println("0");
        } else {
            System.out.println("output: \n"+sb.toString());
        }

        //scanner.close();
        //scanner2.close();
    }
}