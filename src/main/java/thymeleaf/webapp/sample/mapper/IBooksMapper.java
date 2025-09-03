package thymeleaf.webapp.sample.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import thymeleaf.webapp.sample.model.db.BooksEntity;
import thymeleaf.webapp.sample.model.dto.BooksDTO;

@Mapper(config = ICustomMapperConfig.class)
public interface IBooksMapper {

    IBooksMapper INSTANCE = Mappers.getMapper(IBooksMapper.class);

    BooksEntity mapEntity(BooksDTO obj);

    List<BooksEntity> mapEntities(List<BooksDTO> obj);

    BooksDTO mapDTO(BooksEntity obj);

    List<BooksDTO> mapDTOs(List<BooksEntity> obj);
}
