package pairmatching.model;

import java.util.List;
import java.util.Set;

public class PairRepo {
    List<String> option;
    List<Set<String>> crews;

    public PairRepo(List<String> option, List<Set<String>> crews) {
        this.option = option;
        this.crews = crews;
    }

    public boolean checkPair(List<String> option) {
        return this.option.equals(option);
    }

    public List<Set<String>> getCrews() {
        return crews;
    }
}
