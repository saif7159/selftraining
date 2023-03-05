package designpatterns.decorator;

import java.io.BufferedInputStream;

public class ClientDriver {
    public static void main(String... args) {
        Footballer footballer = new AwayJersey(null);
        footballer = new Nike(footballer);
        System.out.println(footballer.getDescription());
        BufferedInputStream inputStream;
    }
}
