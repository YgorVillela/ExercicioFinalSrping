package br.com.fiap.exerciciofinalspring.controller;

import br.com.fiap.exerciciofinalspring.model.Chamado;
import br.com.fiap.exerciciofinalspring.repository.ChamadoRepository;
import br.com.fiap.exerciciofinalspring.repository.PrioridadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/chamado")
public class ChamadoController {

    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired
    private PrioridadeRepository prioridadeRepository;

    @GetMapping("/cadastro")
    public String cadastrar(Chamado chamado) {
        return "chamado/form";
    }

    @PostMapping("/cadastro")
    public String cadastrar(Chamado chamado, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg","Cadastrado!");
        chamadoRepository.save(chamado);
        return "redirect:/chamado/form";
    }

}
