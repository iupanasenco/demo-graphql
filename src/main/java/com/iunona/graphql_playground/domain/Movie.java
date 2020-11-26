package com.iunona.graphql_playground.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.bson.Document;
import org.bson.types.ObjectId;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {

    private static final long serialVersionUID = 1234567L;

    @Id
    private ObjectId _id;

    private String title;

    private Integer year;

    private Genre genre;

    public Movie(ObjectId _id, String title, Integer year) {
        this._id = _id;
        this.title = title;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return title.equals(movie.title) &&
                Objects.equals(year, movie.year) &&
                Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, genre);
    }
}
