package it.bitrock.ex;
import lombok.*;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Museum {
    // id, name, address, state, numberOfPainting, telephones
    private Integer id;
    private String name,address,state;
    private Integer numberOfPainting,telephones;


}
