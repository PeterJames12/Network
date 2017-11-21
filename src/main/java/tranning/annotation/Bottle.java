package tranning.annotation;

import lombok.RequiredArgsConstructor;

/**
 * @author Igor Hnes on 11/21/17.
 */
@RequiredArgsConstructor(staticName = "of")
public class Bottle {

    private final String name;
    private final Beer bottle;
}
