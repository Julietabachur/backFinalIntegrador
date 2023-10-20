package com.backendIntegrador.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data //getters y setters
@Builder
@NoArgsConstructor //constructor vacio
@AllArgsConstructor //constructor con todos los atributos
@Document(collection = "product") // nombre de la ubicacion de los datos en la BD
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    @Id
    private String id;
    private String productName;
    private Size productSize;
    private Type type;
    private LocalDate productionTime;
    private String thumbnail;
    private List<String> gallery;
    private String set;
    private String customSet;
    private String Detail;

}
