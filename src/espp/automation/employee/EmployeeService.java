package espp.automation.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
	@Autowired EmployeeRepository repo;
    
    public void save(Employee emp) {
        repo.save(emp);
    }
     
   /* public List<Employee> listAll() {
        return (List<Employee>) repo.findAll();
    }
     
    public Employee get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }*/
}
