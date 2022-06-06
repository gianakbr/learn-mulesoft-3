package com.example;

public class TestInvoke {
	public data methodTambah(int angka1, int angka2, String operator) {
		int hasil;		
		data vdata = new data();
		vdata.setAngka1(angka1);
		vdata.setAngka2(angka2);
		vdata.setOperator(operator);
		hasil = angka1 + angka2;
		vdata.setHasil(hasil);
		return vdata;	
	}
	
	public data methodKurang(int angka1, int angka2, String operator) {
		int hasil;
		data vdata = new data();
		vdata.setAngka1(angka1);
		vdata.setAngka2(angka2);
		vdata.setOperator(operator);
		hasil = angka1 - angka2;
		vdata.setHasil(hasil);
		return vdata;		
	}
	
	public data methodBagi(int angka1, int angka2, String operator) {
		int hasil;
		data vdata = new data();
		vdata.setAngka1(angka1);
		vdata.setAngka2(angka2);
		vdata.setOperator(operator);
		hasil = angka1 / angka2;
		vdata.setHasil(hasil);
		return vdata;	
	}
	
	public data methodKali(int angka1, int angka2, String operator) {
		int hasil;
		data vdata = new data();
		vdata.setAngka1(angka1);
		vdata.setAngka2(angka2);
		vdata.setOperator(operator);
		hasil = angka1 * angka2;
		vdata.setHasil(hasil);
		return vdata;		
	}
}