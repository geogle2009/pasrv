package com.mingda.pasrv.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mingda.pasrv.mapper.TdeviceRepository;
import com.mingda.pasrv.mapper.TorgRepository;
import com.mingda.pasrv.model.Tdevice;
import com.mingda.pasrv.model.Torg;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private TdeviceRepository tdeviceRepository;
	
	@Autowired
	private TorgRepository torgRepository;

	@Transactional
	@Override
	public List<Tdevice> queryTdeviceList() {

		

		try {
			//模糊查询
			ArrayList<Tdevice> flts = tdeviceRepository.queryTdevicesLike("3");
			
			System.out.println(flts.toString());
			
			//主键查询
			Tdevice t = new Tdevice();
			t.setIdx("4824feb8-97c0-4fdb-9a2d-8e4b1867b9ac");
			Example<Tdevice> example = Example.of(t);
			Optional<Tdevice> tt = tdeviceRepository.findOne(example);
			System.out.println(tt.get().toString());
			
			
			// 分页查询
			Page<Tdevice> page = tdeviceRepository.findAll(PageRequest.of(9, 20, Sort.by(Sort.Direction.DESC, "idx")));
			List<Tdevice> rs = page.getContent();
			System.out.println(page.getNumber());// 页数
			System.out.println(page.getNumberOfElements());// 行数
			System.out.println(page.getTotalElements());// 页数
			System.out.println(page.getTotalPages());
			System.out.println("page size " + rs.size());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return tdeviceRepository.findAll();
	}

	@Override
	public Torg queryHostconf() {
		//主键查询
		Torg t = new Torg();
		t.setOrgid("host-10.10.10.240");
		Example<Torg> example = Example.of(t);
		Optional<Torg> tt = torgRepository.findOne(example);
		System.out.println(tt.get().toString());
		return tt.get();
	}

}
