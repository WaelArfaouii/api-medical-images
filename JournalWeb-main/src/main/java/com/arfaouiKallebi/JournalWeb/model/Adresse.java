package com.arfaouiKallebi.JournalWeb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "adrress")
public class Adresse implements Serializable {
  @Id
  @GeneratedValue
  private Long id ;
  @Column(name = "adresse1")
  private String adresse1;

  @Column(name = "adresse2")
  private String adresse2;

  @Column(name = "ville")
  private String ville;

  @Column(name = "codepostale")
  private String codePostale;

  @Column(name = "pays")
  private String pays;


}
