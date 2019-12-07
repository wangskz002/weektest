package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Types;
//业务层
public interface GoodsService {

	List<Goods> list(Map<String, Object> map);

	List<Types> getType();

	List<Brand> getBrand();

	int add(Goods goods);

	Goods reshow(Integer id);

	int update(Goods goods);

	int updatestatus(String ids);

}
