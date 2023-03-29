package section12.generic_extras.util;

import section12.generic_extras.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Student & QueryItem>{

    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
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

    public List<T> getMatches(String field, String value){
        List<T> matches = new ArrayList<>();
        items.forEach(item->{
            if(item.matchFieldValue(field, value)){
                matches.add(item);
            }
        });
        return matches;
    }
}
