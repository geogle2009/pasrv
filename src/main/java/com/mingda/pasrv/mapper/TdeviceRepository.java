package com.mingda.pasrv.mapper;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mingda.pasrv.model.Tdevice;

public interface TdeviceRepository extends JpaRepository<Tdevice,Integer> {
	@Query(value = "select t from Tdevice t where t.idx like %?1%")
	public ArrayList<Tdevice> queryTdevicesLike(String idx);
}
