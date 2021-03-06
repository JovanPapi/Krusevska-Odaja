package com.krusevskaodaja.web;

import com.krusevskaodaja.model.Ingredient;
import com.krusevskaodaja.service.IngredientService;
import com.krusevskaodaja.service.InterfaceImpl.IngredientServiceImpl;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api/ingredients", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class IngredientApiController {

    private final IngredientService ingredientService;

    public IngredientApiController(IngredientServiceImpl ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/all-ingredients")
    public List<Ingredient> fetchAllIngredients() {
        return ingredientService.getAllIngredients();
    }

}
