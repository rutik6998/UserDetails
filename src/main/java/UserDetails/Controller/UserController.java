package UserDetails.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/userDetails")
	public String addUserDetails() {
		
		return "adduserdetails";
	}
	
	
}
