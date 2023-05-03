package com.arfaouiKallebi.JournalWeb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "author")
public class Author extends User {

    @Column(name = "manuscripts")
    List<Manuscript> manuscripts ;
    @Column(name = "role")
    private String role="Author" ;

}
