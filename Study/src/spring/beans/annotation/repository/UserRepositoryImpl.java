package spring.beans.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.beans.annotation.TestObject;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired(required=false)
	private TestObject testObject;

	@Override
	public void save() {
		System.out.println("UserRepository Save...");
		System.out.println(testObject);
	}

}
