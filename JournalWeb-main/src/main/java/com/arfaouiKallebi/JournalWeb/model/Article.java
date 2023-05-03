package com.arfaouiKallebi.JournalWeb.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "article")
public class Article extends AbstractEntity {
    @Column(name = "title")
    private String title ;
    @Column(name = "type")
    private String type ;





}
