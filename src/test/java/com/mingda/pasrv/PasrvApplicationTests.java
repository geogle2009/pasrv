package com.mingda.pasrv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mingda.pasrv.services.CommonServiceImpl;

@SpringBootTest
class PasrvApplicationTests {
	@Autowired
	CommonServiceImpl commonServiceImpl;

	@Test
	void contextLoads() {
		commonServiceImpl.queryTdeviceList();
	}

}
