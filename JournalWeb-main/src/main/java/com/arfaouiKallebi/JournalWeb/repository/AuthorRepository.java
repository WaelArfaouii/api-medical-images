package com.arfaouiKallebi.JournalWeb.repository;

import com.arfaouiKallebi.JournalWeb.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author,Long > {
    @Query(value = "delete  from Author a where a.id =:id")
    Author deleteAuthorById(Long id);
}
