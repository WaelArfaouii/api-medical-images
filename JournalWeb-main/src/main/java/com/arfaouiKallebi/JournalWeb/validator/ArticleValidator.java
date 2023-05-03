package com.arfaouiKallebi.JournalWeb.validator;

import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate (ArticleDTO articleDTO) {
        List<String> errors = new ArrayList<>() ;
        if (articleDTO == null){
            errors.add("Enter the article title !") ;
            errors.add("Enter the article type !") ;
            return errors ;

        }
        if (!StringUtils.hasLength(articleDTO.getTitle())) {
            errors.add("Enter the article title !") ;
        }
        if (!StringUtils.hasLength(articleDTO.getType())) {
            errors.add("Enter the article type !") ;
        }
        return errors ;
    }
}
