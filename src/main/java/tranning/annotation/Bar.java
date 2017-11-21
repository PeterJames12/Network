package tranning.annotation;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @author Igor Hnes on 11/21/17.
 */
@Getter
@Builder
@Accessors(fluent = true)
public class Bar {

    @NonNull
    private String name;
    private final LocalDateTime openTime;
    @Setter
    private LocalDateTime closedTime;
    @Singular
    private List<String> bartenders;
    @Singular
    private List<Bottle> bottles;
}
