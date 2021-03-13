package com.cmw.service;

import com.cmw.bean.Admin;
import com.cmw.bean.AdminExample;
import com.cmw.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

	@Autowired
	AdminMapper adminMapper;

	/**
	 * 查询所有管理员
	 * 
	 * @param class1
	 * 
	 * @return
	 */
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		List<Admin> list = adminMapper.selectByExample(null);
		return list;
	}

	public List<Admin> adminLogin(String namePwd) {
		// TODO Auto-generated method stub
		AdminExample adminExample = new AdminExample();
		adminExample.createCriteria().andAdNameEqualTo(namePwd);
		return adminMapper.selectByExample(adminExample);
	}
}
