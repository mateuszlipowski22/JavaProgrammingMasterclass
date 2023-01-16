package section11.interface_challenge;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}
