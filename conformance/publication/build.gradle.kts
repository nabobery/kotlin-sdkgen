plugins {
    id("sdkgen.kotlin-jvm")
    id("sdkgen.verify-publication-metadata")
    id("sdkgen.stage-publication-inventory")
}

tasks.named("executeIsolatedConsumerBuild") {
    dependsOn("verifyStagedArtifactInventory")
}
