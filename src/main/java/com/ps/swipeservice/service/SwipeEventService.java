package com.ps.swipeservice.service;

import com.ps.swipeservice.dto.AddSwipeRecordDTO;
import com.ps.swipeservice.dto.SwipeEventDTO;
import com.ps.swipeservice.exception.SwipeServiceException;
import com.ps.swipeservice.model.SwipeType;

import java.util.List;

public interface SwipeEventService {
    String recordSwipe(AddSwipeRecordDTO addSwipeRecordDTO) throws SwipeServiceException;
    List<SwipeEventDTO> getAllSwipeEvents() throws SwipeServiceException;
}
