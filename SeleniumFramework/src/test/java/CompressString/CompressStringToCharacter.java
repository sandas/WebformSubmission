package CompressString;

public class CompressStringToCharacter {
	public String compress(String str){
		int count = 1;
		StringBuilder counter = new StringBuilder();
		int n = str.length();
	if (n != 3)
		for(int i = 1; i<str.length(); i++)
			

		{

			if(str.charAt(i) == str.charAt(i-1) && i < str.length()-1){
				count++;
			}
			// Same letter sequence on comparison
			else if(i == str.length()-1 && str.charAt(i) == str.charAt(i-1)) {
				count++;
				counter.append(str.charAt(i));
				counter.append(count);
			}

			// Same letter not in sequence
			else if(i == str.length()-1 && str.charAt(i) != str.charAt(i-1)){
				counter.append(str.charAt(i-1));
				counter.append(count);
				count = 1;
				counter.append(str.charAt(i));
				counter.append(count);
			}
			else{
				// appending the character and THEN appending the count works.
				counter.append(str.charAt(i-1));
				counter.append(count);
				count = 1;
			}

		}

		str = counter.toString();
		System.out.println(str);

		return str;}




	public static void main(String[] args){
		CompressStringToCharacter test = new CompressStringToCharacter();

		test.compress("aaa");
		test.compress("aaaaa");
		test.compress("aaaabbb");
		test.compress("aaabbbccc");
		
	}}
