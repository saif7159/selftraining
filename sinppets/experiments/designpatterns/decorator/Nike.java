package designpatterns.decorator;

public class Nike implements Boots {

    Footballer boots;

    public Nike(Footballer boots) {
        this.boots = boots;
    }

    @Override
    public String getDescription() {
        return boots.getDescription() + "I'm wearing nike mercurial boots";
    }

}
