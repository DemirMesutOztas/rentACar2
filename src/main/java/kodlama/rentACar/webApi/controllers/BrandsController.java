package kodlama.rentACar.webApi.controllers;

import kodlama.rentACar.business.abstracts.BrandService;
import kodlama.rentACar.business.requests.CreateBrandRequest;
import kodlama.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;
/*
    //parametrelerine bak, uygulamayı tara, kim kullanıyor bul, newle
    @Autowired
    public BrandsController(BrandService brandService)
    {

        this.brandService = brandService;
    }
*/
    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll()
    {

        return brandService.getAll();
    }
    //requstbody isteğin bodysinden al
    @PostMapping("/add")
    public void add( @RequestBody() CreateBrandRequest createBrandRequest)
    {
        this.brandService.add(createBrandRequest);

    }
}
