package com.arfaouiKallebi.JournalWeb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "editor")
public class Editor extends User {
    @Column(name = "role")
    private String role="Editor" ;

    @OneToMany(mappedBy = "editor")
    @Column(name = "invitations")
    private List<Invitation> invitations ;
}
