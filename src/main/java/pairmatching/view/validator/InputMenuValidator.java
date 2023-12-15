package pairmatching.view.validator;

import pairmatching.util.Error;

import java.util.Arrays;
import java.util.List;

public class InputMenuValidator implements Validator {
    private final List<String> menus = Arrays.asList("1", "2", "3", "Q");

    @Override
    public void validate(String input) {
        checkMenu(input);
    }

    private void checkMenu(String input) {
        if (!menus.contains(input)){
            Error.throwError("목록에 있는 문자만 입력해주세요.");
        }
    }
}
