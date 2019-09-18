package espp.automation.employee;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	/*@RequestMapping(value="/")
	public ModelAndView showMsg(){
		return new ModelAndView("index","msg","Working fine!!");
	}	*/
	
	@Autowired
    private EmployeeService empService;
	
	@RequestMapping(value="/")
	public String showForm(Map<String, Object> model){
		Employee emp = new Employee();
	    model.put("employee", emp);
	    return "add_employee";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("emp") Employee emp) {
		System.out.println(emp.getName()+" "+emp.getId());
		empService.save(emp);
	    return "redirect:/";
	}
}
