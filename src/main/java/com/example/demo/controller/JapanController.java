package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JapanService;
import com.example.demo.vo.JapanVO;

@RestController
public class JapanController {

	@Autowired
	private JapanService js;
	
	@GetMapping("/japans")
	public @ResponseBody List<JapanVO> selectJapanList() {
		return js.selectJapanList();
	}
	@GetMapping("japans/{jpnum}")
	public @ResponseBody JapanVO selectJapan(@PathVariable int jpnum) {
		return js.selectJapan(jpnum);
	}
	@PostMapping("/{jpnum}")
	public @ResponseBody int insertJapan(@RequestBody JapanVO jp) {
		return js.insertJapan(jp);
	}
	@PutMapping("/{jpnum}")
	public @ResponseBody int updateJapan(@RequestBody JapanVO jp) {
		return js.updateJapan(jp);
	}
	@DeleteMapping("/{jpnum}")
	public @ResponseBody int deleteJapan(@PathVariable int jpnum) {
		return js.deleteJapan(jpnum);
	}
}
