package com.example.demo.dao;

import java.util.List;

import com.example.demo.vo.JapanVO;

public interface JapanDAO {

	public List<JapanVO> selectJapanList();
	public JapanVO selectJapan(int jpnum);
	public Integer insertJapan(JapanVO jp);
	public Integer updateJapan(JapanVO jp);
	public Integer deleteJapan(int jpnum);
}
