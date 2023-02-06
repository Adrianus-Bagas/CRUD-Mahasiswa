/**
 * 
 */
package com.prodemy.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wyant
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "\"Mahasiswa\"")
public class Mahasiswa {
	@Id
	@Column(name = "\"NIM\"")
	private String nim;
	
	@Column(name = "\"Nama\"")
	private String nama;
	
	@Column(name = "\"Alamat\"")
	private String alamat;
	
	@Column(name = "\"Tanggal Lahir\"")
	private String tanggalLahir;
	
	@Column(name = "\"Prodi\"")
	private String prodi;
	
	@Column(name = "\"Fakultas\"")
	private String fakultas;
	
}
