package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(toBreakWith > numberToGoUntil) System.out.println("iterating till the end");
        int range = toBreakWith > numberToGoUntil ? numberToGoUntil : toBreakWith;
        for(int i = 1; i <= range; i++) System.out.println(i);
    }
}
