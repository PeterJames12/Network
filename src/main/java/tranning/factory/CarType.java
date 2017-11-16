package tranning.factory;

/**
 * @author Igor Hnes on 11/16/17.
 */
public enum CarType {
    MAZDA,
    HONDA{
        @Override
        public String toString() {
            return "mazda";
        }
    }
}
