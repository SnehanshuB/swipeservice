package com.ps.swipeservice.dto;

import com.ps.swipeservice.model.SwipeType;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class SwipeEventDTO {
    private Integer eventId;
    private Integer employeeId;
    private SwipeType swipeType;
    private LocalDateTime eventTime;
}
