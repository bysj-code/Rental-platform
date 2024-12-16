package com.entity.vo;

import com.entity.FangyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 房源信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-01 13:36:45
 */
public class FangyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房源分类
	 */
	
	private String fangyuanfenlei;
		
	/**
	 * 房源图片
	 */
	
	private String fangyuantupian;
		
	/**
	 * 房源地址
	 */
	
	private String fangyuandizhi;
		
	/**
	 * 房源状态
	 */
	
	private String fangyuanzhuangtai;
		
	/**
	 * 租金
	 */
	
	private Integer zujin;
		
	/**
	 * 朝向
	 */
	
	private String chaoxiang;
		
	/**
	 * 面积
	 */
	
	private String mianji;
		
	/**
	 * 房型
	 */
	
	private String fangxing;
		
	/**
	 * 带厨卫
	 */
	
	private String daichuwei;
		
	/**
	 * 带阳台
	 */
	
	private String daiyangtai;
		
	/**
	 * 带家具
	 */
	
	private String daijiaju;
		
	/**
	 * 房源详情
	 */
	
	private String fangyuanxiangqing;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：房源分类
	 */
	 
	public void setFangyuanfenlei(String fangyuanfenlei) {
		this.fangyuanfenlei = fangyuanfenlei;
	}
	
	/**
	 * 获取：房源分类
	 */
	public String getFangyuanfenlei() {
		return fangyuanfenlei;
	}
				
	
	/**
	 * 设置：房源图片
	 */
	 
	public void setFangyuantupian(String fangyuantupian) {
		this.fangyuantupian = fangyuantupian;
	}
	
	/**
	 * 获取：房源图片
	 */
	public String getFangyuantupian() {
		return fangyuantupian;
	}
				
	
	/**
	 * 设置：房源地址
	 */
	 
	public void setFangyuandizhi(String fangyuandizhi) {
		this.fangyuandizhi = fangyuandizhi;
	}
	
	/**
	 * 获取：房源地址
	 */
	public String getFangyuandizhi() {
		return fangyuandizhi;
	}
				
	
	/**
	 * 设置：房源状态
	 */
	 
	public void setFangyuanzhuangtai(String fangyuanzhuangtai) {
		this.fangyuanzhuangtai = fangyuanzhuangtai;
	}
	
	/**
	 * 获取：房源状态
	 */
	public String getFangyuanzhuangtai() {
		return fangyuanzhuangtai;
	}
				
	
	/**
	 * 设置：租金
	 */
	 
	public void setZujin(Integer zujin) {
		this.zujin = zujin;
	}
	
	/**
	 * 获取：租金
	 */
	public Integer getZujin() {
		return zujin;
	}
				
	
	/**
	 * 设置：朝向
	 */
	 
	public void setChaoxiang(String chaoxiang) {
		this.chaoxiang = chaoxiang;
	}
	
	/**
	 * 获取：朝向
	 */
	public String getChaoxiang() {
		return chaoxiang;
	}
				
	
	/**
	 * 设置：面积
	 */
	 
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
				
	
	/**
	 * 设置：房型
	 */
	 
	public void setFangxing(String fangxing) {
		this.fangxing = fangxing;
	}
	
	/**
	 * 获取：房型
	 */
	public String getFangxing() {
		return fangxing;
	}
				
	
	/**
	 * 设置：带厨卫
	 */
	 
	public void setDaichuwei(String daichuwei) {
		this.daichuwei = daichuwei;
	}
	
	/**
	 * 获取：带厨卫
	 */
	public String getDaichuwei() {
		return daichuwei;
	}
				
	
	/**
	 * 设置：带阳台
	 */
	 
	public void setDaiyangtai(String daiyangtai) {
		this.daiyangtai = daiyangtai;
	}
	
	/**
	 * 获取：带阳台
	 */
	public String getDaiyangtai() {
		return daiyangtai;
	}
				
	
	/**
	 * 设置：带家具
	 */
	 
	public void setDaijiaju(String daijiaju) {
		this.daijiaju = daijiaju;
	}
	
	/**
	 * 获取：带家具
	 */
	public String getDaijiaju() {
		return daijiaju;
	}
				
	
	/**
	 * 设置：房源详情
	 */
	 
	public void setFangyuanxiangqing(String fangyuanxiangqing) {
		this.fangyuanxiangqing = fangyuanxiangqing;
	}
	
	/**
	 * 获取：房源详情
	 */
	public String getFangyuanxiangqing() {
		return fangyuanxiangqing;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
