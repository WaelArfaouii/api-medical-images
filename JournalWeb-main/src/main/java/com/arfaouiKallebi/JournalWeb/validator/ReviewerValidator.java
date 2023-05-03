package com.arfaouiKallebi.JournalWeb.validator;
import com.arfaouiKallebi.JournalWeb.dto.ReviewerDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ReviewerValidator {
    public static List<String> validate (ReviewerDTO reviewerDTO) {
        List<String> errors = new ArrayList<>() ;
        if (reviewerDTO == null){
            errors.add("Enter your first name !") ;
            errors.add("Enter your last name !") ;
            errors.add("Enter your email !") ;
            errors.add("Enter your job title !") ;
            errors.add("Enter your address !") ;
            errors.add("Enter your phone number !") ;
            errors.add("Enter your institution !") ;
            return errors ;

        }
        if (!StringUtils.hasLength(reviewerDTO.getFirstName())) {
            errors.add("Enter your first name !") ;
        }
        if (!StringUtils.hasLength(reviewerDTO.getLastName())) {
            errors.add("Enter your last name !") ;
        }
        if (!StringUtils.hasLength(reviewerDTO.getEmail())) {
            errors.add("Enter your email !") ;
        }
        if (!StringUtils.hasLength(reviewerDTO.getJobTitle())) {
            errors.add("Enter your job title !") ;
        }
        if (reviewerDTO.getAddress().getId() == null) {
            errors.add("Enter your address !") ;
        }
        if (!StringUtils.hasLength(reviewerDTO.getPhoneNumber())) {
            errors.add("Enter your phone number !") ;
        }
        if (!StringUtils.hasLength(reviewerDTO.getInstitution())) {
            errors.add("Enter your institution !") ;
        }

        return errors ;
    }

}

