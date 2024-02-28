package UserDetails.Service;

import UserDetails.Model.UserDetails;
import UserDetails.Repository.UserRepository;

public class UserServiceImpl {
	
	
	private UserRepository userRepository;
	
	
	public void saveUser(UserDetails user) {
	
	userRepository.save(user);
		
		
		
	}
	

}
