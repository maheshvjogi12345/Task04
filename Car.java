class Car{
	public static void main(String[] args){
		System.out.println("start of main()");
		for(int i=0;i<5;i = i+1){
			System.out.print("\t"+args[i]);
			
		}
		System.out.println();

		for(int i=5;i<args.length;i++){
		System.out.print("\t"+args[i]);
		}
		System.out.println();
		System.out.println("end of main()");
	}
}