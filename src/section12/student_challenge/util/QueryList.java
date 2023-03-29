package section12.student_challenge.util;

import section12.student_challenge.model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends Student & QueryItem> extends ArrayList<T>{

    public QueryList() {
    }

    public QueryList(List<T> items) {
        super(items);
    }

    public static <S extends QueryItem> List<S> getMatches(List<S> items, String field, String value){
        List<S> matches = new ArrayList<>();
        items.forEach(item->{
            if(item.matchFieldValue(field, value)){
                matches.add(item);
            }
        });
        return matches;
    }

    public QueryList<T> getMatches(String field, String value){
        QueryList<T> matches = new QueryList<>();
        this.forEach(item->{
            if(item.matchFieldValue(field, value)){
                matches.add(item);
            }
        });
        return matches;
    }
}
