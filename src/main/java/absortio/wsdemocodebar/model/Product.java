package absortio.wsdemocodebar.model;

import javax.persistence.*;

@Entity(name = "ProductModel")
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_idproduct_seq")
    @SequenceGenerator(name = "product_idproduct_seq", sequenceName = "product_idproduct_seq", allocationSize = 1)
    @Column(name = "idproduct")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "barcode")
    private String barCode;
    @Column(name = "enterprise")
    private String enterprise;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
}
