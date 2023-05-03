package com.arfaouiKallebi.JournalWeb.validator;
import com.arfaouiKallebi.JournalWeb.dto.ManuscriptDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ManuscriptValidator {
    public static List<String> validate(ManuscriptDTO manuscriptDTO) {
        List<String> errors = new ArrayList<>() ;
        if (manuscriptDTO == null){
            errors.add("Enter the manuscript title !") ;
            errors.add("Enter at least one keyword !") ;
            return errors ;

        }
        if (!StringUtils.hasLength(manuscriptDTO.getTitle())) {
            errors.add("Enter the manuscript title !") ;
        }
        if (manuscriptDTO.getKeywords()== null) {
            errors.add("Enter at least one keyword !") ;
        }
        return errors ;
    }
}
