package com.arfaouiKallebi.JournalWeb.repository;

import com.arfaouiKallebi.JournalWeb.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends JpaRepository<Comment , Long> {
    @Query(value = "delete  from Comment a where a.id =:id")
    Comment deleteCommentById(Long id);
}
