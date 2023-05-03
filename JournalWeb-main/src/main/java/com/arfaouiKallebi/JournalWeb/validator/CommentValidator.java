package com.arfaouiKallebi.JournalWeb.validator;
import com.arfaouiKallebi.JournalWeb.dto.CommentDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


 public class CommentValidator {
        public static List<String> validate (CommentDTO commentDTO) {
            List<String> errors = new ArrayList<>() ;
            if (commentDTO == null){
                errors.add("Enter the comment title !") ;
                errors.add("Enter the comment content !") ;
                return errors ;

            }
            if (!StringUtils.hasLength(commentDTO.getTitle())) {
                errors.add("Enter the comment title !") ;
            }
            if (!StringUtils.hasLength(commentDTO.getContent())) {
                errors.add("Enter the comment content !") ;
            }
            return errors ;
        }
}
