package com.example.projetodesoftwaretrabalho1.controler;

import com.example.projetodesoftwaretrabalho1.model.Produto;
import com.example.projetodesoftwaretrabalho1.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produto")
public class ProdutoControler {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/novo")
    public String formNovo (Model model) {
        model.addAttribute("produto", new Produto());
        return "FormNovo";
    }
    @PostMapping
    public String salvar (@ModelAttribute Produto produto) {
        System.out.println(produto.toString());
        produtoRepository.save(produto);
        return "redirect:/produto";
    }

    @GetMapping
    public String listar (Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "Lista";
    }
}
