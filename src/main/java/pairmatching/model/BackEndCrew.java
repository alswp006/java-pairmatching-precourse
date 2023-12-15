package pairmatching.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BackEndCrew extends Crew {
    public BackEndCrew(String level, String mission) throws IOException {
        super(Course.BACKEND, level, mission, backEndCrews());
    }

    public static List<String> backEndCrews() throws IOException {
        List<String> crewList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/backend-crew.md"));
        String name;
        while ((name = reader.readLine()) != null) {
            crewList.add(name);
        }
        reader.close();
        return crewList;
    }
}
