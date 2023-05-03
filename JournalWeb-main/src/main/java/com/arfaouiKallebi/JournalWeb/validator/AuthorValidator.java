package com.arfaouiKallebi.JournalWeb.validator;
import com.arfaouiKallebi.JournalWeb.dto.AuthorDTO;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class AuthorValidator {
    public static List<String> validate (AuthorDTO authorDTO) {
        List<String> errors = new ArrayList<>() ;
        if (authorDTO == null){
            errors.add("Enter your first name !") ;
            errors.add("Enter your last name !") ;
            errors.add("Enter your email !") ;
            errors.add("Enter your job title !") ;
            errors.add("Enter your address !") ;
            errors.add("Enter your phone number !") ;
            errors.add("Enter your institution !") ;
            return errors ;

        }
        if (!StringUtils.hasLength(authorDTO.getFirstName())) {
            errors.add("Enter your first name !") ;
        }
        if (!StringUtils.hasLength(authorDTO.getLastName())) {
            errors.add("Enter your last name !") ;
        }
        if (!StringUtils.hasLength(authorDTO.getEmail())) {
            errors.add("Enter your email !") ;
        }
        if (!StringUtils.hasLength(authorDTO.getJobTitle())) {
            errors.add("Enter your job title !") ;
        }
//        if (authorDTO.getAddress().getId() == null) {
//            errors.add("Enter your address !") ;
//        }
        if (!StringUtils.hasLength(authorDTO.getPhoneNumber())) {
            errors.add("Enter your phone number !") ;
        }
        if (!StringUtils.hasLength(authorDTO.getInstitution())) {
            errors.add("Enter your institution !") ;
        }

        return errors ;
    }

}
