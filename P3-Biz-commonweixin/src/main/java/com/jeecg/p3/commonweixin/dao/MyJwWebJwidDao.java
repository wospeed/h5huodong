package com.jeecg.p3.commonweixin.dao;

import java.util.Date;
import java.util.List;

import org.jeecgframework.p3.core.utils.common.PageQuery;
import org.jeecgframework.p3.core.utils.persistence.GenericDao;

import com.jeecg.p3.commonweixin.entity.MyJwWebJwid;


/**
 * 描述：</b>JwWebJwidDao<br>
 * @author：pituo
 * @since：2015年12月17日 10时45分06秒 星期四 
 * @version:1.0
 */
public interface MyJwWebJwidDao extends GenericDao<MyJwWebJwid>{
	
	public Integer count(PageQuery<MyJwWebJwid> pageQuery);
	
	public List<MyJwWebJwid> queryPageList(PageQuery<MyJwWebJwid> pageQuery,Integer itemCount);
	
	/**
	 * 定时重启Token
	 * @return 
	 */
	public List<MyJwWebJwid> queryResetTokenList(Date refDate);

	/**
	 * 根据jwid获取用户信息
	 * @param jwid
	 * @return
	 */
	public MyJwWebJwid queryByJwid(String jwid);
	
	/**
	 * TODO 向userjwid表中添加数据(在当前xml操作别的库)
	 * @param jwid
	 * @param createBy
	 */
	public void doAddSystemUserJwid(String jwid,String createBy);
	
	/**
	 * update-by-alex-----Date:20170317---for:删除jwid数据时，同步删除该jwid与用户的关联关系---
	 * 根据Jwid删除当前jwid所有相关绑定关系
	 * @param jwid
	 * @param createBy
	 */
	public void doDelSystemUserJwid(String jwid);
	
	/**
	 * 查询创建人
	 * @param createBy
	 * @return
	 */
	public MyJwWebJwid queryOneByCreateBy(String createBy);
	
	/**
	 * 查询所有微信公众号信息
	 * @return
	 */
	public List<MyJwWebJwid> queryAll();
	//update-begin--Author:zhangweijian  Date: 20180808 for：变更系统公众号表的公众号原始ID
	/**
	 * @功能：变更系统公众号表的公众号原始ID
	 * @param jwid
	 * @param newJwid
	 */
	public void updateUserJwid(String jwid, String newJwid);
	//update-end--Author:zhangweijian  Date: 20180808 for：变更系统公众号表的公众号原始ID
}

