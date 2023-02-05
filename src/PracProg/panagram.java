package PracProg;

public class panagram {

	public static void main(String[] args) {
		String s= "THe quicl brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s.toLowerCase()));
		
	}
	private static boolean isPanagram(String s)
	{
		if(s.length()<26)
		{
			return false;
			
		}
		else {
			for(char ch='a';ch<'z';ch++)
			{
				if(s.indexOf(ch)<0)
				{
					return false;
					
				}
			}
			
		}
		return true;
	}

}
