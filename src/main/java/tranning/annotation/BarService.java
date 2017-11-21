package tranning.annotation;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.val;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author Igor Hnes on 11/21/17.
 */
public class BarService {

    private final String name;

    public BarService(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        final Bar miracle = Bar.builder()
                .name("Miracle")
                .openTime(LocalDateTime.now())
                .closedTime(LocalDateTime.now().plusDays(1))
                .bartender("Ann")
                .bartender("Alex")
                .bottle(Bottle.of("beer", Beer.STAROPRAMEN))
                .build();


        miracle.closedTime();

        val barService = new BarService(BarService.class.getSimpleName());
    }


    @SneakyThrows
    public void asker() {
        new BufferedReader(new FileReader("aaaa.txt"));
    }
}
