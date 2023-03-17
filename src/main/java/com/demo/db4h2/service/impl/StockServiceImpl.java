package com.demo.db4h2.service.impl;

import com.demo.db4h2.Entity.Stock;
import com.demo.db4h2.repository.StockRepository;
import com.demo.db4h2.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StockServiceImpl implements StockService<Stock, Long> {
    @Autowired
    private StockRepository stockRepository;


    @Override
    public Stock save(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stock update(Stock stock) {

        if(null != stock.getId()){
            Stock old_stock = stockRepository.findById(stock.getId()).get();
            old_stock.setStockNo(stock.getStockNo());
            old_stock.setStockName(stock.getStockName());
            stock = stockRepository.save(old_stock);
        }else{
            stock = stockRepository.save(stock);
        }
        return stock;
    }

    @Override
    public void delete(Long id) {
        stockRepository.deleteById(id);
    }


}
