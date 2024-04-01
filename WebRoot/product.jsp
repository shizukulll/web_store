<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<html>
  <head>
        
    <title>产品信息</title>
    
  </head>
  <link rel="stylesheet" type="text/css" href="js/style.css" />
  <body><!--  -->
  
  <div class="center_content">
   	<div class="center_title_bar">最新商品</div>
    	 	<div class="prod_box">
	        	<div class="top_prod_box"></div>
	            <div class="center_prod_box">            
	                 <div class="product_title"> <a href="CommodityAction!findCommodityById.action?commodity.commodityId=40" target="_top">ikun同款背带裤</a></div>
	                 <div class="product_img"><a href="CommodityAction!findCommodityById.action?commodity.commodityId=40" target="_top"><img style="width: 168px" src="product/beidaiku.jpg" alt="ikun同款背带裤" title="" border="0" /></a></div>
	                 <div class="prod_price"><span class="reduce">￥912</span> <span class="price">￥91</span></div>
	            </div>
	            <div class="bottom_prod_box"></div>             
	            <div class="prod_details_tab">
	            <a href="AddToCarAction?commodity.commodityId=40" title="header=[添加到购物车] body=[&nbsp;] fade=[on]" target="_top"><img src="js/images/cart.gif" alt="添加到购物车" title="添加到购物车" border="0" class="left_bt" /></a>
	            <a href="CommodityAction!findCommodityById.action?commodity.commodityId=40" class="prod_details" target="_top">详细</a></div>
	        </div>
	        <div class="prod_box">
	        	<div class="top_prod_box"></div>
	            <div class="center_prod_box">            
	                 <div class="product_title"> <a href="CommodityAction!findCommodityById.action?commodity.commodityId=41" target="_top">ikun篮球</a></div>
	                 <div class="product_img"><a href="CommodityAction!findCommodityById.action?commodity.commodityId=41" target="_top"><img style="width: 168px" src="product/lanqiu.jpg" alt="ikun篮球" title="" border="0" /></a></div>
	                 <div class="prod_price"><span class="reduce">￥912 </span><span class="price">￥91</span></div>
	            </div>
	            <div class="bottom_prod_box"></div>             
	            <div class="prod_details_tab">
	               <a href="AddToCarAction?commodity.commodityId=41" title="header=[添加到购物车] body=[&nbsp;] fade=[on]" target="_top"><img src="js/images/cart.gif" alt="添加到购物车" title="添加到购物车" border="0" class="left_bt" /></a>
	            <a href="CommodityAction!findCommodityById.action?commodity.commodityId=41" class="prod_details" target="_top">详细</a></div>
	        </div>
	        
   </div>
  </body>
</html>
