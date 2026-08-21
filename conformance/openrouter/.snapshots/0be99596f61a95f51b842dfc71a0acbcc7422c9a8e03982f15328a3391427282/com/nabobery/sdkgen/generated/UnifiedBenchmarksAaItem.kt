package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksAAItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksAAItem
 */
@Serializable(with = UnifiedBenchmarksAaItem.Serializer::class)
public class UnifiedBenchmarksAaItem(
  /**
   * Artificial Analysis Agentic Index composite score. Higher is better.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val agenticIndex: Double?,
  /**
   * Artificial Analysis Coding Index composite score. Higher is better.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val codingIndex: Double?,
  /**
   * Model name as listed on Artificial Analysis.
   */
  public val displayName: String,
  /**
   * Artificial Analysis Intelligence Index composite score. Higher is better.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val intelligenceIndex: Double?,
  /**
   * Stable OpenRouter model identifier.
   */
  public val modelPermaslug: String,
  public val pricing: UnifiedBenchmarkPricing?,
  /**
   * Benchmark source discriminator.
   */
  public val source: InlineUnifiedBenchmarksAaItemSourceX724e0cad,
) {
  public class Builder {
    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var modelPermaslugValue: String? = null

    public var modelPermaslug: String
      get() = requireNotNull(modelPermaslugValue) { "modelPermaslug is required" }
      set(`value`) {
        modelPermaslugValue = value
      }

    private var sourceValue: InlineUnifiedBenchmarksAaItemSourceX724e0cad? = null

    public var source: InlineUnifiedBenchmarksAaItemSourceX724e0cad
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var agenticIndexState: FieldState<Double?> = FieldState.Absent

    /**
     * Artificial Analysis Agentic Index composite score. Higher is better.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var agenticIndex: Double?
      get() = agenticIndexState.valueOrNull()
      set(`value`) {
        agenticIndexState = value.toNullableFieldState()
      }

    private var codingIndexState: FieldState<Double?> = FieldState.Absent

    /**
     * Artificial Analysis Coding Index composite score. Higher is better.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var codingIndex: Double?
      get() = codingIndexState.valueOrNull()
      set(`value`) {
        codingIndexState = value.toNullableFieldState()
      }

    private var intelligenceIndexState: FieldState<Double?> = FieldState.Absent

    /**
     * Artificial Analysis Intelligence Index composite score. Higher is better.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var intelligenceIndex: Double?
      get() = intelligenceIndexState.valueOrNull()
      set(`value`) {
        intelligenceIndexState = value.toNullableFieldState()
      }

    private var pricingState: FieldState<UnifiedBenchmarkPricing?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pricing: UnifiedBenchmarkPricing?
      get() = pricingState.valueOrNull()
      set(`value`) {
        pricingState = value.toNullableFieldState()
      }

    public fun build(): UnifiedBenchmarksAaItem {
      check(displayNameValue != null) { "displayName is required" }
      check(modelPermaslugValue != null) { "modelPermaslug is required" }
      check(sourceValue != null) { "source is required" }
      check(agenticIndexState !== FieldState.Absent) { "agenticIndex is required, even when null" }
      check(codingIndexState !== FieldState.Absent) { "codingIndex is required, even when null" }
      check(intelligenceIndexState !== FieldState.Absent) { "intelligenceIndex is required, even when null" }
      check(pricingState !== FieldState.Absent) { "pricing is required, even when null" }
      return UnifiedBenchmarksAaItem(
        agenticIndex = agenticIndexState.valueOrNull(),
        codingIndex = codingIndexState.valueOrNull(),
        displayName = displayName,
        intelligenceIndex = intelligenceIndexState.valueOrNull(),
        modelPermaslug = modelPermaslug,
        pricing = pricingState.valueOrNull(),
        source = source,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UnifiedBenchmarksAaItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UnifiedBenchmarksAaItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UnifiedBenchmarksAaItem {
      val jsonDecoder = decoder.requireJsonDecoder("UnifiedBenchmarksAaItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UnifiedBenchmarksAaItem must be a JSON object")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val modelPermaslug = json.decodeRequired<String>(rawObject, "model_permaslug")
      val source = json.decodeRequired<InlineUnifiedBenchmarksAaItemSourceX724e0cad>(rawObject, "source")
      if (!rawObject.containsKey("agentic_index")) {
        throw SerializationException("UnifiedBenchmarksAaItem is missing required property 'agentic_index'")
      }
      val agenticIndex = rawObject["agentic_index"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("coding_index")) {
        throw SerializationException("UnifiedBenchmarksAaItem is missing required property 'coding_index'")
      }
      val codingIndex = rawObject["coding_index"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("intelligence_index")) {
        throw SerializationException("UnifiedBenchmarksAaItem is missing required property 'intelligence_index'")
      }
      val intelligenceIndex = rawObject["intelligence_index"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pricing")) {
        throw SerializationException("UnifiedBenchmarksAaItem is missing required property 'pricing'")
      }
      val pricing = rawObject["pricing"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<UnifiedBenchmarkPricing?>(requireNotNull(element)) }
      return UnifiedBenchmarksAaItem(
        agenticIndex = agenticIndex,
        codingIndex = codingIndex,
        displayName = displayName,
        intelligenceIndex = intelligenceIndex,
        modelPermaslug = modelPermaslug,
        pricing = pricing,
        source = source,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UnifiedBenchmarksAaItem) {
      val jsonEncoder = encoder.requireJsonEncoder("UnifiedBenchmarksAaItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("agentic_index", value.agenticIndex?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("coding_index", value.codingIndex?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("display_name", value.displayName)
        put("intelligence_index", value.intelligenceIndex?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("model_permaslug", value.modelPermaslug)
        put("pricing", value.pricing?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("source", json.encodeToJsonElement(value.source))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun unifiedBenchmarksAaItem(block: UnifiedBenchmarksAaItem.Builder.() -> Unit): UnifiedBenchmarksAaItem = UnifiedBenchmarksAaItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UnifiedBenchmarksAaItem is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("UnifiedBenchmarksAaItem property '" + name + "' is not nullable")
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
