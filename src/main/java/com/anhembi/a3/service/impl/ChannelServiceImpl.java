package com.anhembi.a3.service.impl;

import com.anhembi.a3.model.Channel;
import com.anhembi.a3.service.ChannelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Override
    public List<Channel> getAll() {
        List<Channel> channels = new ArrayList<>();
        channels.add(new Channel("Shopee", 813782L));
        channels.add(new Channel("Mercado Livre", 2731431L));
        channels.add(new Channel("Loja Integrada", 11234231L));
        channels.add(new Channel("NuvemShop", 936245L));
        channels.add(new Channel("Amazon", 4313131L));
        channels.add(new Channel("B2W", 6523157L));
        return channels;
    }
}
