package pairmatching.view;

import java.util.List;
import java.util.Set;

public enum OutputView {
    INSTANCE;

    public static OutputView getInstance(){
        return INSTANCE;
    }

    public void printMenu(){
        System.out.println("#############################################");
        System.out.println("과정: 백엔드 | 프론트엔드");
        System.out.println("미션:");
        System.out.println("  - 레벨1: 자동차경주 | 로또 | 숫자야구게임");
        System.out.println("  - 레벨2: 장바구니 | 결제 | 지하철노선도");
        System.out.println("  - 레벨3: ");
        System.out.println("  - 레벨4: 성능개선 | 배포");
        System.out.println("  - 레벨5: ");
        System.out.println("############################################");
    }

    public void printList(List<Set<String>> pairCrews){
        pairCrews.forEach(crews -> System.out.println(String.join(" : ", crews)));
    }

    public void printInitMessage(){
        System.out.println("초기화 되었습니다.");
    }

}