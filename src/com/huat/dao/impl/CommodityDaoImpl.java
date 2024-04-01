package com.huat.dao.impl;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.huat.dao.CommodityDao;
import com.huat.po.Commodity;
import com.huat.po.CommodityClass;


@Component("commodityDaoImpl")
public class CommodityDaoImpl implements CommodityDao {
//使用spring对Hibernate的模版 HibernateTemplate
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void delete(Commodity commodity) {
	hibernateTemplate.delete(commodity);
	}
	@SuppressWarnings("unchecked")
	public List<Commodity> findAllCommoditys() {
		String hql = "from Commodity";
		return (List<Commodity>)hibernateTemplate.find(hql);
	}

	@SuppressWarnings("unchecked")
	public List<Commodity> findCommodityByName(String Name) {
		System.out.println("商品名:"+Name);
		String hql = "from Commodity c where c.commodityName like ?";
		
		return (List<Commodity>)hibernateTemplate.find(hql,"%"+Name+"%");
	}
	@SuppressWarnings("unchecked")
	public List<Commodity> findCommodityByClass(CommodityClass commodityclass) {
		System.out.println("种类:"+commodityclass);
		String hql = "from Commodity c where c.commodityClass = ?";
		
		return (List<Commodity>)hibernateTemplate.find(hql,commodityclass);
	}
	
	public Commodity findCommodityById(int id) {
		Commodity commodity = (Commodity)hibernateTemplate.get(Commodity.class, id);
		return commodity;
	}

	public void save(Commodity commodity) {
		System.out.println(commodity);
	 hibernateTemplate.save(commodity);
	}

	public void update(Commodity commodity) {
	hibernateTemplate.update(commodity);

	}
	public HibernateTemplate getHibernateTmeplate() {
		return hibernateTemplate;
	}
	public void setHibernateTmeplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//精确查找
	public List<Commodity> findCommodityBName(String Name) {
		System.out.println("商品名:"+Name);
		String hql = "from Commodity c where c.commodityName = ?";
		
		return (List<Commodity>)hibernateTemplate.find(hql,Name);
	}
	
}