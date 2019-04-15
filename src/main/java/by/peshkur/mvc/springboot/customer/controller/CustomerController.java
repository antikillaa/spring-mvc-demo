package by.peshkur.mvc.springboot.customer.controller;

import by.peshkur.mvc.springboot.customer.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        Customer customer = new Customer();

        model.addAttribute("customer", new Customer());

        return "customer/customer-form";
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("customer") Customer customer) {


    }
}
