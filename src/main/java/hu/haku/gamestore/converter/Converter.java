package hu.haku.gamestore.converter;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Converter<S,T> {
    T from(S source);
    S to(T target);

    Collection<T> from(Collection<S> source);
    Collection<S> to(Collection<T> target);
}
