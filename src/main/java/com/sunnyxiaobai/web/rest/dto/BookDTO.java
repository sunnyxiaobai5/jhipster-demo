package com.sunnyxiaobai.web.rest.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Book entity.
 */
public class BookDTO implements Serializable {

    private Long id;

    private String name;

    private Integer price;

    private Integer page;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BookDTO bookDTO = (BookDTO) o;

        if ( ! Objects.equals(id, bookDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", price='" + price + "'" +
                ", page='" + page + "'" +
                '}';
    }
}
