package com.bmt.MyStore.controllers;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bmt.MyStore.models.AppUser;
import com.bmt.MyStore.models.RegisterDto;
import com.bmt.MyStore.repositories.AppUserRepository;

/*attempt at importing extensions/dependencies for unit testing
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
*/

import jakarta.validation.Valid;

@Controller
public class AccountController {

	
	 @Autowired
	 private AppUserRepository repo;


@GetMapping("/register") 
public String register (Model model) { 
	RegisterDto registerDto = new RegisterDto(); 
	model.addAttribute (registerDto); 
	model.addAttribute("success",false);
	return "register"; 
	}

@PostMapping("/register")  
public String register(  
       Model model,  
       @Valid @ModelAttribute RegisterDto registerDto,  
        BindingResult result
       ) {  
	
	if (!registerDto.getPassword().equals(registerDto.getConfirmPassword())) {  
		 result.addError(  
		 new FieldError("registerDto", "confirmPassword"
				 , "Password and Confirm Password are not the same")  
		 );  
		}  

		AppUser appUser = repo.findByRegnumber(registerDto.getRegnumber());  
		if (appUser != null) {  
		 result.addError(  
		 new FieldError("registerDto", "regnumber"
				 , "Registration number is already used")  
		 );  
		}
		
		/*Attemot at unit testing
		 @ExtendWith(MockitoExtension.class)
		 public class AccountControllerTest {

		     @Mock
		     private AppUserRepository appUserRepository;

		     @InjectMocks
		     private AccountController accountController;

		     @Test
		     public void testRegister_RegnumberExists_Error() {
		         RegisterDto registerDto = new RegisterDto();
		         registerDto.setRegnumber("H230363Y"); // Registration number already exists

		         AppUser  existingUser  = new AppUser ();
		         when(appUserRepository.findByRegnumber("H230363Y")).thenReturn(existingUser );

		         BindingResult bindingResult = new BeanPropertyBindingResult(registerDto, "registerDto");

		         ModelAndView modelAndView = accountController.register(new ModelMap(), registerDto, bindingResult);

		         assertFalse(((ModelMap) modelAndView.getModel()).containsAttribute("success")); 
		         verify(appUserRepository, never()).save(any()); // User should not be saved
		         assertTrue(((ModelMap) modelAndView.getModel()).containsAttribute("errorMessage")); // Check for error message
		     }
		 }
		 */
	if (result.hasErrors()) {
		return "register";
	}
	
	try {  
		 // create new account 
		var bCryptEncoder = new BCryptPasswordEncoder();  

		 AppUser newUser = new AppUser();  
		 newUser.setFirstName(registerDto.getFirstName());  
		 newUser.setLastName(registerDto.getLastName());  
		 newUser.setRegnumber(registerDto.getRegnumber());  
		 newUser.setPhone(registerDto.getPhone());  
		 newUser.setAddress(registerDto.getAddress());  
		 newUser.setRole("client");  
		 newUser.setCreatedAt(new Date());  
		 newUser.setPassword(bCryptEncoder.encode(registerDto.getPassword()));  
		 
		 repo.save(newUser); 
		
		 model.addAttribute("registerDto", new RegisterDto());
		 model.addAttribute("success",true);
		 
	
		} 
	  catch (Exception ex) {  
		 result.addError(
				 new FieldError("registerDto", "firstName"
						 , ex.getMessage())
				 );  
		}
		
 return "register";  
 



	}
}
