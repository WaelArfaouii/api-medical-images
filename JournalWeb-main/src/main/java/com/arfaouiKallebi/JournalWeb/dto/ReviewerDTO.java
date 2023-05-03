package com.arfaouiKallebi.JournalWeb.dto;


import com.arfaouiKallebi.JournalWeb.model.Reviewer;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class ReviewerDTO {

    private Long id;
    private String firstName ;
    private String lastName ;
    private String email ;
    private String jobTitle ;
    private String country ;
    private AdresseDto address ;
    private String phoneNumber ;
    private String institution ;
    private String role = "Reviewer" ;
    private List<InvitationDTO> invitations ;

    public static ReviewerDTO fromEntity(Reviewer reviewer) {
        if (reviewer == null) {
            return null;
        }
        return ReviewerDTO.builder()
                .firstName(reviewer.getFirstName())
                .lastName(reviewer.getLastName())
                .email(reviewer.getEmail())
                .jobTitle(reviewer.getJobTitle())
                .phoneNumber(reviewer.getPhoneNumber())
                .institution(reviewer.getInstitution())
                .role(reviewer.getRole())
                .address(AdresseDto.fromEntity(reviewer.getAddress()))
                .invitations(reviewer.getInvitations() != null ?
                        reviewer.getInvitations().stream()
                                .map(InvitationDTO::fromEntity)
                                .collect(Collectors.toList()) : null)
                .build();
    }

    public static Reviewer toEntity(ReviewerDTO reviewerDTO) {
        if (reviewerDTO == null) {
            return null;
        }
        Reviewer reviewer = new Reviewer();
        reviewer.setFirstName(reviewerDTO.getFirstName());
        reviewer.setLastName(reviewerDTO.getLastName());
        reviewer.setEmail(reviewerDTO.getEmail());
        reviewer.setJobTitle(reviewerDTO.getJobTitle());
        reviewer.setInstitution(reviewerDTO.getInstitution());
        reviewer.setJobTitle(reviewerDTO.getJobTitle());
        reviewer.setRole(reviewerDTO.getRole());
        reviewer.setAddress(AdresseDto.toEntity(reviewerDTO.getAddress()));




        return reviewer;
    }

}
