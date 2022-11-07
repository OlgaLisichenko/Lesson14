@FunctionalInterface
public interface ToStringFunction<T> {

    String apply(T value);
}