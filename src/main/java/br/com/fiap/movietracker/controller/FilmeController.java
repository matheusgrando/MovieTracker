package br.com.fiap.movietracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FilmeController {

    @RequestMapping(
        method = RequestMethod.GET, 
        path = "/filme", 
        produces = "application/json"
    )
    @ResponseBody
    public String index(){
        return """
                    [
                        {
                            "id": 1,
                            "nome": "Brilho Eterno de uma Mente Sem Lembranças",
                            "genero": "Drama",
                            "anoDeLancamento": 2004,
                            "duracao": 108,
                            "classificacaoIndicativa": 14,
                            "diretor": "Michel Gondry",
                            "roteirista": "Charlie Kaufman",
                            "produtor": ["Steve Golin", "Anthony Bregman"],
                            "capa": "imagem da capa"
                        }
                    ]
                """;
    }
    
}
