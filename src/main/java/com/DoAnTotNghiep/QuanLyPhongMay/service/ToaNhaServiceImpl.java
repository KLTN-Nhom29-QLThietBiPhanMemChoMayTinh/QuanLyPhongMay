package com.DoAnTotNghiep.QuanLyPhongMay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoAnTotNghiep.QuanLyPhongMay.entity.LichTruc;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.Tang;
import com.DoAnTotNghiep.QuanLyPhongMay.entity.ToaNha;
import com.DoAnTotNghiep.QuanLyPhongMay.repository.ToaNhaRepository;

@Service
public class ToaNhaServiceImpl implements ToaNhaService{
	@Autowired
	private ToaNhaRepository toaNhaRepository;
	@Autowired
    private TangService tangService;

    @Autowired
    private LichTrucService lichTrucService;

	@Override
	public ToaNha layToaNhaTheoMa(Long maToaNha) {
		ToaNha toaNha = null;
		Optional<ToaNha> kq = toaNhaRepository.findById(maToaNha);
		try {
			toaNha = kq.get();
			return toaNha;
		} catch (Exception e) {
			return toaNha;
		}
	}

	@Override
	public List<ToaNha> layDSToaNha() {
		return toaNhaRepository.findAll();
	}

	@Override
    public void xoa(Long maToaNha) {
        List<Tang> dsTang = tangService.layTangTheoToaNha(maToaNha);
        for (Tang tang : dsTang) {
            List<LichTruc> dsLichTruc = lichTrucService.layLichTrucTheoMaTang(tang.getMaTang());
            for (LichTruc lichTruc : dsLichTruc) {
                lichTrucService.xoa(lichTruc.getMaLich());
            }
            tangService.xoa(tang.getMaTang());
        }
        toaNhaRepository.deleteById(maToaNha);
    }

	@Override
	public ToaNha luu(ToaNha toaNha) {
		return toaNhaRepository.save(toaNha);
	}

}
