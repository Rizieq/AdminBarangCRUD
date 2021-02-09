package com.rizieq.adminbarangcrud.model;


import com.google.gson.annotations.SerializedName;


public class BarangItem{

	@SerializedName("harga")
	private String harga;

	@SerializedName("nama_barang")
	private String namaBarang;

	@SerializedName("id")
	private String id;

	@SerializedName("stock")
	private String stock;

	@SerializedName("jenis_barang")
	private String jenisBarang;

	public String getHarga(){
		return harga;
	}

	public String getNamaBarang(){
		return namaBarang;
	}

	public String getId(){
		return id;
	}

	public String getStock(){
		return stock;
	}

	public String getJenisBarang(){
		return jenisBarang;
	}
}