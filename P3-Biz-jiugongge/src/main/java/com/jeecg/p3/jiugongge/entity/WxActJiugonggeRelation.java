package com.jeecg.p3.jiugongge.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActJiugonggeRelation:配置<br>
 * @author junfeng.zhou
 * @since：2015年11月17日 18时58分22秒 星期二 
 * @version:1.0
 */
public class WxActJiugonggeRelation implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	public Double getProbability() {
		return probability;
	}
	public void setProbability(Double probability) {
		this.probability = probability;
	}
	public Integer getRemainNum() {
		return remainNum;
	}
	public void setRemainNum(Integer remainNum) {
		this.remainNum = remainNum;
	}

}
