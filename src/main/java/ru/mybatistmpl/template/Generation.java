package ru.mybatistmpl.template;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Generation {
    private int id;
    private String name;
    private String middle;
    private String last;
    private String somefield;
}
