/*
	Anonymus class to override a method without using extends
*/
class anonymous{
	public static void main(String args[]){
		normal ano = new normal(){
			public void print(){
				System.out.println("This is anonymous class.");
			}
		};
		ano.print();
	}
}

class normal{
	public void print(){
		System.out.println("This is normal class.");
	}
}

