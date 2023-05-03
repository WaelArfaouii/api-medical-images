package com.arfaouiKallebi.JournalWeb.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "item")
public class Item extends AbstractEntity{

    private String type ;
    private String description ;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "manuscript_id")
    private Manuscript manuscript ;
    @OneToOne
    @JoinColumn(name = "attachement_id")
    private Attachment attachment ;
}
