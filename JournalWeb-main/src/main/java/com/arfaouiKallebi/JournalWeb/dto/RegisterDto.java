package com.arfaouiKallebi.JournalWeb.dto;
import com.arfaouiKallebi.JournalWeb.model.Adresse;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterDto implements Serializable {

    //it's a Data Trasfer Object for registration
    String firstName ;
    String lastName ;
    String email;
    String password ;
    String role ;
    String jobTitle ;
    AdresseDto address ;
    String phoneNumber ;
    String institution ;
}
