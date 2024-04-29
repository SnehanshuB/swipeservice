package com.ps.swipeservice.dto;

import com.ps.swipeservice.model.SwipeType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class AddSwipeRecordDTO {
    private Integer employeeId;
    private SwipeType swipeType;
}
