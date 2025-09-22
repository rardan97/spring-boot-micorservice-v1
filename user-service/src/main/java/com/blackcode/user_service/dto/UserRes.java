package com.blackcode.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRes {

    private Long userId;

    private String nama;

    private String email;

    private DepartmentDto department;

    private AddressDto address;

}
