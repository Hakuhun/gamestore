package hu.haku.gamestore.persistence.converter;

import hu.haku.gamestore.converter.Converter;
import hu.haku.gamestore.model.business.BQueryTag;
import hu.haku.gamestore.persistence.model.JPAQueryTag;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class JPAQueryTagConverter implements Converter<JPAQueryTag, BQueryTag> {

    private final ModelMapper mapper;

    public JPAQueryTag to(BQueryTag source) {
        if (null == source) {
            return null;
        }
        return mapper.map(source, JPAQueryTag.class);
    }

    @Override
    public Collection<JPAQueryTag> to(Collection<BQueryTag> target) {
        if (CollectionUtils.isEmpty(target)) {
            return null;
        }
        return target.stream().map(this::to).collect(Collectors.toSet());
    }

    public BQueryTag from(JPAQueryTag source) {
        if (null == source) {
            return null;
        }
        return mapper.map(source, BQueryTag.class);
    }

    @Override
    public Collection<BQueryTag> from(Collection<JPAQueryTag> source) {
        if (CollectionUtils.isEmpty(source)) {
            return null;
        }
        return source.stream().map(this::from).collect(Collectors.toList());
    }

}
