package InnerClasses;

class OuterClass {
    String outerClassFieldName;
    int outerClassFieldId;
    protected OuterClass(String outerClassFieldName, int outerClassFieldId) {
        this.outerClassFieldName = outerClassFieldName;
        this.outerClassFieldId = outerClassFieldId;

//      1. Local Inner Class
        class LocalInnerClass{
            void print(){
                System.out.println(outerClassFieldName);    // local inner class can access outer class field.
                System.out.println("I am local inner class method.");
            }
        };
        LocalInnerClass lic=new LocalInnerClass(); // scope of local inner class is only inside this block.
        lic.print();
    }
    public void print(){
        System.out.println("I am an outer class method.");
    }

//  2. Member Inner Class
    public class MemberInnerClass{
        String innerClassFieldName;
        int innerClassFieldId;

        public MemberInnerClass(String innerClassFieldName, int innerClassFieldId) {
            this.innerClassFieldName = innerClassFieldName;
            this.innerClassFieldId = innerClassFieldId;
        }
        public void print(){
            System.out.println("I am an inner class method.");
        }

    };

    public static void main(String[] args){
        OuterClass oc=new OuterClass("Outer",0);
        OuterClass.MemberInnerClass mic=oc.new MemberInnerClass("Inner",1);

        oc.print(); // call outer class method.
        mic.print(); // call inner class method.

        //  3. Anonymous Inner Class
        // Anonymous inner class implementing the Runnable interface

        Runnable runnable=new Runnable() {
        // Implementing the run() method of the Runnable interface
            @Override
            public void run() {
                System.out.println("Implementing Runnable interface with the help of anonymous inner class.");
            }
        };

        Thread t=new Thread(runnable);
        t.start(); // This will call the run() method of the anonymous class
    }
}
