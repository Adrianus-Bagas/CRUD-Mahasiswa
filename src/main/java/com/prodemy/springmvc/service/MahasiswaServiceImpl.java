/**
 * 
 */
package com.prodemy.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodemy.springmvc.dao.MahasiswaDao;
import com.prodemy.springmvc.model.Mahasiswa;

/**
 * @author wyant
 *
 */
@Service
@Transactional
public class MahasiswaServiceImpl implements MahasiswaService {
	@Autowired
	private MahasiswaDao dao;

	@Override
	public Mahasiswa findByNIM(String nim) throws Exception {
		return dao.findByNIM(nim);
	}

	@Override
	public void deleteByNIM(String nim) throws Exception {
		dao.deleteByNIM(nim);
	}

	@Override
	public void insert(Mahasiswa mhs) throws Exception {
		dao.insert(mhs);
	}

	@Override
	public void update(Mahasiswa mhs) throws Exception {
		dao.update(mhs);
	}

	@Override
	public List<Mahasiswa> findAll() throws Exception {
		return dao.findAll();
	}

}
