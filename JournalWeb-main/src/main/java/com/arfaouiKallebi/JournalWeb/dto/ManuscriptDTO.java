package com.arfaouiKallebi.JournalWeb.dto;

import com.arfaouiKallebi.JournalWeb.model.Author;
import com.arfaouiKallebi.JournalWeb.model.Comment;
import com.arfaouiKallebi.JournalWeb.model.Item;
import com.arfaouiKallebi.JournalWeb.model.Manuscript;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class ManuscriptDTO {
    private Long id ;
    private String title ;
    private List<String> keywords ;
    @JsonIgnore
    private List<CommentDTO> comments ;
    @JsonIgnore
    private List<ItemDTO> items ;
    @JsonIgnore
    private List<AuthorDTO> authors ;
    private String status ;

    public static ManuscriptDTO fromEntity( Manuscript manuscript) {
        if (manuscript == null) {
            return null;
        }
        return ManuscriptDTO.builder()
                .id(manuscript.getId())
                .keywords(manuscript.getKeywords())
                .title(manuscript.getTitle())
                .status(manuscript.getStatus())
                .build() ;

    }
    public static Manuscript toEntity(ManuscriptDTO manuscriptDTO) {
        if(manuscriptDTO == null){
            return null ;
        }
        Manuscript manuscript = new Manuscript() ;
        manuscript.setTitle(manuscriptDTO.getTitle());
        if ((manuscriptDTO.status == null)) {
            manuscript.setStatus("processed");
        } else {
            manuscript.setStatus(manuscriptDTO.status);
        }
        manuscript.setKeywords(manuscriptDTO.getKeywords());
        return manuscript ;
    }

}
