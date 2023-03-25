package optional;

import java.util.Optional;
import java.util.StringJoiner;

public class OptionalPatterns<T> {
    private String name;
    public static Nest1 nest1;

    // use as a return type of method
    // cant use static with returning generic type t
    public <K, V> Optional<T> checkNullValue(T param, K key, V val) {
        return Optional.ofNullable(param);
    }

    public Optional<Nest1> getNest1() {
        return Optional.of(this.nest1);
    }


    static class Nest1 {
        public static final String STR = "Im nest 1";

        public Nest1(Nest2 nest2) {
            this.nest2 = Optional.of(nest2);
        }

        private Optional<Nest2> nest2;

        public Optional<Nest2> getNest2() {
            return this.nest2;
        }

        static class Nest2 {
            public static final String STR = "Im nest 2";
            private Optional<Nest3> nest3;

            public Nest2(Nest3 nest3) {
                this.nest3 = Optional.of(nest3);
            }

            public Optional<Nest3> getNest2() {
                return this.nest3;
            }

            static class Nest3 {
                public static final String STR = "Im nest 3";
            }
        }
    }

    public <S, U, V> Optional<?> genericMethod(S s1, U s2, V s3) {
        if (s1 instanceof String && s2 instanceof String && s3 instanceof String)
            return Optional.ofNullable(new StringJoiner(",", "[", "]").add((String) s1).add((String) s2).add((String) s3).toString());
        else
            return Optional.empty();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        this.name = "Joe";
    }
}
