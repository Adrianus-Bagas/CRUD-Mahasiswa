/**
 * 
 */
package com.prodemy.springmvc.service;

import java.util.List;

import com.prodemy.springmvc.model.Mahasiswa;

/**
 * @author wyant
 *
 */
public interface MahasiswaService {
	public Mahasiswa findByNIM(String nim) throws Exception;
	public void deleteByNIM(String nim) throws Exception;
	public void insert(Mahasiswa mhs) throws Exception;
	public void update(Mahasiswa mhs) throws Exception;
	public List<Mahasiswa> findAll() throws Exception;
}
