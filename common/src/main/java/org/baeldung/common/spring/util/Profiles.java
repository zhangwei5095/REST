package org.baeldung.common.spring.util;

public final class Profiles {

    // these 3 profiles are modeling the environments - deployed is active for any deployment, dev and production for these specific environments
    public static final String DEPLOYED = "deployed";
    public static final String DEV = "dev";
    public static final String LOCAL = "local";

    // common
    public static final String TEST = "test";
    public static final String CLIENT = "client";

    private Profiles() {
        throw new AssertionError();
    }

}
