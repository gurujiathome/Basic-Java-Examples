package Polymorp;

public class OverloadingScenerio {
void m1(Object obj) {
	System.out.println(" m1 with object as a param");
}

void m1(String string) {
	System.out.println(" m1 with String as a param");
}
public static void main(String[] args) {
	OverloadingScenerio xx = new OverloadingScenerio();
	xx.m1(null);
	xx.m1(new Object());
}

}
