package net.osouf.demogitspring.web;

import lombok.AllArgsConstructor;
import net.osouf.demogitspring.entities.Patient;
import net.osouf.demogitspring.repository.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Patient> patientList = patientRepository.findAll();
        Model patientsList = model.addAttribute("listPatients", patientList);
        return "patients";
    }
}
