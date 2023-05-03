package com.arfaouiKallebi.JournalWeb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reviewer")
public class Reviewer extends User{
    @OneToMany(mappedBy = "reviewer")
    @Column(name = "invitations")
    private List<Invitation> invitations ;

    @Column(name = "role")
    private String role="Reviewer" ;


}
