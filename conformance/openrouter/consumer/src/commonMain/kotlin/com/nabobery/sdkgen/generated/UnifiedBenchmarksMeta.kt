package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksMeta.
 */
@Serializable(with = UnifiedBenchmarksMeta.Serializer::class)
public class UnifiedBenchmarksMeta(
  /**
   * ISO-8601 timestamp of when this data was last updated.
   */
  public val asOf: String,
  /**
   * Required attribution when republishing this data, or null when results span multiple sources (attribute each item
   * individually by its `source` discriminator).
   */
  public val citation: String?,
  /**
   * Number of unique models in the response.
   */
  public val modelCount: Int,
  /**
   * The source filter applied, or null when all sources are returned.
   */
  public val source: InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource?,
  /**
   * URL of the upstream data source, or null when results span multiple sources.
   */
  public val sourceUrl: String?,
  /**
   * The task_type filter applied, or null if showing all.
   */
  public val taskType: String?,
  /**
   * Dataset version.
   */
  public val version: InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion,
) {
  public class Builder {
    private var asOfValue: String? = null

    public var asOf: String
      get() = requireNotNull(asOfValue) { "asOf is required" }
      set(`value`) {
        asOfValue = value
      }

    private var modelCountValue: Int? = null

    public var modelCount: Int
      get() = requireNotNull(modelCountValue) { "modelCount is required" }
      set(`value`) {
        modelCountValue = value
      }

    private var versionValue: InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion? = null

    public var version: InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    private var citationState: FieldState<String?> = FieldState.Absent

    /**
     * Required attribution when republishing this data, or null when results span multiple sources (attribute each item
     * individually by its `source` discriminator).
     * Required nullable field; assigning `null` records present-null.
     */
    public var citation: String?
      get() = citationState.valueOrNull()
      set(`value`) {
        citationState = value.toNullableFieldState()
      }

    private var sourceState:
        FieldState<InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource?> =
        FieldState.Absent

    /**
     * The source filter applied, or null when all sources are returned.
     * Required nullable field; assigning `null` records present-null.
     */
    public var source: InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource?
      get() = sourceState.valueOrNull()
      set(`value`) {
        sourceState = value.toNullableFieldState()
      }

    private var sourceUrlState: FieldState<String?> = FieldState.Absent

    /**
     * URL of the upstream data source, or null when results span multiple sources.
     * Required nullable field; assigning `null` records present-null.
     */
    public var sourceUrl: String?
      get() = sourceUrlState.valueOrNull()
      set(`value`) {
        sourceUrlState = value.toNullableFieldState()
      }

    private var taskTypeState: FieldState<String?> = FieldState.Absent

    /**
     * The task_type filter applied, or null if showing all.
     * Required nullable field; assigning `null` records present-null.
     */
    public var taskType: String?
      get() = taskTypeState.valueOrNull()
      set(`value`) {
        taskTypeState = value.toNullableFieldState()
      }

    public fun build(): UnifiedBenchmarksMeta {
      check(asOfValue != null) { "asOf is required" }
      check(modelCountValue != null) { "modelCount is required" }
      check(versionValue != null) { "version is required" }
      check(citationState !== FieldState.Absent) { "citation is required, even when null" }
      check(sourceState !== FieldState.Absent) { "source is required, even when null" }
      check(sourceUrlState !== FieldState.Absent) { "sourceUrl is required, even when null" }
      check(taskTypeState !== FieldState.Absent) { "taskType is required, even when null" }
      return UnifiedBenchmarksMeta(
        asOf = asOf,
        citation = citationState.valueOrNull(),
        modelCount = modelCount,
        source = sourceState.valueOrNull(),
        sourceUrl = sourceUrlState.valueOrNull(),
        taskType = taskTypeState.valueOrNull(),
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UnifiedBenchmarksMeta = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<UnifiedBenchmarksMeta> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UnifiedBenchmarksMeta {
      val jsonDecoder = decoder.requireJsonDecoder("UnifiedBenchmarksMeta")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("UnifiedBenchmarksMeta must be a JSON object")
      val asOf = json.decodeRequired<String>(raw, "as_of")
      val modelCount = json.decodeRequired<Int>(raw, "model_count")
      val version = json.decodeRequired<InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesVersion>(raw, "version")
      if (!raw.containsKey("citation")) {
        throw SerializationException("UnifiedBenchmarksMeta is missing required property 'citation'")
      }
      val citation = raw["citation"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("source")) {
        throw SerializationException("UnifiedBenchmarksMeta is missing required property 'source'")
      }
      val source = raw["source"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<InlineComponentsSchemasUnifiedBenchmarksMetaPropertiesSource?>(requireNotNull(element)) }
      if (!raw.containsKey("source_url")) {
        throw SerializationException("UnifiedBenchmarksMeta is missing required property 'source_url'")
      }
      val sourceUrl = raw["source_url"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("task_type")) {
        throw SerializationException("UnifiedBenchmarksMeta is missing required property 'task_type'")
      }
      val taskType = raw["task_type"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return UnifiedBenchmarksMeta(
        asOf = asOf,
        citation = citation,
        modelCount = modelCount,
        source = source,
        sourceUrl = sourceUrl,
        taskType = taskType,
        version = version,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UnifiedBenchmarksMeta) {
      val jsonEncoder = encoder.requireJsonEncoder("UnifiedBenchmarksMeta")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("as_of", value.asOf)
        put("citation", value.citation?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("model_count", json.encodeToJsonElement(value.modelCount))
        put("source", value.source?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("source_url", value.sourceUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("task_type", value.taskType?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("version", json.encodeToJsonElement(value.version))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun unifiedBenchmarksMeta(block: UnifiedBenchmarksMeta.Builder.() -> Unit): UnifiedBenchmarksMeta =
  UnifiedBenchmarksMeta.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UnifiedBenchmarksMeta is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("UnifiedBenchmarksMeta property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
