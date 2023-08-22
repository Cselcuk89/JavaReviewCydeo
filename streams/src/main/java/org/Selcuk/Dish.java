package org.Selcuk;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {
    private String name;
    private boolean vegeterian;
    private int calories;
    private Type type;
}
