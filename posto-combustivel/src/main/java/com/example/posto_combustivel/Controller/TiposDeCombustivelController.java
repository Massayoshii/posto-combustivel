package com.example.posto_combustivel.Controller;

import com.example.posto_combustivel.Entity.TiposDeCombustivel;
import com.example.posto_combustivel.Service.TipoDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tiposDeCombustivel")

public class TiposDeCombustivelController {
    private final TipoDeCombustivelService tipoDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody TiposDeCombustivel tiposDeCombustivel){
        tipoDeCombustivelService.criar(tiposDeCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<TiposDeCombustivel>> buscarTiposDeCombustivel(){
        return ResponseEntity.ok(tipoDeCombustivelService.buscarTipoDeCombustivel());
    }

    @GetMapping("{id}")
    public ResponseEntity<TiposDeCombustivel> buscarTiposDeCombustivelPorId(@PathVariable (name = "id") Long id){
        return ResponseEntity.ok(tipoDeCombustivelService.buscarTipoDeCombustivelPorId(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarTiposDeCombustivelPorId(@PathVariable (name = "id") Long id){
        tipoDeCombustivelService.deletarTipoDeCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarTipoDeCombustivel(@RequestParam (name = "id") Long id ,@RequestBody TiposDeCombustivel tiposDeCombustivel){
        tipoDeCombustivelService.alterarTipoDeCombustivel(id,tiposDeCombustivel);
        return ResponseEntity.accepted().build();
    }

}
