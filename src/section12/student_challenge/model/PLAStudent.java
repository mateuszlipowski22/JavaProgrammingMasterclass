package section12.student_challenge.model;

public class PLAStudent extends Student {

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

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if(!fieldName.equalsIgnoreCase("percentageComplete")){
            return super.matchFieldValue(fieldName, value);
        }else {
            return percentageComplete<=(Integer.parseInt(value));
        }
    }
}
