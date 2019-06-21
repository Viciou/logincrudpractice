package firstcrudproject.controller;


import firstcrudproject.exception.Exception;
import firstcrudproject.model.Products;
import firstcrudproject.repository.NamesRepository;
import firstcrudproject.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NamesController {

    @Autowired
    NamesRepository namesRepository;

    @Autowired
    ProductsRepository productsRepository;

    @GetMapping("/names")
    public List<Products> getAllProducts()
    {
        return productsRepository.findAll();
    }


    @GetMapping("/names/{id}")
    public Products getProductsById(@PathVariable(value = "id") Long id)
    {
        return productsRepository.findById(id)
                .orElseThrow(() -> new Exception("Name", "ID", id));
    }

    @PostMapping("/names")
    public Products createProducts(@Valid @RequestBody Products products)
    {
        return productsRepository.save(products);
    }

    /*@PutMapping("/names/{id}")
    public Names updateNames(@PathVariable(value = "id") Long id, @Valid @RequestBody Names namesDetails)
    {
        Names name = namesRepository.findById(id)
                .orElseThrow(() -> new Exception("Name","ID", id));

        name.setNames_name(namesDetails.getNames_name());

        Names updatedNames = namesRepository.save(name);
        return updatedNames;
    }*/

    @DeleteMapping("names/{id}")
    public ResponseEntity<?> deleteProducts(@PathVariable(value = "id") Long id)
    {
        Products products = productsRepository.findById(id)
                .orElseThrow(() -> new Exception("Name", "ID", id));

        productsRepository.delete(products);
        return ResponseEntity.ok().build();

    }



}
