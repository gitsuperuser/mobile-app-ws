/**
 * 
 */
package com.racharoomies.ui.contoller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racharoomies.ui.model.request.UserRequest;
import com.racharoomies.ui.model.response.UserResponse;
import com.racharoomies.ui.service.UserService;
import com.racharoomies.ui.serviceimpl.UserServiceImpl;
import com.racharoomies.ui.shared.dto.UserDTO;

/**
 * @author Sivamskr
 *
 */

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping
	public String getUser() {
		return "Hello World";
	}

	@PostMapping
	public UserResponse createUser(@RequestBody UserRequest request) {

		UserResponse response = new UserResponse();
		UserDTO userReqDTO = new UserDTO();
		UserDTO userRespDTO = new UserDTO();
		
		BeanUtils.copyProperties(request, userReqDTO);
		
		
		userRespDTO =  userService.CreateUser(userReqDTO);
		
		//Copying from DTO into response object.
		BeanUtils.copyProperties(userRespDTO, response);

		return response;

	}

	@PutMapping
	public String updateUser() {
		return "Hello World";
	}

	@DeleteMapping
	public String deleteUser() {
		return "Hello World";
	}

}
