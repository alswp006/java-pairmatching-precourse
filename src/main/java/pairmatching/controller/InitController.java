package pairmatching.controller;

import pairmatching.model.PairRepo;
import pairmatching.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class InitController implements Controllable{
    OutputView outputView = OutputView.getInstance();
    @Override
    public void process(List<PairRepo> pairRepos) {
        pairRepos.clear();
        outputView.printInitMessage();
    }
}
