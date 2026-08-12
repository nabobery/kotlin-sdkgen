import com.nabobery.sdkgen.buildlogic.conformance.CorpusGenerationMode
import com.nabobery.sdkgen.buildlogic.conformance.CorpusGenerationTask

plugins {
    id("sdkgen.conformance-corpus")
}

val sdkgenCliRuntimeClasspath =
    configurations.create("sdkgenCliRuntimeClasspath") {
        isCanBeConsumed = false
        isCanBeResolved = true
    }

dependencies {
    add(sdkgenCliRuntimeClasspath.name, project(":generator:cli"))
}

fun registerCorpusTask(
    name: String,
    mode: CorpusGenerationMode,
) =
    tasks.register<CorpusGenerationTask>(name) {
        group = "verification"
        cliRuntimeClasspath.from(sdkgenCliRuntimeClasspath)
        this.mode.set(mode)
        configFile.set(layout.projectDirectory.file("sdkgen.yaml"))
        specificationFile.set(layout.projectDirectory.file("openapi.yaml"))
        lockFile.set(layout.projectDirectory.file("sdkgen.lock"))
    }

registerCorpusTask("regenerateCorpus", CorpusGenerationMode.GENERATE)
registerCorpusTask("checkCorpusDrift", CorpusGenerationMode.CHECK)
