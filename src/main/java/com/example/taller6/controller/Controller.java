package com.example.taller6.controller;

import com.example.taller6.model.Producto;
import com.example.taller6.repository.TallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private TallerRepository repo;

    @GetMapping()
    public String pruebaConexion() {
        return "CONECTADO";
    };

    @GetMapping("/factorial/{numero}")
    public String calcFactorial( @PathVariable int numero ){
        return repo.calcularFactorial( numero );
    }

    @GetMapping("/mcd/{numero1}/{numero2}")
    public String calcMcd( @PathVariable int numero1, @PathVariable int numero2 ){
        return repo.calcularMCD( numero1, numero2 );
    }

    @GetMapping("/primo/{numero}")
    public String numPrimo( @PathVariable int numero ){
        return repo.validarNumPrimo(numero);
    }

    @GetMapping("/fibonacci/{numero}")
    public String fibonacci( @PathVariable int numero ){
        return repo.serieFibonacci(numero);
    }

    @PostMapping("/cambiarPrecio")
    public void cambiarPrecio(@RequestBody Producto p){
        try{
            /*
                Ejemplo JSON en PostMan:
                    {
                        "codProducto": "P0001",
                        "descripcion": "~",
                         "precioUnitario" : 160
                    }
            */
            repo.actualizarPrecioProducto( p.getCodProducto(), p.getPrecioUnitario());
        }catch (Error e){
        }

    }
}
