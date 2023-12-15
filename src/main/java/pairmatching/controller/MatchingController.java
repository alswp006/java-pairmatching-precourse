package pairmatching.controller;

import pairmatching.model.*;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MatchingController implements Controllable {
    InputView inputView = InputView.getInstance();
    OutputView outputView = OutputView.getInstance();

    @Override
    public void process(List<PairRepo> pairRepos) throws IOException {
        outputView.printMenu();
        List<String> input = inputView.inputOption();
        List<Set<String>> pairCrews = checkCourse(input);

        if (pairRepos.isEmpty()){
            pairRepos.add(new PairRepo(input, pairCrews));
            return;
        }

        for (int i = 0; i < pairRepos.size(); i++) {
            if (pairRepos.get(i).checkPair(input)) {
                if(askRePair()){
                    pairRepos.remove(i);
                    pairRepos.add(new PairRepo(input, pairCrews));
                }
                break;
            }
            if (i == pairRepos.size()-1){
                pairRepos.add(new PairRepo(input, pairCrews));
            }
        }
    }

    private List<Set<String>> checkCourse(List<String> input) throws IOException {
        Crew crew;
        List<Set<String>> pairCrews = new ArrayList<>();

        if (input.get(0).equals("벡앤드")) {
            crew = new BackEndCrew(input.get(1), input.get(2));
            pairCrews = crew.getPairCrews();
        }
        if (input.get(0).equals("프론트앤드")) {
            crew = new FrontEndCrew(input.get(1), input.get(2));
            pairCrews = crew.getPairCrews();
        }

        return pairCrews;
    }

    private boolean askRePair() {
        String rePair = inputView.inputRePairing();

        return rePair.equals("네");
    }
}
