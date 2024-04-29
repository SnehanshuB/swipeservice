package com.ps.swipeservice.controller;

import com.ps.swipeservice.dto.AddSwipeRecordDTO;
import com.ps.swipeservice.dto.SwipeEventDTO;
import com.ps.swipeservice.exception.SwipeServiceException;
import com.ps.swipeservice.service.SwipeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/swipeEvent")
public class SwipeEventController {
    @Autowired
    private SwipeEventService swipeEventService;

    @PostMapping("/recordSwipe")
    public ResponseEntity<String> recordSwipe(AddSwipeRecordDTO addSwipeRecordDTO) {
        try {
            return new ResponseEntity<>(swipeEventService.recordSwipe(addSwipeRecordDTO), HttpStatus.OK);
        }catch (SwipeServiceException e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @GetMapping("/getAllSwipeEvents")
    public ResponseEntity<List<SwipeEventDTO>> getAllSwipeEvents() {
        try {
            return new ResponseEntity<>(swipeEventService.getAllSwipeEvents(), HttpStatus.OK);
        }catch (SwipeServiceException e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

}
