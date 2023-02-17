package wiprofsd.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import wiprofsd.webdev.model.JWTRequest;
import wiprofsd.webdev.model.JWTResponse;
import wiprofsd.webdev.service.UserService;
import wiprofsd.webdev.utility.JWTUtility;

@RestController
public class HomeController {
	
	@Autowired
	private JWTUtility jwtUtility;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to Spring Boot JWT demo";
	}
	
	@PostMapping("/authenticate")
	
	public JWTResponse authenticate(@RequestBody JWTRequest jwtRequest) throws Exception
	{
		try
		{
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							jwtRequest.getUsername(),
							jwtRequest.getPassword()
							)
					);
			
		}
		catch(BadCredentialsException e)
		{
			throw new Exception("INVALID_CREDENTIALS",e);
		}
		
		final UserDetails userDetails=userService.loadUserByUsername(jwtRequest.getUsername());
		
		final String token=jwtUtility.generateToken(userDetails);
		
		return new JWTResponse(token);
	}
	
	
	
	
	
	
	
	
	
	
	

}
