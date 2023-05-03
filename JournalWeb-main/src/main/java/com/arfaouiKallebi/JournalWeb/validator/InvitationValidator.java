package com.arfaouiKallebi.JournalWeb.validator;
import com.arfaouiKallebi.JournalWeb.dto.InvitationDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class InvitationValidator {
    public static List<String> validate (InvitationDTO invitationDTO) {
        List<String> errors = new ArrayList<>() ;
        if (invitationDTO == null){
            errors.add("Enter the invitation title !") ;
            errors.add("Enter at least one Reviewer !") ;
            return errors ;

        }
        if (!StringUtils.hasLength(invitationDTO.getTitle())) {
            errors.add("Enter the invitation title !") ;
        }
        if (invitationDTO.getReviewerDTO() == null ) {
                errors.add("Enter at least one Reviewer !") ;
        }
        return errors ;
    }   
}
