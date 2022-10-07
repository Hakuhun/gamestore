//package hu.haku.gamestore.persistence.converter;
//
//import hu.haku.gamestore.converter.Converter;
//import hu.haku.gamestore.model.business.BQueryTag;
//import hu.haku.gamestore.model.business.BRestriction;
//import hu.haku.gamestore.persistence.model.JPAQueryTag;
//import hu.haku.gamestore.persistence.model.JPARestriction;
//import lombok.RequiredArgsConstructor;
//import org.modelmapper.ModelMapper;
//import org.springframework.stereotype.Component;
//import org.springframework.util.CollectionUtils;
//
//import java.util.Collection;
//import java.util.stream.Collectors;
//
//@Component
//@RequiredArgsConstructor
//public class JPARestrictionConverter implements Converter<JPARestriction, BRestriction> {
//    private final ModelMapper mapper;
//
//    @Override
//    public JPARestriction to(BRestriction source) {
//        if (null == source) {
//            return null;
//        }
//        return mapper.map(source, JPARestriction.class);
//    }
//
//
//    @Override
//    public Collection<JPARestriction> to(Collection<BRestriction> target) {
//        if (CollectionUtils.isEmpty(target)) {
//            return null;
//        }
//
//        return target.stream().map(this::to).collect(Collectors.toSet());
//    }
//
//    @Override
//    public BRestriction from(JPARestriction source) {
//        if (null == source) {
//            return null;
//        }
//        return mapper.map(source, BRestriction.class);
//    }
//
//    @Override
//    public Collection<BRestriction> from(Collection<JPARestriction> source) {
//        if (CollectionUtils.isEmpty(source)) {
//            return null;
//        }
//        return source.stream().map(this::from).collect(Collectors.toList());
//    }
//}
