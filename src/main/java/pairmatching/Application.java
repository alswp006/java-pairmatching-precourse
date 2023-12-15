package pairmatching;

import pairmatching.controller.Controller;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        Controller controller = new Controller();
        try {
            controller.run();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
