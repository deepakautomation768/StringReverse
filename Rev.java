class  Rev
{
	public static void main(String arsg[])
	{
		String reverseString = "Deepak";
		String test="";
        System.out.println("Before String" +reverseString);
		char ch [] = reverseString.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
		test=test + String.valueOf(ch[i]);		
		}
        System.out.println("Reverse String" +test);
    } 
}
