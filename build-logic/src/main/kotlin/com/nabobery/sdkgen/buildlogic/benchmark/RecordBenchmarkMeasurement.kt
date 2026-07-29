package com.nabobery.sdkgen.buildlogic.benchmark

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault
import java.util.Properties

/**
 * Turns a benchmark test task's existing `.properties` output into one [MeasurementRecord] JSON file.
 *
 * This task lives in `build-logic`, not in the benchmark's owning module, so that module never gains a
 * dependency on `build-logic` classes just to emit benchmark-budget evidence: the benchmark test writes plain
 * `key=value` properties (as `GitHubScaleBenchmarkTest` already does), and this task — wired in only at
 * the Gradle layer of the owning module's `build.gradle.kts` — reads four of those keys
 * (`adaptation_ms`, `projection_ms`, `emission_ms`, `publication_ms`), sums them into one total
 * generation-wall-time value, and writes the typed record the benchmark-budget verifier consumes.
 *
 * Every input is a lazy `Property`/`RegularFileProperty`, all work happens inside [record] at execution
 * time, and the task never touches `Project` — it is configuration-cache safe.
 *
 * Fails closed: a missing properties file, an unreadable one, or one missing/mangling any of the four
 * required keys throws rather than writing a partial, zero-filled, or best-effort record.
 */
@DisableCachingByDefault(
    because = "Wraps a single already-measured, non-reproducible benchmark run; caching would hide reruns.",
)
public abstract class RecordBenchmarkMeasurement : DefaultTask() {
    @get:InputFile
    @get:PathSensitive(PathSensitivity.NONE)
    public abstract val propertiesFile: RegularFileProperty

    /** [BenchmarkIdentity.corpus] for the emitted record. */
    @get:Input
    public abstract val corpus: Property<String>

    /** [BenchmarkIdentity.scenario] for the emitted record. */
    @get:Input
    public abstract val scenario: Property<String>

    /**
     * Declared, fixed worker count for [MeasurementEnvironment.workerCount]. Deliberately not read from
     * ambient Gradle state (e.g. `--max-workers`, `Runtime.availableProcessors()`), which varies run to
     * run and would make otherwise-identical records fail the verifier's environment-matching guard for
     * a reason unrelated to performance. The caller declares one fixed value and keeps it stable across
     * the three records that back one budget.
     */
    @get:Input
    public abstract val workerCount: Property<Int>

    /**
     * Declared heap budget, in bytes, for [MeasurementEnvironment.heapBytes]. Deliberately not read from
     * ambient JVM state (e.g. `Runtime.maxMemory()` of the Gradle worker running this task, which is not
     * the same JVM/heap the benchmark test executed under). The caller derives this from the benchmark
     * task's own configured `maxHeapSize` and passes it through explicitly.
     */
    @get:Input
    public abstract val heapBytes: Property<Long>

    @get:OutputFile
    public abstract val outputRecord: RegularFileProperty

    @TaskAction
    public fun record() {
        val file = propertiesFile.get().asFile
        check(file.isFile) { "benchmark properties file does not exist: ${file.absolutePath}" }

        val properties = Properties()
        runCatching { file.reader().use(properties::load) }
            .onFailure {
                throw IllegalStateException("could not read benchmark properties file: ${file.absolutePath}", it)
            }

        val missing = REQUIRED_STAGE_KEYS.filterNot { properties.containsKey(it) }
        check(missing.isEmpty()) {
            "benchmark properties file ${file.absolutePath} is missing required keys: ${missing.joinToString()}"
        }

        val stageMillis =
            REQUIRED_STAGE_KEYS.associateWith { key ->
                val raw = properties.getProperty(key)
                raw.toLongOrNull()
                    ?: throw IllegalStateException(
                        "benchmark properties file ${file.absolutePath} has a non-numeric value for " +
                            "\"$key\": \"$raw\"",
                    )
            }
        val totalMillis = stageMillis.values.sum()

        val measurementRecord =
            MeasurementRecord(
                identity = BenchmarkIdentity(corpus = corpus.get(), scenario = scenario.get()),
                value = totalMillis.toDouble(),
                unit = MeasurementUnit.MILLISECONDS,
                sampleCount = 1,
                environment =
                    MeasurementEnvironment(
                        jvmVersion = requireSystemProperty("java.version"),
                        osName = requireSystemProperty("os.name"),
                        osArch = requireSystemProperty("os.arch"),
                        workerCount = workerCount.get(),
                        heapBytes = heapBytes.get(),
                    ),
            )

        val output = outputRecord.get().asFile
        output.parentFile.mkdirs()
        output.writeText(measurementRecord.toJson())
    }

    private fun requireSystemProperty(name: String): String =
        System.getProperty(name) ?: error("system property \"$name\" is unavailable")

    private companion object {
        val REQUIRED_STAGE_KEYS = listOf("adaptation_ms", "projection_ms", "emission_ms", "publication_ms")
    }
}
