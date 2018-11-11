package com.itheima.web;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    private ItemsServiceImpl itemsService;
    @RequestMapping("/findById")
    public String findById(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
    public String save(Items items){
        return null;
    }
}
