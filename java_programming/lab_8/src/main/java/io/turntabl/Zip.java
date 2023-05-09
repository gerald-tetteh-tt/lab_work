package io.turntabl;

import java.util.List;

@FunctionalInterface
public interface Zip<T> {
    List<T> apply(T a, T b);
}
