package L07;

@FunctionalInterface
public interface Validator<T> {
    boolean isValid(T obj);
}
