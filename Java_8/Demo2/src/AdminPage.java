
public class AdminPage implements CredentialFns{

	@Override
	public void login() {
		System.out.println("Admin has logged in successfully");
		
	}

	@Override
	public void logout() {
		
		System.out.println("Admin has logged out successfully");
	}

	@Override
	public void signup() {
		
		System.out.println("Admin's data is registered successfully. Can't be undone");
		
	}

}
