package hu.haku.gamestore.persistence.converter;

import hu.haku.gamestore.converter.Converter;
import hu.haku.gamestore.model.business.BPrice;
import hu.haku.gamestore.persistence.model.JPAPrice;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class JPAPriceConverter implements Converter<JPAPrice, BPrice> {

    private final ModelMapper mapper;

    public JPAPrice to(BPrice source) {
        if (null == source) {
            return null;
        }

        return mapper.map(source, JPAPrice.class);
    }

    @Override
    public Collection<JPAPrice> to(Collection<BPrice> target) {
        if (CollectionUtils.isEmpty(target)) {
            return null;
        }
        return target.stream().map(this::to).collect(Collectors.toSet());
    }


    public BPrice from(JPAPrice source) {
        if (null == source) {
            return null;
        }

        return mapper.map(source, BPrice.class);
    }

    @Override
    public Collection<BPrice> from(Collection<JPAPrice> source) {
        if (CollectionUtils.isEmpty(source)) {
            return Collections.emptyList();
        }
        return source.stream().map(this::from).collect(Collectors.toList());
    }
}
