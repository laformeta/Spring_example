package com.example.lesson02.bo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;

@Service
public class UsedGoodsBO {

	// input : X(컨트롤러 에게서 받음)			output : (Repository한테 받은 것을) List<UsedGoods> (컨트롤러에게 줌)
	public List<UsedGoods> getUsedGoodsList() {
		return ;
	}
}
