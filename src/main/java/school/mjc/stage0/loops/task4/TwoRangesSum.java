package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        }else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }else {
            System.out.println("skipped sum is " + numberToSkip * (numberToSkip + 1) / 2);
            int sum = lastInRow * (lastInRow + 1) / 2;
            System.out.println("counted sum is " + (sum - numberToSkip * (numberToSkip + 1) / 2));
        }
        for (;;){
            break;
        }
        for (;;){
            break;
        }
    }
}
