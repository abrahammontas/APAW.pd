package es.upm.miw.pd.singleton.factory.solution;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {
    private static ReferencesFactory instance = null;

    private Map<String, Integer> references;

    private int reference;

    public ReferencesFactory() {
        this.references = new HashMap<>();
        this.reference = 0;
    }

    public static ReferencesFactory getFactory() {
        // Creación perezosa
        if (ReferencesFactory.instance == null) {
            ReferencesFactory.instance = new ReferencesFactory();
        }
        return ReferencesFactory.instance;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }
}
