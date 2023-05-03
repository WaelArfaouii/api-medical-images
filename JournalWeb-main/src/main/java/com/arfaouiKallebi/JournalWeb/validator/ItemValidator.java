package com.arfaouiKallebi.JournalWeb.validator;

import com.arfaouiKallebi.JournalWeb.dto.ItemDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ItemValidator {
    public static List<String> validate (ItemDTO itemDTO) {
        List<String> errors = new ArrayList<>() ;
        if (itemDTO == null){
            errors.add("Enter the item type !") ;
            errors.add("Enter the item description !") ;
            errors.add("Enter at least one Attachement !") ;
            return errors ;

        }
        if (!StringUtils.hasLength(itemDTO.getType())) {
            errors.add("Enter the item title !") ;
        }
        if (!StringUtils.hasLength(itemDTO.getDescription())) {
            errors.add("Enter the item description !") ;
        }
        if (itemDTO.getAttachment() == null ) {
            errors.add("Enter at least one Attachement !") ;
        }
        return errors ;
    }

}
