<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN" "http://java.sun.com/dtd/web-app_2_3.dtd" >
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
	request.setAttribute("contextName",request.getContextPath());
%>
<html>
<head>
<title>Edit Form Mahasiswa</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="d-flex justify-content-center" style="margin-top: 20px;">
		<h1>Edit Form Mahasiswa</h1>
	</div>
	
	<div class="d-flex justify-content-center">
		<form action="${contextName}/mhs" method="post">
		<input type="hidden" name="mode" value="edit">
		<input type="hidden" name="nim" value="${mahasiswa.nim}">
		<div class="row">
				<div class="col">
					<label for="nama" class="form-label">Nama</label> <input
						type="text" name="nama" class="form-control" value="${mahasiswa.nama}">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="alamat" class="form-label">Alamat</label> <input
						type="text" name="alamat" class="form-control" value="${mahasiswa.alamat}">
				</div>
				<div class="col">
					<label for="tanggalLahir" class="form-label">Tanggal Lahir</label>
					<input type="date" name="tanggalLahir" class="form-control"
						value="${mahasiswa.tanggalLahir}">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="prodi" class="form-label">Prodi</label> <input
						type="text" name="prodi" class="form-control" value="${mahasiswa.prodi}">
				</div>
				<div class="col">
					<label for="fakultas" class="form-label">Fakultas</label> <input
						type="text" name="fakultas" class="form-control" value="${mahasiswa.fakultas}">
				</div>
			</div>
			<div class="d-flex justify-content-center" style="margin: 10px">
				<button type="submit" class="btn btn-primary">Simpan</button>
			</div>
		</form>
	</div>
</body>
</html>
