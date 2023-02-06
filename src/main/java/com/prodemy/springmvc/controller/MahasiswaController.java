/**
 * 
 */
package com.prodemy.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prodemy.springmvc.model.Mahasiswa;
import com.prodemy.springmvc.service.MahasiswaService;

/**
 * @author wyant
 *
 */
@Controller
@RequestMapping("/mhs")
public class MahasiswaController {
	@Autowired
	private MahasiswaService service;

	@GetMapping
	public String index(Model model) throws Exception {
		List<Mahasiswa> list = service.findAll();
		model.addAttribute("mhslist", list);
		return "mahasiswa/index";
	}

	@GetMapping("/edit")
	public String edit(Model model, HttpServletRequest req) throws Exception {
		Mahasiswa mhs = service.findByNIM(req.getParameter("nim"));
		model.addAttribute("mahasiswa", mhs);

		List<Mahasiswa> list = service.findAll();
		model.addAttribute("mhslist", list);

		return "mahasiswa/edit";
	}

	@PostMapping
	public String save(Model model, HttpServletRequest req) throws Exception {
		String mode = req.getParameter("mode");
		
		if ("tambah".equals(mode)) {
			Mahasiswa mhs = new Mahasiswa();
			mhs.setNim(req.getParameter("nim"));
			mhs.setNama(req.getParameter("nama"));
			mhs.setAlamat(req.getParameter("alamat"));
			mhs.setTanggalLahir(req.getParameter("tanggalLahir"));
			mhs.setProdi(req.getParameter("prodi"));
			mhs.setFakultas(req.getParameter("fakultas"));
			service.insert(mhs);
		} else if ("hapus".equals(mode)) {
			service.deleteByNIM(req.getParameter("nim"));
		} else {
			Mahasiswa mhs = service.findByNIM(req.getParameter("nim"));
			mhs.setNama(req.getParameter("nama"));
			mhs.setAlamat(req.getParameter("alamat"));
			mhs.setTanggalLahir(req.getParameter("tanggalLahir"));
			mhs.setProdi(req.getParameter("prodi"));
			mhs.setFakultas(req.getParameter("fakultas"));
			service.update(mhs);			
		}
		
		List<Mahasiswa> list = service.findAll();
		model.addAttribute("mhslist", list);
		
		return "mahasiswa/index";
	}
}
