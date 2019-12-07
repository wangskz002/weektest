package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Types;

public interface GoodsMapper {

	List<Goods> list(Map<String, Object> map);

	List<Brand> getBrand();

	List<Types> getType();

	int add(Goods goods);

	Goods reshow(Integer id);

	int update(Goods goods);

	int updatestatus(String ids);

}
