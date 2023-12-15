package pairmatching.controller;

import pairmatching.model.PairRepo;
import pairmatching.view.InputView;

import java.io.IOException;
import java.util.*;

public class Controller {
    private final InputView inputView = InputView.getInstance();
    Map<String, Controllable> controllers = new HashMap<>();
    List<PairRepo> pairRepos = new ArrayList<>();

    public Controller(){
        controllers.put("1", new MatchingController());
        controllers.put("2", new InquiryController());
        controllers.put("3", new InitController());
        controllers.put("Q", new EndControllable());
    }

    public void run() throws IOException {
        String menu = "0";
        while (!menu.equals("Q")){
            menu = inputView.inputMenu();
            service(menu);
        }
    }

    public void service(String input) throws IOException {
        Controllable controllable = controllers.get(input);
        controllable.process(pairRepos);
    }
}
