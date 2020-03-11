package com.mingda.pasrv.services;

import java.util.List;

import com.mingda.pasrv.model.Tdevice;
import com.mingda.pasrv.model.Torg;

public interface CommonService {
	public List<Tdevice> queryTdeviceList();

	public Torg queryHostconf();
}
