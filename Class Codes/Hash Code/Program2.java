class HashCodeDemo1{
        public static void main(String [] args){
                String str1 = "Atharv";
                String str2 = new String("Atharv");
                String str3 = "Atharv";
                String str4 =  new String("Atharv");

                 System.out.println(str1.hashCode());
                 System.out.println(str2.hashCode());
                 System.out.println(str3.hashCode());
                 System.out.println(str4.hashCode());

		 System.out.println(System.identityHashCode(str1));
		 System.out.println(System.identityHashCode(str2));
		 System.out.println(System.identityHashCode(str3));
		 System.out.println(System.identityHashCode(str4));
        }
}
