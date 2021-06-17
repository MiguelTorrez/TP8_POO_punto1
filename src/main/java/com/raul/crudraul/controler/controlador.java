package com.raul.crudraul.controler;

import com.raul.crudraul.interfaceService.IpersonalService;
import com.raul.crudraul.modelo.personal;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class controlador {

    @Autowired
    private IpersonalService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<personal> empleados = service.listar();
        model.addAttribute("empleados", empleados);
        return "index";
    }
    @GetMapping("/listar/{dni}")
	public String listarId(@PathVariable int dni,Model model) {
		model.addAttribute("empleado", service.listarId(dni));
		return "form";
	}
        
    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("empleado", new personal());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid personal p,Model model) {
        service.save(p);
        return "redirect:/listar";
    }
    	@GetMapping("/eliminar/{dni}")
	public String delete(@PathVariable int dni,Model model) {
		service.delete(dni);
		return "redirect:/listar";
	}
        
        @GetMapping("/editar/{dni}")
        public String editar(@PathVariable int dni, Model model){
            Optional<personal>empleado=service.listarId(dni);
            model.addAttribute("empleado", empleado);
            return "form";
        }
}
