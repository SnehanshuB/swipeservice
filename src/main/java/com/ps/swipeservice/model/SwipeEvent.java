package com.ps.swipeservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
@Entity(name = "swipe_event")
public class SwipeEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "swipe_type")
    private SwipeType swipeType;

    @Column(name = "timestamp")
    private LocalDateTime eventTime;
}
