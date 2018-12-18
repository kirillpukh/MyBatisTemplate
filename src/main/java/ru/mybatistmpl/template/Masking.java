package ru.mybatistmpl.template;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Masking {
    private int valueprocent;
    private String replaceempty;
    private int valuechangeup;
    private String fullmask;
    private String preventmask;
    private int valuechangedown;
    private String replacewithany;
    private String postindex;
    private String phone;
    private String email;
    private String cardnumber;
}
