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
@Table(name = "invitation")
public class Invitation extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="id_editor")
    private Editor editor ;
    @ManyToOne
    @JoinColumn(name="id_reviewer")
    private Reviewer reviewer ;
    @Column(name = "title")
    private String title ;
    @Column(name = "state")
    private String state = "not approved" ;


}
