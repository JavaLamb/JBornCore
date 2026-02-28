package L07;

import java.util.List;
@FunctionalInterface
public interface Converter<IN, OUT> {
    OUT converter(IN in);
}
