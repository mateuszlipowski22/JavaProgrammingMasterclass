package section12.student_challenge.model;

import java.util.Comparator;

public class LPAStudentComparator implements Comparator<PLAStudent> {

    @Override
    public int compare(PLAStudent o1, PLAStudent o2) {
        return (int) (o1.getPercentageComplete()- o2.getPercentageComplete());
    }
}
