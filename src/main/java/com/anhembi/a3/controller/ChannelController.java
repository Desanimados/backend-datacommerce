package com.anhembi.a3.controller;

import com.anhembi.a3.model.Channel;
import com.anhembi.a3.service.ChannelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/channel")
@RequiredArgsConstructor
public class ChannelController {

    private final ChannelService channelService;

    @GetMapping()
    public List<Channel> getAll() {
        return channelService.getAll();
    }
}
