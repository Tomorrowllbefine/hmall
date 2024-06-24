package com.hmall.api.client;

import com.hmall.api.dto.ItemDTO;
import com.hmall.api.dto.OrderDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

/**
 * @description: Item-service调用接口
 * @author: mmkk
 **/
@FeignClient("item-service")
public interface ItemClient {

    // 根据ids查询商品
    @GetMapping("/items")
    List<ItemDTO> queryItemsByIds(@RequestParam("ids") Collection<Long> ids);

    // 扣减商品库存
    @PutMapping("/items/stock/deduct")
    void deductStock(List<OrderDetailDTO> items);
}
