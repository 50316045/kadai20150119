package lib;

import java.util.Scanner;

public class Calculation_lib {

	//�t�B�[���h�̒�`
	private int m,n;

	public Calculation_lib(int m, int n) {
		this.m = m;
		this.n = n;
	}
	public  int getPlus(){
		return m+n;
	}
	public  int getMinus(){
		return m-n;
	}
	public  int getMultiple(){
		return m*n;
	}	
	public  int getDivide(){
		return m/n;
	}	
}
