package xyz.ieden.example.mapstruct.bo;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import xyz.ieden.example.mapstruct.entity.BookEntity;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/5/21 14:45
 */
@Mapper
public interface BookMapper {

    BookBO entityToBO(BookEntity bookEntity);

    @InheritConfiguration
    BookBO fromBook(BookEntity bookEntity);
}
