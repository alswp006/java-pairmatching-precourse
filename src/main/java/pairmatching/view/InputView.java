package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.view.validator.InputMenuValidator;
import pairmatching.view.validator.InputOptionValidator;
import pairmatching.view.validator.Validator;

import java.util.Arrays;
import java.util.List;

public enum InputView {
    INSTANCE;

    public static InputView getInstance(){
        return INSTANCE;
    }

    public String inputMenu(){
        System.out.println("기능을 선택하세요.");
        System.out.println("1. 페어 매칭.");
        System.out.println("2. 페어 조회");
        System.out.println("3. 페어 초기화");
        System.out.println("Q. 종료");

        Validator validator = new InputMenuValidator();
        String input = Console.readLine();

        validator.validate(input);

        return input;
    }

    public List<String> inputOption(){
        System.out.println("과정, 레벨, 미션을 선택하세요.");
        System.out.println("ex) 벡앤드, 레벨1, 자동차경주");

        Validator inputOptionValidator = new InputOptionValidator();
        String input = Console.readLine();

        inputOptionValidator.validate(input);

        return Arrays.asList(input.split(", "));
    }

    public String inputRePairing(){
        System.out.println("매칭 정보가 있습니다. 다시 매칭하시겠습니까?");
        String input = Console.readLine();

        return input;
    }
}
