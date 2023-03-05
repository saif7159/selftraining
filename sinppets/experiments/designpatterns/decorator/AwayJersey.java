package designpatterns.decorator;

public class AwayJersey implements Jersey {

    Footballer jersey;

    public AwayJersey(Jersey jersey) {
        this.jersey = jersey;
    }

    @Override
    public String getDescription() {
        return "I'm wearing all black away jersey";
    }

}
