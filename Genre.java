package test;

public enum Genre {
 MALE(10),FEMME(30);
	 Genre(int i) {
		this.a=i;
}
	int  getA() {
		return this.a;
	}
	void setA(int c)
	{
		this.a=c;
	}
	void Print() {
		System.out.print("la valeur est "+this.a);
	}
	 private  int a;
	
	
}
