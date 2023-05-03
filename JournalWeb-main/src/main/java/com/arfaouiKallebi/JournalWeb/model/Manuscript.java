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
@Table(name = "manuscript")
public class Manuscript extends AbstractEntity {
    private String title ;
    private List<String> keywords ;
    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "comments")
    private List<Comment> comments ;
    @OneToMany
    @Column(name = "items")
    private List<Item> items ;
    @ManyToMany
    @Column(name = "authors")
    private List<Author> authors ;
    private String status = "processed" ;
}
