package com.arfaouiKallebi.JournalWeb.dto;

import com.arfaouiKallebi.JournalWeb.model.Article;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.Optional;

@Builder
@Data
public class ArticleDTO {
    private Long id;
    private String title ;
    private String type  ;
    private Instant createdDate;


    public static ArticleDTO fromEntity(Article article) {

        return ArticleDTO.builder()
                .id(article.getId())
                .title(article.getTitle())
                .type(article.getType())
                .createdDate(article.getCreatedDate())
                .build();
    }

    public static Article toEntity(ArticleDTO articleDTO) {
        if (articleDTO == null) {
            return null;
        }
        Article article = new Article();
        article.setType(articleDTO.getType());
        article.setTitle(articleDTO.getTitle());
        return article;
    }


}
