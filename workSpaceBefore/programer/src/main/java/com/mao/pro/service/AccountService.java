package com.mao.pro.service;

import com.mao.pro.model.Account;

public interface AccountService {

	Account login(String username, String password);

	void regist(Account a1);

}
