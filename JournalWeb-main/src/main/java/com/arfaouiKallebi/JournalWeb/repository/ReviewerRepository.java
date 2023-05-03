package com.arfaouiKallebi.JournalWeb.repository;

import com.arfaouiKallebi.JournalWeb.model.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ReviewerRepository extends JpaRepository<Reviewer,Long > {
    @Query(value = "delete  from Reviewer a where a.id =:id")
    Reviewer deleteReviewerById(Long id);
}
