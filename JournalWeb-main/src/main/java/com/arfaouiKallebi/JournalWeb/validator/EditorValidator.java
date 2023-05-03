package com.arfaouiKallebi.JournalWeb.validator;
import com.arfaouiKallebi.JournalWeb.dto.EditorDTO;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class EditorValidator {

        public static List<String> validate(EditorDTO editorDTO) {
            List<String> errors = new ArrayList<>() ;
            if (editorDTO == null){
                errors.add("Enter your first name !") ;
                errors.add("Enter your last name !") ;
                errors.add("Enter your email !") ;
                errors.add("Enter your job title !") ;
                errors.add("Enter your address !") ;
                errors.add("Enter your phone number !") ;
                errors.add("Enter your institution !") ;
                return errors ;

            }
            if (!StringUtils.hasLength(editorDTO.getFirstName())) {
                errors.add("Enter your first name !") ;
            }
            if (!StringUtils.hasLength(editorDTO.getLastName())) {
                errors.add("Enter your last name !") ;
            }
            if (!StringUtils.hasLength(editorDTO.getEmail())) {
                errors.add("Enter your email !") ;
            }
            if (!StringUtils.hasLength(editorDTO.getJobTitle())) {
                errors.add("Enter your job title !") ;
            }
            if (editorDTO.getAddress().getId() == null) {
                errors.add("Enter your address !") ;
            }
            if (!StringUtils.hasLength(editorDTO.getPhoneNumber())) {
                errors.add("Enter your phone number !") ;
            }
            if (!StringUtils.hasLength(editorDTO.getInstitution())) {
                errors.add("Enter your institution !") ;
            }

            return errors ;
        }

    }


