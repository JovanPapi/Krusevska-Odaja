package com.krusevskaodaja.model.UtilDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EditProfileDTO {
    private String id;
    private String name;
    private String username;
    private String email;
    private List<String> phoneNumber;
    private boolean termsChecked;
}
