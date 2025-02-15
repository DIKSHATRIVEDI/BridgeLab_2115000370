class Comparison{
    public static void main(String[] args){
	    long start=0,end=0;
		start=System.nanoTime();
		StringBuilder sbu=new StringBuilder("hello");
		for(int i=0;i<100000;i++){
		    sbu.append(" Test ");
		}
		end=System.nanoTime();
		System.out.print("StringBuilder time --> " +(end-start));

		
		long s=0,e=0;
		s=System.nanoTime();
		StringBuilder sbf=new StringBuilder("hello");
		for(int i=0;i<100000;i++){
		    sbf.append(" Test ");
		}
		e=System.nanoTime();
		System.out.print("\nStringBuffer time --> " +(e-s));
		
	}
}
		
		