package kodlama.rentACar.business.concretes;

import kodlama.rentACar.business.abstracts.BrandService;
import kodlama.rentACar.business.requests.CreateBrandRequest;
import kodlama.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//ioc eklemek için eklendi. otomatik newle
@Service // bu sınıf bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {

    //iş kuralları

    private BrandRepository brandRepository;
/*
    //parametrelerine bak, uygulamayı tara, kim kullanıyor bul, newle
    @Autowired
    public BrandManager(BrandRepository brandRepository) {

        this.brandRepository = brandRepository;
    }
*/
    @Override
    public List<GetAllBrandsResponse> getAll()
    {

        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> resonseBrands = new ArrayList<GetAllBrandsResponse>();

        for(Brand brand: brands)
        {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            resonseBrands.add(responseItem);
        }
        return resonseBrands ;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest)
    {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        this.brandRepository.save(brand);
    }
}
