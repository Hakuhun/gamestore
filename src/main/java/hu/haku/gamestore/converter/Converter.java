package hu.haku.gamestore.converter;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public interface Converter<S,T> {
    T from(S source);
    S to(T target);

    default Collection<T> from(Collection<S> source){
        return source.stream().map(this::from).collect(Collectors.toCollection());
    };
    default Collection<S> to(Collection<T> target){
        return target.stream().map(this::to).collect(Collectors.toCollection());
    }
}
