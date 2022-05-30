package it.bitrock.ex;

import lombok.*;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Paint {
    //id, title, yearOfCreation, artisticWave. (choise on your own the kind of data attribute)
    private Integer id;
    private String title;
    private String artisticWave;
    private Integer yearOfCreation;
}
