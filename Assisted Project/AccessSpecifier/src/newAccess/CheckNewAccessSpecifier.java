package newAccess;

import access.AccessSpecifier;

public class CheckNewAccessSpecifier {

	public static void main(String[] args)
	{
		System.out.println("Different Class Different Package :");
		AccessSpecifier obj=new AccessSpecifier();
		//obj.DefaultMethod();
		obj.PublicMethod();
		//obj.PrivateMethod();
		//obj.ProtectedMethod();

	}

}
