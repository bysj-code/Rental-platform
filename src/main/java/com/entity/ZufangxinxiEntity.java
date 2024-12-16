package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 租房信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-01 13:36:45
 */
@TableName("zufangxinxi")
public class ZufangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZufangxinxiEntity() {
		
	}
	
	public ZufangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 租房编号
	 */
					
	private String zufangbianhao;
	
	/**
	 * 房源名称
	 */
					
	private String fangyuanmingcheng;
	
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
	 * 租金
	 */
					
	private Float zujin;
	
	/**
	 * 租房月数
	 */
					
	private Integer zufangyueshu;
	
	/**
	 * 总金额
	 */
					
	private Float zongjine;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 租房时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zufangshijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：租房编号
	 */
	public void setZufangbianhao(String zufangbianhao) {
		this.zufangbianhao = zufangbianhao;
	}
	/**
	 * 获取：租房编号
	 */
	public String getZufangbianhao() {
		return zufangbianhao;
	}
	/**
	 * 设置：房源名称
	 */
	public void setFangyuanmingcheng(String fangyuanmingcheng) {
		this.fangyuanmingcheng = fangyuanmingcheng;
	}
	/**
	 * 获取：房源名称
	 */
	public String getFangyuanmingcheng() {
		return fangyuanmingcheng;
	}
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
	 * 设置：租金
	 */
	public void setZujin(Float zujin) {
		this.zujin = zujin;
	}
	/**
	 * 获取：租金
	 */
	public Float getZujin() {
		return zujin;
	}
	/**
	 * 设置：租房月数
	 */
	public void setZufangyueshu(Integer zufangyueshu) {
		this.zufangyueshu = zufangyueshu;
	}
	/**
	 * 获取：租房月数
	 */
	public Integer getZufangyueshu() {
		return zufangyueshu;
	}
	/**
	 * 设置：总金额
	 */
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：租房时间
	 */
	public void setZufangshijian(Date zufangshijian) {
		this.zufangshijian = zufangshijian;
	}
	/**
	 * 获取：租房时间
	 */
	public Date getZufangshijian() {
		return zufangshijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
