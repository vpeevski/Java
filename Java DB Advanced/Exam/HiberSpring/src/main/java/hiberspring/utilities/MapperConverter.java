package hiberspring.utilities;

import hiberspring.io.Writer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Hristo Skipernov on 27/07/2017.
 */

@Component
public class MapperConverter {

    private ModelMapper modelMapper;
    private final Writer writer;

    @Autowired
    public MapperConverter(Writer writer) {
        this.writer = writer;
        this.modelMapper = new ModelMapper();
    }

    public <S, D> D convert(S source, Class<D> destinationClass) {
        return this.modelMapper.map(source, destinationClass);
    }
}