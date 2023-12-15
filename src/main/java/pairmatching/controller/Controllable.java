package pairmatching.controller;

import pairmatching.model.PairRepo;

import java.io.IOException;
import java.util.List;

public interface Controllable {
    void process(List<PairRepo> pairRepos) throws IOException;
}
