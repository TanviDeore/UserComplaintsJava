package dao;
@FunctionalInterface
public interface funcint {
public abstract void method();
default void methodq() {
	System.out.println("Fsdfjfjwf,");
} 
public static void method2(){
	System.out.println("In static ");
}
}
