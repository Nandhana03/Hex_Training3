
public class UserPage implements CredentialFns{

	@Override
	public void login() {
		System.out.println("User has logged in successfully");		
	}

	@Override
	public void logout() {
		System.out.println("User has logged out successfully");
		
	}

	@Override
	public void signup() {
		System.out.println("User has signed up successfully");
		
	}

}
