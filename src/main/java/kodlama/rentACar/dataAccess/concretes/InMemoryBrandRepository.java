package kodlama.rentACar.dataAccess.concretes;

import kodlama.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // bu sınıf dataaccess nesnesi
public class InMemoryBrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"AUDI"));
        brands.add(new Brand(3,"MERCEDES"));

    }

    /*@Override
    public List<Brand> getAll() {

        return brands;
    }*/

}
