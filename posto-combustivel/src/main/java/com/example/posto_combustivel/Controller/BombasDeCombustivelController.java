package com.example.posto_combustivel.Controller;

import com.example.posto_combustivel.Entity.BombasDeCombustivel;
import com.example.posto_combustivel.Entity.TiposDeCombustivel;
import com.example.posto_combustivel.Service.BombaDeCombustivelService;
import com.example.posto_combustivel.Service.TipoDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("bombasDeCombustivel")

public class BombasDeCombustivelController {
    private final BombaDeCombustivelService bombaDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.criar(bombasDeCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<BombasDeCombustivel>> buscarBombaDeCombustivel(){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombaCombustivel());
    }

    @GetMapping("{id}")
    public ResponseEntity<BombasDeCombustivel> buscarBombaDeCombustivelPorId(@PathVariable (name = "id") Long id){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombaCombustivelPorId(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarBombaDeCombustivelPorId(@PathVariable (name = "id") Long id){
        bombaDeCombustivelService.deletarBombaDeCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarBombaDeCombustivel(@RequestParam (name = "id") Long id ,@RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.alterarBombaCombustivel(id,bombasDeCombustivel);
        return ResponseEntity.accepted().build();
    }

}
