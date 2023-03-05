package designpatterns.decorator;

public interface Footballer {
    final String footballer = "Im a professional footballer";

    String getDescription();

    default String getFootballerDescription() {
        return footballer + ", ";
    }
}
