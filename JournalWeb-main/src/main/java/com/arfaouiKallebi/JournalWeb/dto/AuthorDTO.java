package com.arfaouiKallebi.JournalWeb.dto;

import com.arfaouiKallebi.JournalWeb.model.Author;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AuthorDTO {

    private Long id;
    private String firstName ;
    private String lastName ;
    private String email ;
    private String jobTitle ;
    @JsonIgnore
    List<ArticleDTO> articles ;
    private AdresseDto address ;
    private String phoneNumber ;
    private String institution ;
    private String role = "Author" ;
    public static AuthorDTO fromEntity(Author author) {
        if (author == null) {
            return null;
        }
        return AuthorDTO.builder()
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .email(author.getEmail())
                .jobTitle(author.getJobTitle())
                .phoneNumber(author.getPhoneNumber())
                .institution(author.getInstitution())
                .role(author.getRole())
                .address(AdresseDto.fromEntity(author.getAddress()))
                .build();
    }

    public static Author toEntity(AuthorDTO authorDTO) {
        if (authorDTO == null) {
            return null;
        }
        Author author = new Author();
        author.setFirstName(authorDTO.getFirstName());
        author.setLastName(authorDTO.getLastName());
        author.setEmail(authorDTO.getEmail());
        author.setJobTitle(authorDTO.getJobTitle());
        author.setInstitution(authorDTO.getInstitution());
        author.setJobTitle(authorDTO.getJobTitle());
        author.setRole(authorDTO.getRole());
        author.setAddress(AdresseDto.toEntity(authorDTO.getAddress()));

        return author;
    }
}
