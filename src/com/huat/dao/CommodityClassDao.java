package com.huat.dao;

import java.util.List;

import com.huat.po.CommodityClass;

public interface CommodityClassDao {
//	可以封装，只是调用
	public void save(CommodityClass commodityClass);
	public void delete(CommodityClass id);
	public CommodityClass findCommodityClassById(int id);
	public List<CommodityClass> findAllCommodityClasses();
	public void update(CommodityClass commodityClass); 
	public CommodityClass findCommodityClassByName(String name);
	public CommodityClass findCommodityClassBName(String name);
}
