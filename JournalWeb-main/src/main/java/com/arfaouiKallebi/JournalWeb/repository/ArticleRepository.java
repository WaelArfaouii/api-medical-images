package com.arfaouiKallebi.JournalWeb.repository;

import com.arfaouiKallebi.JournalWeb.model.Article;
import com.arfaouiKallebi.JournalWeb.model.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends JpaRepository<Article,Long > {

    @Query(value = "delete  from Article a where a.id =:id")
    Article deleteArticleById(Long id);
}
