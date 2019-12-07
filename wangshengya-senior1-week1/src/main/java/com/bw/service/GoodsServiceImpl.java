package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Types;
import com.bw.mapper.GoodsMapper;
////业务层
@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsMapper gm;

	@Override
	public List<Goods> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return gm.list(map);
	}

	@Override
	public List<Types> getType() {
		// TODO Auto-generated method stub
		return gm.getType();
	}

	@Override
	public List<Brand> getBrand() {
		// TODO Auto-generated method stub
		return gm.getBrand();
	}

	@Override
	public int add(Goods goods) {
		// TODO Auto-generated method stub
		return gm.add(goods);
	}

	@Override
	public Goods reshow(Integer id) {
		// TODO Auto-generated method stub
		return gm.reshow(id);
	}

	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		return gm.update(goods);
	}



	@Override
	public int updatestatus(String ids) {
		// TODO Auto-generated method stub
		return gm.updatestatus(ids);
	}
}
