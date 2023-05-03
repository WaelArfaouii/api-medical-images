package com.arfaouiKallebi.JournalWeb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "comment")
public class Comment extends AbstractEntity{
    @Column(name = "title")
    private String title ;
    @Column(name = "content")
    private String content ;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_manuscript")
    private Manuscript manuscript ;


}
