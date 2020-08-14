package edu.miu.eshop.visabank.service;

import java.math.BigInteger;
import java.util.List;

import edu.miu.eshop.visabank.domain.Visadata;
import edu.miu.eshop.visabank.domain.Transaction;

public interface VisadataService {

	public Visadata findVisadata(BigInteger cardNumber);
	public void saveVisadata(Visadata data );
	public List<Visadata> getVisadata();
	public boolean confirmTransaction(Transaction transaction);
	public double getBalanceOfAccount(String cardname);
}
