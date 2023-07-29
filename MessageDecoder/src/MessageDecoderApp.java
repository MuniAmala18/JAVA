import java.util.*;
public class MessageDecoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		MessageDecoder decoder = new MessageDecoder();

		System.out.println(decoder.decodeCharacter(ch));
	}

}
