package ksmybatis.admin.vendors.service;

import java.util.List;

import ksmybatis.admin.vendors.domain.Vendors;

public interface VendorsService {
	// 판매처 목록 조회
	List<Vendors> getVendorList();
}
