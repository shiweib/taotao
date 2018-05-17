package com.taotao.service;

import com.taotao.pojo.EUDataGridResult;
import com.taotao.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);

	EUDataGridResult getItemList(int page, int rows);
	
	TaotaoResult addItem(TbItem item, TbItemDesc itemDesc);

}
