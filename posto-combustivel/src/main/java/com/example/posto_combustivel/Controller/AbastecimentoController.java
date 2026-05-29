package com.example.posto_combustivel.Controller;

import com.example.posto_combustivel.Entity.Abastecimento;
import com.example.posto_combustivel.Service.AbastecimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/abastecimento")

public class AbastecimentoController {
    private final AbastecimentoService abastecimentoService;

    @PostMapping
    public ResponseEntity<Void> abastecer(@RequestParam ("quantidadeEmLitros") Long litros , @RequestParam("idBomba") Long idBomba){
        abastecimentoService.abastecer(idBomba,litros);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<Abastecimento>> buscarAbastecimentos(){
        return ResponseEntity.ok(abastecimentoService.buscarAbastecimentos());
    }
}
