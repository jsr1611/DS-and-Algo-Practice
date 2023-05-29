package ProjectEuler;

public class SumOfMultiplesOf35 {
    public static void main(String[] args) {
        System.out.println(solution(1000));
    }

    private static int solution(int exclusive_limit) {
        int inclusive_limit = exclusive_limit - 1;
        if(inclusive_limit < 3) return 0;

        return sumOfDivisibles(3, inclusive_limit) + sumOfDivisibles(5, inclusive_limit) - sumOfDivisibles(15, inclusive_limit);
    }

    private static int sumOfDivisibles(int divisor, int inclusive_limit) {
        int countOfDivisibles = inclusive_limit / divisor;
        int biggestDivisible = countOfDivisibles * divisor;
        return sumOfArithmeticProgression(divisor, biggestDivisible, countOfDivisibles);
    }

    private static int sumOfArithmeticProgression(int divisor, int biggestDivisible, int countOfDivisibles) {
        return (countOfDivisibles * (divisor + biggestDivisible)) / 2;
    }


}
