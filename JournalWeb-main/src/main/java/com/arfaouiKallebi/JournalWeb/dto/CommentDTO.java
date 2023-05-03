package com.arfaouiKallebi.JournalWeb.dto;

import com.arfaouiKallebi.JournalWeb.model.Comment;
import com.arfaouiKallebi.JournalWeb.model.Manuscript;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class CommentDTO {

    private Long id;
    private String title ;
    private String content ;
    private Instant createdDate ;
    private ManuscriptDTO manuscript ;

    public static CommentDTO fromEntity(Comment comment) {
        if (comment == null) {
            return null ;
        }
        return CommentDTO.builder()
                .id(comment.getId())
                .title(comment.getTitle())
                .content(comment.getContent())
                .manuscript(ManuscriptDTO.fromEntity(comment.getManuscript()))
                .createdDate(comment.getCreatedDate())
                .build();
    }
    public static Comment toEntity(CommentDTO commentDTO) {
        if (commentDTO == null) {
            return null ;
        }
        Comment comment = new Comment() ;
        comment.setContent(commentDTO.getContent());
        comment.setTitle(commentDTO.getTitle());
        comment.setManuscript(ManuscriptDTO.toEntity(commentDTO.getManuscript() ));
        return comment ;

    }
}
