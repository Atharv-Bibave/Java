class Method1{
        int x=10;
        static int y=20;

        static void add(){
                System.out.println("Inside Add");
        }

        void add2(){
                System.out.println("Inside Add2");
        }

        public static void main(String [] args){
                Method1 obj = new Method1();
                System.out.println(obj.x);
                System.out.println(y);
                add();
                obj.add2();
        }
}
