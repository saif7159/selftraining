package designpatterns.decorator;

public class HomeJersey implements Jersey {

    Footballer jersey;

    public HomeJersey(Footballer jersey) {
        this.jersey = jersey;
    }

    @Override
    public String getDescription() {
        return jersey.getDescription() + "Im wearing all white home jersey";
    }

}
