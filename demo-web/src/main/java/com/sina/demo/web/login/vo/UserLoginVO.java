package com.sina.demo.web.login.vo;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;


@Data
public class UserLoginVO {
    @NotEmpty
    private String email;
    private String phone;
    @NotEmpty
    private String pwd;
}
