package anand.logical;

public class CharacterOccurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anandpatel";
		char []data=new char[s.length()];
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
			for(int j=0;j<i;j++)
			{
				if( s.charAt(i) ==s.charAt(j) ) {
					counter++;
				} 			
			}
			int j=(int)s.charAt(i)+counter;
			data[i]=(char)j;
			counter=0;
		}
		String res=String.copyValueOf(data);
		System.out.println("Input  is: "+s);
		System.out.println("Result is: "+res);
	}

}
