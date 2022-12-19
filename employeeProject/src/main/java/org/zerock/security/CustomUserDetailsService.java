package org.zerock.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.zerock.domain.vo.EmployeeVO;
import org.zerock.mapper.EmployeeMapper;
import org.zerock.security.domain.CustomUser;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService implements UserDetailsService {

	@Setter(onMethod_ = @Autowired)
	private EmployeeMapper employeeMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.warn("Login EMP no : " + username);
		EmployeeVO vo =	employeeMapper.read(Long.valueOf(username));
		return vo == null ? null : new CustomUser(vo);
	}
	
	
	
	
}
