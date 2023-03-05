package designpatterns.decorator;

public class Adidas implements Boots {

    Footballer boots;

    public Adidas(Footballer boots) {
        this.boots = boots;
    }

    @Override
    public String getDescription() {
        return boots.getDescription() + "I'm wearing f50 adidas";
    }

}
