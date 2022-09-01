package com.durga;

 final public class ImmutableClass {
      private int i;
      
	public ImmutableClass(int i) {
		this.i = i;
	}

  public  ImmutableClass  modify(int i) {
	  if(this.i==i) {
		  return this;
	  }
	  else {
		  return(new  ImmutableClass(i));
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ImmutableClass obj=new  ImmutableClass(10);
		 ImmutableClass obj1=obj.modify(100);
		 ImmutableClass obj2=obj.modify(10);
		 System.out.println(obj==obj1);
		 System.out.println(obj==obj2);
		 final StringBuffer sb=new StringBuffer("Meenakshi");
		 System.out.println(sb.append(" bhatnagar"));
	}

}
