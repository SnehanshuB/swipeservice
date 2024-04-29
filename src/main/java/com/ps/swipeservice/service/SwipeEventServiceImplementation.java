package com.ps.swipeservice.service;

import com.ps.swipeservice.dto.AddSwipeRecordDTO;
import com.ps.swipeservice.dto.SwipeEventDTO;
import com.ps.swipeservice.model.SwipeEvent;
import com.ps.swipeservice.repository.SwipeEventRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class SwipeEventServiceImplementation implements SwipeEventService {

    @Autowired
    private SwipeEventRepository swipeEventRepository;

    @Override
    public String recordSwipe(AddSwipeRecordDTO addSwipeRecordDTO) {
        SwipeEvent swipeEvent = new SwipeEvent();
        swipeEvent.setEmployeeId(addSwipeRecordDTO.getEmployeeId());
        swipeEvent.setSwipeType(addSwipeRecordDTO.getSwipeType());
        swipeEvent.setEventTime(LocalDateTime.now());
        swipeEventRepository.save(swipeEvent);
        return "Recorded Swipe Event successfully";
    }

    @Override
    public List<SwipeEventDTO> getAllSwipeEvents() {
        List<SwipeEvent> allSwipeEvents = swipeEventRepository.findAll();
        List<SwipeEventDTO> swipeEventDTOList = new ArrayList<>();
        for (SwipeEvent swipeEvent : allSwipeEvents) {
            swipeEventDTOList.add(new SwipeEventDTO(
                    swipeEvent.getEventId(),
                    swipeEvent.getEmployeeId(),
                    swipeEvent.getSwipeType(),
                    swipeEvent.getEventTime()));
        }
        return swipeEventDTOList;
    }
}
