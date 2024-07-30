package com.mycompany.webserverlenin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class FormController {

    @GetMapping("/form")
    public String jobOrderForm(Model model) {
        model.addAttribute("jobOrderForm", new JobOrderForm());
        return "createJO";
    }
        // Add form data to the model to display in the result view
       @PostMapping("/submit-job-order")
public String submitJobOrder(@ModelAttribute JobOrderForm jobOrderForm, Model model) {
    // Print form data to the console
    System.out.println("Date Issued: " + jobOrderForm.getDateIssued());
    System.out.println("Job Code: " + jobOrderForm.getJobCode());
    System.out.println("Job Code Text: " + jobOrderForm.getJobCodeText());
    System.out.println("Client Name: " + jobOrderForm.getClientName());
    System.out.println("Contact: " + jobOrderForm.getContact());
    System.out.println("Request Recommendation: " + jobOrderForm.getRequestRecommendation());
    System.out.println("Address: " + jobOrderForm.getAddress());
    System.out.println("Date Deployed: " + jobOrderForm.getDateDeployed());
    System.out.println("Service Request: " + jobOrderForm.getServiceRequest());
    System.out.println("Leader: " + jobOrderForm.getLeader());
    System.out.println("Date Due: " + jobOrderForm.getDateDue());
    System.out.println("Man Power: " + jobOrderForm.getManPower());
    System.out.println("Instructions: " + jobOrderForm.getInstructions());

    // Optionally, add form data to the model to display in the result view

        return "health";
    }
}
