package com.nabobery.sdkgen.buildlogic.benchmark

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.doubleOrNull
import kotlinx.serialization.json.intOrNull
import kotlinx.serialization.json.longOrNull
import kotlinx.serialization.json.put

/** Identifies a single benchmark: which corpus was measured and which scenario within it. */
public data class BenchmarkIdentity(
    val corpus: String,
    val scenario: String,
) {
    init {
        require(corpus.isNotBlank()) { "corpus must not be blank" }
        require(scenario.isNotBlank()) { "scenario must not be blank" }
    }

    internal fun toJson(): JsonObject =
        buildJsonObject {
            put("corpus", corpus)
            put("scenario", scenario)
        }

    internal companion object {
        fun fromJson(json: JsonObject): BenchmarkIdentity =
            BenchmarkIdentity(
                corpus = json.requiredString("corpus"),
                scenario = json.requiredString("scenario"),
            )
    }
}

/** The physical quantity a measured value represents. Comparisons across records require matching units. */
public enum class MeasurementUnit {
    MILLISECONDS,
    SECONDS,
    BYTES,
    COUNT,
}

/**
 * Environment provenance for a single measurement. Captures only what makes cross-machine comparison honest:
 * the JVM, the OS/CPU, and the concurrency/heap budget the measurement ran under. Deliberately excludes
 * wall-clock timestamps and hostnames, which make records non-reproducible and leak host identity without
 * adding any comparability value.
 */
public data class MeasurementEnvironment(
    val jvmVersion: String,
    val osName: String,
    val osArch: String,
    val workerCount: Int,
    val heapBytes: Long,
) {
    init {
        require(jvmVersion.isNotBlank()) { "jvmVersion must not be blank" }
        require(osName.isNotBlank()) { "osName must not be blank" }
        require(osArch.isNotBlank()) { "osArch must not be blank" }
        require(workerCount >= 1) { "workerCount must be at least 1, was $workerCount" }
        require(heapBytes >= 1) { "heapBytes must be at least 1, was $heapBytes" }
    }

    internal fun toJson(): JsonObject =
        buildJsonObject {
            put("jvmVersion", jvmVersion)
            put("osName", osName)
            put("osArch", osArch)
            put("workerCount", workerCount)
            put("heapBytes", heapBytes)
        }

    internal companion object {
        fun fromJson(json: JsonObject): MeasurementEnvironment =
            MeasurementEnvironment(
                jvmVersion = json.requiredString("jvmVersion"),
                osName = json.requiredString("osName"),
                osArch = json.requiredString("osArch"),
                workerCount = json.requiredInt("workerCount"),
                heapBytes = json.requiredLong("heapBytes"),
            )
    }
}

/**
 * A single, deterministic record of one benchmark run: identity, measured value with an explicit unit,
 * the sample count backing that value, and environment provenance. Records never carry a wall-clock
 * timestamp or hostname; see [MeasurementEnvironment] for why.
 */
public data class MeasurementRecord(
    val identity: BenchmarkIdentity,
    val value: Double,
    val unit: MeasurementUnit,
    val sampleCount: Int,
    val environment: MeasurementEnvironment,
) {
    init {
        require(value.isFinite()) { "value must be finite, was $value" }
        require(value >= 0.0) { "value must not be negative, was $value" }
        require(sampleCount >= 1) { "sampleCount must be at least 1, was $sampleCount" }
    }

    public fun toJson(): String =
        Json.encodeToString(
            JsonObject.serializer(),
            buildJsonObject {
                put("corpus", identity.corpus)
                put("scenario", identity.scenario)
                put("value", value)
                put("unit", unit.name)
                put("sampleCount", sampleCount)
                put("environment", environment.toJson())
            },
        )

    public companion object {
        /** Parses a [MeasurementRecord] from JSON text. Fails closed: any malformed or missing field throws. */
        public fun parse(text: String): MeasurementRecord {
            val json =
                runCatching { Json.parseToJsonElement(text) }
                    .getOrElse { throw IllegalArgumentException("measurement record is not valid JSON: ${it.message}") }
                    .asObjectOrThrow("measurement record")

            return MeasurementRecord(
                identity = BenchmarkIdentity.fromJson(json),
                value = json.requiredDouble("value"),
                unit = json.requiredEnum("unit", MeasurementUnit.entries),
                sampleCount = json.requiredInt("sampleCount"),
                environment = MeasurementEnvironment.fromJson(json.requiredObject("environment")),
            )
        }
    }
}

/** A budget for one benchmark identity: the maximum acceptable value, in the same unit as the measurements. */
public data class BenchmarkBudget(
    val identity: BenchmarkIdentity,
    val unit: MeasurementUnit,
    val maxValue: Double,
) {
    init {
        require(maxValue.isFinite()) { "maxValue must be finite, was $maxValue" }
        // Strictly positive, not merely non-negative: a budget of zero asserts that the benchmark may consume no
        // time, bytes, or operations at all, which no real measurement can satisfy. Accepting it would let a
        // meaningless budget fail every run for a reason unrelated to performance.
        require(maxValue > 0.0) { "maxValue must be positive, was $maxValue" }
    }

    public companion object {
        /** Parses a [BenchmarkBudget] from JSON text. Fails closed: any malformed or missing field throws. */
        public fun parse(text: String): BenchmarkBudget {
            val json =
                runCatching { Json.parseToJsonElement(text) }
                    .getOrElse { throw IllegalArgumentException("benchmark budget is not valid JSON: ${it.message}") }
                    .asObjectOrThrow("benchmark budget")

            return BenchmarkBudget(
                identity = BenchmarkIdentity.fromJson(json),
                unit = json.requiredEnum("unit", MeasurementUnit.entries),
                maxValue = json.requiredDouble("maxValue"),
            )
        }
    }
}

private fun JsonElement.asObjectOrThrow(label: String): JsonObject =
    this as? JsonObject ?: throw IllegalArgumentException("$label must be a JSON object")

private fun JsonObject.requiredString(name: String): String =
    (this[name] as? JsonPrimitive)?.takeIf { it.isString }?.content
        ?: throw IllegalArgumentException("missing or non-string field \"$name\"")

private fun JsonObject.requiredObject(name: String): JsonObject =
    this[name]?.let { it as? JsonObject }
        ?: throw IllegalArgumentException("missing or non-object field \"$name\"")

private fun JsonObject.requiredDouble(name: String): Double =
    (this[name] as? JsonPrimitive)?.doubleOrNull
        ?: throw IllegalArgumentException("missing or non-numeric field \"$name\"")

private fun JsonObject.requiredInt(name: String): Int =
    (this[name] as? JsonPrimitive)?.intOrNull
        ?: throw IllegalArgumentException("missing or non-integer field \"$name\"")

private fun JsonObject.requiredLong(name: String): Long =
    (this[name] as? JsonPrimitive)?.longOrNull
        ?: throw IllegalArgumentException("missing or non-integer field \"$name\"")

private fun <T : Enum<T>> JsonObject.requiredEnum(
    name: String,
    values: List<T>,
): T {
    val raw = requiredString(name)
    return values.firstOrNull { it.name == raw }
        ?: throw IllegalArgumentException(
            "field \"$name\" has unknown value \"$raw\"; expected one of ${values.joinToString { it.name }}",
        )
}
