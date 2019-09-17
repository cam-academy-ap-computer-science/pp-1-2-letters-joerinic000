
public class Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter1();
		Space();
		Letter2();
		Space();
		Letter3();
	}
	public static void SameBody() {
		System.out.println("	In Computer Science class, we have to write three letters, so I");
		System.out.println("chose to write one to you. Computer Science(AP CS) is a good class but");
		System.out.println("at the end of units, we seem to work almost entirely out of the book.");
		System.out.println("It gets a little repetitive with the assignments, but it is good for");
		System.out.println("reveiw. Otherwise, the class is good. We are learning on Java, which");
		System.out.println("seems to be a fairly simple language to learn. In fact, I am writing");
		System.out.println("this letter to you now in Java.");
	}
	public static void Letter1() {
		System.out.println("Dear Mom and Dad,");
			SameBody();
			System.out.println();
			System.out.println("I'm out of ideas, if I have anything else, I'll come back and write");
			System.out.println("them.");
			System.out.println("	Love you,");
			System.out.println("	    Nicholas Joerin");
}
	public static void Letter2() {
		System.out.println("Dear Adam,");
		SameBody();
		System.out.println();
		System.out.println("I have also been looking at too many cars. I found a Volkswagon Phaeton");
		System.out.println("for $2400. It seems good, but it isn't the all wheel drive model and it");
		System.out.println("is just the V8. Overall, it isn't much of an upgrade over the A6 we have.");
		System.out.println("On the subject of cars, you are going to end up plowing your $80,000 RX7");
		System.out.println("into a wall with no insurance. It's a bad investment, don't do it, but if");
		System.out.println("you do, crash spectacularly!");
		System.out.println("	Have a good time against the barrier,");
		System.out.println("		Nicholas Joerin");
	}
	public static void Letter3() {

		System.out.println("Dear Noelle,");
		SameBody();
		System.out.println();
		System.out.println("Right now, I'm talking with a kid next to me in AP CS. His name is Ethan.");
		System.out.println("He is a Senior this year. We were taling about what we are going to do after");
		System.out.println("graduation. He says that he is going to go live in his parent's non existant");
		System.out.println("basement. It was a good conversation. We also spent too long figuring out what");
		System.out.println("to write these letters about.");
		System.out.println("    Sincerely,");
		System.out.println("		Nicholas Joerin");
}
	public static void Space() {
		System.out.println();
	}
}