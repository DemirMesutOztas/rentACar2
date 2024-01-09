package kodlama.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//tablo haline getirmek için
@Table(name="brands")
@Data //getter ve setter oluşturuyor
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// id birer birer artır demek
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;





}
