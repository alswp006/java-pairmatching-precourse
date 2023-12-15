package pairmatching.controller;

import pairmatching.model.PairRepo;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.List;

public class InquiryController implements Controllable{
    @Override
    public void process(List<PairRepo> pairRepos) {
        InputView inputView = InputView.getInstance();
        OutputView outputView = OutputView.getInstance();
        outputView.printMenu();
        List<String> input = inputView.inputOption();

        for (PairRepo pairRepo : pairRepos){
            if (pairRepo.checkPair(input)){
                outputView.printList(pairRepo.getCrews());
                return;
            }
        }
        System.out.println("없음");
    }
}
