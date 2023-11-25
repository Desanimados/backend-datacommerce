package com.anhembi.a3.service.impl;

import com.anhembi.a3.model.Channel;
import com.anhembi.a3.model.Sales;
import com.anhembi.a3.service.ChannelService;
import com.anhembi.a3.service.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalesServiceImpl implements SalesService {

    private final ChannelService channelService;

    @Override
    public List<Sales> getAll() {
        List<String> productsNames = getProductsNames();
        return productsNames
                .stream()
                .map(productName -> new Sales(productName, generateSeries()))
                .toList();
    }

    private Channel generateChannelSales(String channelName) {
        long leftLimit = 10000L;
        long rightLimit = 1000000L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        return new Channel(channelName, generatedLong);
    };

    private List<Channel> generateSeries() {
        List<String> channelNames = channelService.getAll()
                .stream()
                .map(Channel::getName)
                .toList();

        return channelNames
                .stream()
                .map(this::generateChannelSales)
                .toList();
    }

    private List<String> getProductsNames() {
        return List.of(
                "Charrasqueira Eletrica",
                "Parafusadora 220v",
                "Maquina de Lavar Roupas",
                "Armário duas portas",
                "TV 4K 40 Polegadas",
                "Teclado Mecânico",
                "Controle Dualsense PC",
                "Carregador de pilha",
                "Mouse sem fio",
                "Caixa de som",
                "Notebook intel i5 12 Geração",
                "Lixeira de metal");
    }
}

