//The output will always be 3.

public class Magic {
	public static void main(String[] args) {

		int myNumber = -3;
    //this is the original number
    int stepOne = myNumber * myNumber;
    System.out.println(stepOne);
    int stepTwo = stepOne + myNumber;
    System.out.println(stepTwo);
    int stepThree = stepTwo / myNumber;
    System.out.println(stepThree);
    int stepFour = stepThree + 17;
    System.out.println(stepFour);
    int stepFive = stepFour - myNumber;
    System.out.println(stepFive);
    int stepSix = stepFive / 6;
    System.out.println(stepSix);

	}
}
