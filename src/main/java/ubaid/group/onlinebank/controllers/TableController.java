package ubaid.group.onlinebank.controllers;

import ubaid.group.onlinebank.entities.User;
import ubaid.group.onlinebank.entities.Account;
import ubaid.group.onlinebank.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/api/onlinebank")
public class TableController {
	@Autowired
	private TableService tableService;
	@PostMapping("/user")
	public ResponseEntity<User> add(@Valid @RequestBody User user) {
		User u =tableService.addUser(user);
		
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	
	
	@PostMapping("/account")
	public ResponseEntity<Account> add(@Valid @RequestBody Account account) {
		Account a =tableService.addAccount(account);
		
		return new ResponseEntity<Account>(a,HttpStatus.CREATED);
	}


}
