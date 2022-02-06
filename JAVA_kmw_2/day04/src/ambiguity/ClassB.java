package ambiguity;

public class ClassB implements InterA, InterB {
 @Override
public void printInter() {
	InterA.super.printInter();
}
}
