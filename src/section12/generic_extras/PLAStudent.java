package section12.generic_extras;

public class PLAStudent extends Student{

    private double percentageComplete;

    public PLAStudent() {
        this.percentageComplete = random.nextDouble(100);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(),percentageComplete);
    }

    public double getPercentageComplete() {
        return percentageComplete;
    }
}
