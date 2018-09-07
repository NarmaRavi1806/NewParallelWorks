package com.cg.service;

import com.cg.beans.NumberBean;

public class ServiceImpl implements IService {

	@Override
	public int addNumber(NumberBean numberBean) throws NullPointerException {
		return (numberBean.getNumber1()+numberBean.getNumber2());
		
		
	}

}
