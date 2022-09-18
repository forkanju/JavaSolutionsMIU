package forkan;

public class Problem13 {

    public static void main(String[] args) {
        System.out.println(expressedAsSumOfTwoSquares(50));
    }

    static String expressedAsSumOfTwoSquares(int n) {
        for (int i = 1; i <= n/4; i++){
            for (int j = 1; j <= n/4; j++) {
                if (n == i * i + j * j)//2,5,10,17,//5,8,13,20
                    return n + " = " + i + "^2 + " + j + "^2";
            }
        }
        return n + " cannot be expressed as a sum of two squares";
    }
}

/*Question 13
Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
Thus 50 can be expressed as a sum of the two squares in two different ways.
Write a method whether or not a positive integer n can be expressed as a sum of two squares in
exactly two different ways.
The signature of the function is
int answerOne(int n)*/
