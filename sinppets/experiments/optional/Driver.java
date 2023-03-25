package optional;

public class Driver {
    public static void main(String[] args) {
        OptionalPatterns<String> optionalPatterns = new OptionalPatterns<>();
        optionalPatterns.setName();
        String s = (String) optionalPatterns.genericMethod("optionalPatterns", "Loves", "Rajji Poo").orElseThrow();
        OptionalPatterns.nest1 = new OptionalPatterns.Nest1(new OptionalPatterns.Nest1.Nest2(new OptionalPatterns.Nest1.Nest2.Nest3()));
        optionalPatterns.getNest1().stream().flatMap(nest1 -> nest1.getNest2().stream()).flatMap(nest2 -> nest2.getNest2().stream()).map(n -> OptionalPatterns.Nest1.Nest2.Nest3.STR).forEach(System.out::println);
        System.out.println(s);
    }
}
