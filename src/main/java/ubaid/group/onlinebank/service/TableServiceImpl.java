package ubaid.group.onlinebank.service;

import ubaid.group.onlinebank.entities.User;
import ubaid.group.onlinebank.entities.Account;
import ubaid.group.onlinebank.repositories.AccountRepository;
import ubaid.group.onlinebank.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableServiceImpl implements TableService {
	@Autowired
	private AccountRepository AccountRepository;

	@Override
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub
		
		AccountRepository.save(account);
		
		return account;
	}


	@Autowired
	private UserRepository UserRepository;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
	 UserRepository.save(user);
		
		return user;
	}

}
