package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.EmployeeDTO;
import org.zerock.domain.vo.EmployeeVO;

public interface EmployeeService {
	public List<EmployeeVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
	
	public int register(EmployeeDTO dto);
	
	public EmployeeVO get(Long emp_no);
	
	public int modify(EmployeeDTO dto);
}
