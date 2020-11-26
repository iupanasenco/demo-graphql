package com.iunona.graphql_playground.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;


@AllArgsConstructor
@NoArgsConstructor
public class Genre {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return name.equals(genre.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
