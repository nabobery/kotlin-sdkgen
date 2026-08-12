plugins {
    base
    alias(libs.plugins.cyclonedx)
}

group = "io.github.nabobery"

nmcpAggregation {
    // Several conformance subprojects intentionally share the leaf name `consumer`.
    // Nmcp aggregates by project path, so these names are safe for this build.
    allowDuplicateProjectNames.set(true)
}

allprojects {
    version = providers.gradleProperty("sdkgenVersion").get()
}
