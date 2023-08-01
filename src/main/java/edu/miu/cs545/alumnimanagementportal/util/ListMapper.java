package edu.miu.cs545.alumnimanagementportal.util;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ListMapper<T, E> {

    private final ModelMapper mapper;

    public List<?> mapList(List<T> list, E convertTo){
        return list.stream().map(e -> mapper.map(e, convertTo.getClass()))
                .collect(Collectors.toList());
    }
}
