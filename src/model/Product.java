package model;

import java.time.LocalDate;
import java.util.Arrays;

public class Product {
    private Integer id;
    private String pName;
    private String uuid;
    private String description;
    private LocalDate date;
    private LocalDate expireDate;
    private String[] pImages;
    private ProductCategory[] productCategories;
    //constructor
    public Product() {}
    public Product(Integer id, String pName,String uuid, String description, LocalDate date, LocalDate expireDate, String[] pImages, ProductCategory[] productCategories) {
        this.id = id;
        this.pName = pName;
        this.uuid = uuid;
        this.description = description;
        this.date = date;
        this.expireDate = expireDate;
        this.pImages = pImages;
        this.productCategories = productCategories;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", uuid=" + uuid +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", expireDate=" + expireDate +
                ", pImages=" + Arrays.toString(pImages) +
                ", productCategories=" + Arrays.toString(productCategories) +
                '}';
    }
}
