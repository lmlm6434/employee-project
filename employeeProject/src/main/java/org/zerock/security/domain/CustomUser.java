package org.zerock.security.domain;



import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.zerock.domain.vo.EmployeeVO;

public class CustomUser extends User{
	
	private EmployeeVO emp;
	public CustomUser(EmployeeVO emp) {
		super(emp.getEmp_no().toString(),
		emp.getEmp_pw(),
		emp.getAuthList()
		.stream()
		.map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));
		this.emp = emp;
	}

}
