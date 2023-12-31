package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.ChucVu;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.ChucVuRepository;

@Service
public class ChucVuServiceImpl implements ChucVuService{

    @Autowired
    private  ChucVuRepository chucVuRepository;

    @Override
    public ChucVu layCVTheoMa(Long maCV) {
    	ChucVu chucVu = null;
    	Optional<ChucVu> kq = chucVuRepository.findById(maCV);
    	try {
    		chucVu = kq.get();
    		return chucVu;
		} catch (Exception e) {
			return chucVu;
		}
    }

    @Override
    public List<ChucVu> layDSCV() {
        return chucVuRepository.findAll();
    }

    @Override
    public void xoa(Long maCV) {
        chucVuRepository.deleteById(maCV);
    }

    @Override
    public ChucVu luu(ChucVu chucVu) {
        return chucVuRepository.save(chucVu);
    }
    
}
