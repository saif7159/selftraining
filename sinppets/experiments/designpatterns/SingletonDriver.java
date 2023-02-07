package designpatterns;

public class SingletonDriver {
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.initializeSingleton();
        singletonPattern.setAge(25);
        SingletonPattern singletonPattern2 = SingletonPattern.initializeSingleton();
        singletonPattern.setAge(singletonPattern2.getAge() + 5);
        System.out.println(singletonPattern2.getAge());

        BuilderPattern builderPattern = new BuilderPattern.CarBuilder(4, "6 cylineder", "daksg7").setAWD(true)
                .setDiff(false).build();
        System.out.print(builderPattern.toString());
    }
}
