package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;
import com.taotao.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(int page,int rows) {
		EUDataGridResult tbItem = itemService.getItemList(page, rows);
		return tbItem;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public TaotaoResult addItem(TbItem item, String desc) {
		TbItemDesc itemDesc = new TbItemDesc();
		itemDesc.setItemDesc(desc);
		TaotaoResult result = itemService.addItem(item, itemDesc);
		return result;
	}

}
