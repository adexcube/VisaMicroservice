package edu.miu.eshop.visabank.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.miu.eshop.visabank.domain.Visadata;


@Repository
public interface VisadataRepository extends MongoRepository<Visadata, BigInteger> {
	public Visadata findVisadataBycardHolder(String cardname);
	
}
