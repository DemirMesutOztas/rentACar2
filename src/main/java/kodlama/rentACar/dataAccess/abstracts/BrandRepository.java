package kodlama.rentACar.dataAccess.abstracts;

import kodlama.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandRepository extends JpaRepository<Brand,Integer>
{


}
