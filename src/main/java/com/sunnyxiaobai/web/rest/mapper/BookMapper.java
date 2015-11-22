package com.sunnyxiaobai.web.rest.mapper;

import com.sunnyxiaobai.domain.*;
import com.sunnyxiaobai.web.rest.dto.BookDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Book and its DTO BookDTO.
 */
@Mapper(uses = {})
public interface BookMapper {

    BookDTO bookToBookDTO(Book book);

    Book bookDTOToBook(BookDTO bookDTO);
}
