package tacos.web;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import tacos.Ingredient;
import tacos.Ingredient.Type;
import tacos.Taco;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

//end::head[]

@ModelAttribute
public void addIngredientsToModel(Model model) {
	List<Ingredient> ingredients = Arrays.asList(
	  new Ingredient("FLTO", "Pszenna", Type.WRAP),
	  new Ingredient("COTO", "Kukurydziana", Type.WRAP),
    new Ingredient("POTO", "Ziarnista", Type.WRAP),
	  new Ingredient("GRBF", "Mielona wołowina", Type.PROTEIN),
	  new Ingredient("CARN", "Kawałki mięsa", Type.PROTEIN),
	  new Ingredient("TMTO", "Pomidory pokrojone w kostkę", Type.VEGGIES),
	  new Ingredient("LETC", "Sałata", Type.VEGGIES),
	  new Ingredient("CHED", "Cheddar", Type.CHEESE),
	  new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
	  new Ingredient("SLSA", "Pikantny sos pomidorowy", Type.SAUCE),
	  new Ingredient("SRCR", "Śmietana", Type.SAUCE)
	);
	
	Type[] types = Ingredient.Type.values();
	for (Type type : types) {
	  model.addAttribute(type.toString().toLowerCase(),
	      filterByType(ingredients, type));
	}
}
	
//tag::showDesignForm[]
  @GetMapping
  public String showDesignForm(Model model) {
    model.addAttribute("design", new Taco());
    return "design";
  }

//end::showDesignForm[]

/*
//tag::processDesign[]
  @PostMapping
  public String processDesign(Design design) {
    // Save the taco design...
    // We'll do this in chapter 3
    log.info("Processing design: " + design);

    return "redirect:/orders/current";
  }

//end::processDesign[]
 */

//tag::processDesignValidated[]
  @PostMapping
  public String processDesign(@Valid @ModelAttribute Taco design, Errors errors, Model model) {
    if (errors.hasErrors()) {
      return "design";
    }

    // Zapisanie projektu przygotowanego Taco
    // Tym zajmiemy sie w rozdziale 3
    log.info("Processing design: " + design);

    return "redirect:/orders/current";
  }

//end::processDesignValidated[]

//tag::filterByType[]
  private List<Ingredient> filterByType(
      List<Ingredient> ingredients, Type type) {
    return ingredients
              .stream()
              .filter(x -> x.getType().equals(type))
              .collect(Collectors.toList());
  }

//end::filterByType[]
// tag::foot[]
}
// end::foot[]
