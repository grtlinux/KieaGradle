package org.tain.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tain.mybatis.dao.MainMapper;
import org.tain.mybatis.vo.UsrVo;

@Service("mainService")
public class MainServiceImpl implements MainService {

	@Autowired
	private MainMapper mainRepository;
	
	@Override
	public UsrVo getUsr() {
		return mainRepository.getUsr();
	}

}
