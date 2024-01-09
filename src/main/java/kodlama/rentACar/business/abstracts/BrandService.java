package kodlama.rentACar.business.abstracts;

import kodlama.rentACar.business.requests.CreateBrandRequest;
import kodlama.rentACar.business.responses.GetAllBrandsResponse;
import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    void add( CreateBrandRequest createBrandRequest);





}
