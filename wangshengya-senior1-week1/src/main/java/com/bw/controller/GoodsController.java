package com.bw.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Types;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
//控制层
@Controller
public class GoodsController {

	@Resource
	private GoodsService gs;
	//a)第一页是商品列表展示。（5分），
	//b)必须有分页功能。（5分），
	//c)定义好商品搜索。（5分）
	@RequestMapping("list.do")
	public String list(Model model,@RequestParam(defaultValue="1")Integer pageNum,String name){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		PageHelper.startPage(pageNum, 2);
		List<Goods> list = gs.list(map);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		model.addAttribute("name", name);
		return "list";
	}
	/*
	 * (2)完成“添加”功能：
		a)其中品牌、分类可以下拉框正确选择。（5分）
	 */
	@RequestMapping("getBrand.do")
	@ResponseBody
	public List<Brand> getBrand(){
		List<Brand> list = gs.getBrand();
		return list;
	}
	/*
	 * 	b)分类下拉框数据必须从数据库中通过ajax动态查询出来显示结果，不能写死；（5分）
	 */
	@RequestMapping("getType.do")
	@ResponseBody
	public List<Types> getType(){
		List<Types> list = gs.getType();
		return list;
	}
	/*
	 * 	c)保存成功显示“保存成功!”提示按钮(alert)，点击“确定”后并跳转到列表页面。保存失败，提示“保存失败!”，点击“确定”按钮后停留在添加页面。（5分）
	 */
	@RequestMapping("add.do")
	@ResponseBody
	public int add(Goods goods){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(d);
		goods.setDatea(format);
		int i = gs.add(goods);
		return i ;
	}
	/*
	 * (3)完成“详情”功能。点击“详情”按钮后，弹出一个新网页，当前商品的数据要正确显示。（5分）
	 */
	@RequestMapping("reshow.do")
	public String reshow(Integer id,Model model){
		Goods goods = gs.reshow(id);
		model.addAttribute("g", goods);
		return "reshow";
	}
	/*
	 * (3)完成“详情”功能。点击“详情”按钮后，弹出一个新网页，当前商品的数据要正确显示。（5分）
	 */
	@RequestMapping("toupdate.do")
	public String toupdate(Integer id,Model model){
		Goods goods = gs.reshow(id);
		model.addAttribute("g", goods);
		return "update";
	}
	/*
	 * (4)完成“编辑”功能，能正常修改保存，编辑完成后显示在列表页面。
		a)品牌、种类可以正确选择，数据必须回选正确；（5分）
		b)修改成功显示“修改成功!”提示按钮(alert)，点击“确定”后并跳转到列表页面。保存失败，提示“修改失败!”，点击“确定”按钮后停留在添加页面。(5分)
	 */
	@RequestMapping("update.do")
	@ResponseBody
	public int update(Goods goods){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(d);
		goods.setDatea(format);
		int i = gs.update(goods);
		return i;
	}
	//修改删除
	@RequestMapping("del.do")
	@ResponseBody
	public int del(String ids){
	
	//(5)完成某几个商品的批量删除，数据库中记录做逻辑删除（修改删除状态），不能物理删除，将状态直接改写成一个另外的状态；(5分)。
	//删除操作要弹出对话框“确定要删除吗？”删除确认。(5分)
	int i = gs.updatestatus(ids);
	return i;
		
	}
}
