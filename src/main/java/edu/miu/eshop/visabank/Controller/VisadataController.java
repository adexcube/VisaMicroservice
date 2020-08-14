package edu.miu.eshop.visabank.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.eshop.visabank.domain.Visadata;
import edu.miu.eshop.visabank.domain.Transaction;
import edu.miu.eshop.visabank.service.VisadataService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("visa")
public class VisadataController {

	@Autowired
	private VisadataService service;
	
	
	@PostMapping("/confirm")
	public ResponseEntity<?> confirmTransaction(@RequestBody Transaction transaction) {
		Boolean confirm = service.confirmTransaction(transaction);
		return new ResponseEntity<Boolean>(confirm, HttpStatus.OK);
	
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<?> addVisa(@RequestBody Visadata visadata) {
		service.saveVisadata(visadata);
		return new ResponseEntity<String>("Data inserted successfully", HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getvisa")
	public ResponseEntity<?> getVisa() {
		List<Visadata> visadata = service.getVisadata();
		return new ResponseEntity<List<Visadata>>(visadata, HttpStatus.OK); 
	}
	
	
	@GetMapping("/getbalance")
	public ResponseEntity<?> getBalance() {
		double balance = service.getBalanceOfAccount("GROUP 3 ACCOUNT");
		return new ResponseEntity<Double>(balance, HttpStatus.OK); 
	}
	
	
}
