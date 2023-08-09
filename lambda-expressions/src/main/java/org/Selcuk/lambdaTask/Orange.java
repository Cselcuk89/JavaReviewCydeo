package org.Selcuk.lambdaTask;

import lombok.*;
//@Builder generates an @AllArgsConstructor unless there is another @XConstructor
@Getter
@Setter
@ToString
@Builder
@Data
public class Orange {
    private int weight;
    private Color color;
}
