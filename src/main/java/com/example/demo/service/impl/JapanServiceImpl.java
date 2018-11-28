package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JapanDAO;
import com.example.demo.service.JapanService;
import com.example.demo.vo.JapanVO;

@Service
public class JapanServiceImpl implements JapanService {

	@Autowired
	JapanDAO jdao;
	@Override
	public List<JapanVO> selectJapanList() {
		return jdao.selectJapanList();
	}

	@Override
	public JapanVO selectJapan(int jpnum) {
		return jdao.selectJapan(jpnum);
	}

	@Override
	public Integer insertJapan(JapanVO jp) {
		return jdao.insertJapan(jp);
	}

	@Override
	public Integer updateJapan(JapanVO jp) {
		return jdao.updateJapan(jp);
	}

	@Override
	public Integer deleteJapan(int jpnum) {
		return jdao.deleteJapan(jpnum);
	}

}
