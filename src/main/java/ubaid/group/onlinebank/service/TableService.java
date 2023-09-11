package ubaid.group.onlinebank.service;

import ubaid.group.onlinebank.entities.User;
import ubaid.group.onlinebank.entities.Account;

public interface TableService {

	User addUser(User user);
	Account addAccount(Account account);
	
}
