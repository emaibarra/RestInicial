package com.example.inicial1.dtos;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class PersonaDto { //para no traerse campos al pedo, asi no pagas tanto trafico a n a s h e

    private Long id;
    private String nombre;
    private String apellido;
}
