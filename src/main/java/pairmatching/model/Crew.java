package pairmatching.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Crew {
    Course course;
    String level;
    String mission;
    List<String> crews;

    Crew(Course course, String level, String mission, List<String> crews) {
        this.course = course;
        this.level = level;
        this.mission = mission;
        this.crews = crews;
    }

    public List<Set<String>> getPairCrews() {
        List<String> shuffledCrew = Randoms.shuffle(crews);
        List<Set<String>> pairCrews = new ArrayList<>();

        while (!shuffledCrew.isEmpty()) {
            String temp1 = shuffledCrew.remove(0);
            String temp2 = shuffledCrew.remove(0);
            pairCrews.add(Stream.of(temp1, temp2).collect(Collectors.toSet()));

            if (shuffledCrew.size() == 1) {
                pairCrews.get(pairCrews.size() - 1).add(shuffledCrew.remove(0));
            }
        }

        return pairCrews;
    }
}
