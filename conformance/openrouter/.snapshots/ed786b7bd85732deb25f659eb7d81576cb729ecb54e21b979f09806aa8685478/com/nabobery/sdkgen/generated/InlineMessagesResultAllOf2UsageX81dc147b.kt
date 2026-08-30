package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1/properties/usage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1/properties/usage
 */
@Serializable(with = InlineMessagesResultAllOf2UsageX81dc147b.Serializer::class)
public class InlineMessagesResultAllOf2UsageX81dc147b internal constructor(
  public val cacheCreation: AnthropicCacheCreation?,
  public val cacheCreationInputTokens: Int?,
  public val cacheReadInputTokens: Int?,
  public val inferenceGeo: String?,
  public val inputTokens: Int,
  public val outputTokens: Int,
  public val outputTokensDetails: AnthropicOutputTokensDetails?,
  public val serverToolUse: AnthropicServerToolUsage?,
  public val serviceTier: AnthropicServiceTier?,
  private val costState: FieldState<Double?>,
  private val costDetailsState: FieldState<CostDetails?>,
  private val isByokState: FieldState<Boolean>,
  iterationsState: FieldState<List<AnthropicUsageIteration>>,
  private val speedState: FieldState<AnthropicSpeed?>,
) {
  private val iterationsState: FieldState<List<AnthropicUsageIteration>> =
      iterationsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val cost: Double?
    get() = costState.valueOrNull()

  public val costDetails: CostDetails?
    get() = costDetailsState.valueOrNull()

  public val isByok: Boolean?
    get() = isByokState.valueOrNull()

  public val iterations: List<AnthropicUsageIteration>?
    get() = iterationsState.valueOrNull()

  public val speed: AnthropicSpeed?
    get() = speedState.valueOrNull()

  public constructor(
    cacheCreation: AnthropicCacheCreation?,
    cacheCreationInputTokens: Int?,
    cacheReadInputTokens: Int?,
    inferenceGeo: String?,
    inputTokens: Int,
    outputTokens: Int,
    outputTokensDetails: AnthropicOutputTokensDetails?,
    serverToolUse: AnthropicServerToolUsage?,
    serviceTier: AnthropicServiceTier?,
  ) : this(cacheCreation = cacheCreation,
  cacheCreationInputTokens = cacheCreationInputTokens,
  cacheReadInputTokens = cacheReadInputTokens,
  inferenceGeo = inferenceGeo,
  inputTokens = inputTokens,
  outputTokens = outputTokens,
  outputTokensDetails = outputTokensDetails,
  serverToolUse = serverToolUse,
  serviceTier = serviceTier,
  costState = FieldState.Absent,
  costDetailsState = FieldState.Absent,
  isByokState = FieldState.Absent,
  iterationsState = FieldState.Absent,
  speedState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `cost`.
   */
  public fun costPresence(): FieldPresence = costState.presence

  /**
   * Returns the wire presence of `cost_details`.
   */
  public fun costDetailsPresence(): FieldPresence = costDetailsState.presence

  /**
   * Returns the wire presence of `is_byok`.
   */
  public fun isByokPresence(): FieldPresence = isByokState.presence

  /**
   * Returns the wire presence of `iterations`.
   */
  public fun iterationsPresence(): FieldPresence = iterationsState.presence

  /**
   * Returns the wire presence of `speed`.
   */
  public fun speedPresence(): FieldPresence = speedState.presence

  public class Builder {
    private var inputTokensValue: Int? = null

    public var inputTokens: Int
      get() = requireNotNull(inputTokensValue) { "inputTokens is required" }
      set(`value`) {
        inputTokensValue = value
      }

    private var outputTokensValue: Int? = null

    public var outputTokens: Int
      get() = requireNotNull(outputTokensValue) { "outputTokens is required" }
      set(`value`) {
        outputTokensValue = value
      }

    private var cacheCreationState: FieldState<AnthropicCacheCreation?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cacheCreation: AnthropicCacheCreation?
      get() = cacheCreationState.valueOrNull()
      set(`value`) {
        cacheCreationState = value.toNullableFieldState()
      }

    private var cacheCreationInputTokensState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cacheCreationInputTokens: Int?
      get() = cacheCreationInputTokensState.valueOrNull()
      set(`value`) {
        cacheCreationInputTokensState = value.toNullableFieldState()
      }

    private var cacheReadInputTokensState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var cacheReadInputTokens: Int?
      get() = cacheReadInputTokensState.valueOrNull()
      set(`value`) {
        cacheReadInputTokensState = value.toNullableFieldState()
      }

    private var inferenceGeoState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var inferenceGeo: String?
      get() = inferenceGeoState.valueOrNull()
      set(`value`) {
        inferenceGeoState = value.toNullableFieldState()
      }

    private var outputTokensDetailsState: FieldState<AnthropicOutputTokensDetails?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var outputTokensDetails: AnthropicOutputTokensDetails?
      get() = outputTokensDetailsState.valueOrNull()
      set(`value`) {
        outputTokensDetailsState = value.toNullableFieldState()
      }

    private var serverToolUseState: FieldState<AnthropicServerToolUsage?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var serverToolUse: AnthropicServerToolUsage?
      get() = serverToolUseState.valueOrNull()
      set(`value`) {
        serverToolUseState = value.toNullableFieldState()
      }

    private var serviceTierState: FieldState<AnthropicServiceTier?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var serviceTier: AnthropicServiceTier?
      get() = serviceTierState.valueOrNull()
      set(`value`) {
        serviceTierState = value.toNullableFieldState()
      }

    private var costState: FieldState<Double?> = FieldState.Absent

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var cost: Double?
      get() = costState.valueOrNull()
      set(`value`) {
        costState = value.toNullableFieldState()
      }

    private var costDetailsState: FieldState<CostDetails?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var costDetails: CostDetails?
      get() = costDetailsState.valueOrNull()
      set(`value`) {
        costDetailsState = value.toNullableFieldState()
      }

    private var isByokState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isByok: Boolean?
      get() = isByokState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isByok is not nullable; call unsetIsByok() to omit it" }
        isByokState = FieldState.Value(present)
      }

    private var iterationsState: FieldState<List<AnthropicUsageIteration>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var iterations: List<AnthropicUsageIteration>?
      get() = iterationsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "iterations is not nullable; call unsetIterations() to omit it" }
        iterationsState = FieldState.Value(present.toList())
      }

    private var speedState: FieldState<AnthropicSpeed?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var speed: AnthropicSpeed?
      get() = speedState.valueOrNull()
      set(`value`) {
        speedState = value.toNullableFieldState()
      }

    /**
     * Omits `cost` from serialized output.
     */
    public fun unsetCost() {
      costState = FieldState.Absent
    }

    /**
     * Omits `cost_details` from serialized output.
     */
    public fun unsetCostDetails() {
      costDetailsState = FieldState.Absent
    }

    /**
     * Omits `is_byok` from serialized output.
     */
    public fun unsetIsByok() {
      isByokState = FieldState.Absent
    }

    /**
     * Omits `iterations` from serialized output.
     */
    public fun unsetIterations() {
      iterationsState = FieldState.Absent
    }

    /**
     * Omits `speed` from serialized output.
     */
    public fun unsetSpeed() {
      speedState = FieldState.Absent
    }

    public fun build(): InlineMessagesResultAllOf2UsageX81dc147b {
      check(inputTokensValue != null) { "inputTokens is required" }
      check(outputTokensValue != null) { "outputTokens is required" }
      check(cacheCreationState !== FieldState.Absent) { "cacheCreation is required, even when null" }
      check(cacheCreationInputTokensState !== FieldState.Absent) { "cacheCreationInputTokens is required, even when null" }
      check(cacheReadInputTokensState !== FieldState.Absent) { "cacheReadInputTokens is required, even when null" }
      check(inferenceGeoState !== FieldState.Absent) { "inferenceGeo is required, even when null" }
      check(outputTokensDetailsState !== FieldState.Absent) { "outputTokensDetails is required, even when null" }
      check(serverToolUseState !== FieldState.Absent) { "serverToolUse is required, even when null" }
      check(serviceTierState !== FieldState.Absent) { "serviceTier is required, even when null" }
      return InlineMessagesResultAllOf2UsageX81dc147b(
        cacheCreation = cacheCreationState.valueOrNull(),
        cacheCreationInputTokens = cacheCreationInputTokensState.valueOrNull(),
        cacheReadInputTokens = cacheReadInputTokensState.valueOrNull(),
        inferenceGeo = inferenceGeoState.valueOrNull(),
        inputTokens = inputTokens,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetailsState.valueOrNull(),
        serverToolUse = serverToolUseState.valueOrNull(),
        serviceTier = serviceTierState.valueOrNull(),
        costState = costState,
        costDetailsState = costDetailsState,
        isByokState = isByokState,
        iterationsState = iterationsState,
        speedState = speedState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesResultAllOf2UsageX81dc147b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesResultAllOf2UsageX81dc147b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesResultAllOf2UsageX81dc147b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesResultAllOf2UsageX81dc147b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b must be a JSON object")
      val inputTokens = json.decodeRequired<Int>(rawObject, "input_tokens")
      val outputTokens = json.decodeRequired<Int>(rawObject, "output_tokens")
      if (!rawObject.containsKey("cache_creation")) {
        throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b is missing required property 'cache_creation'")
      }
      val cacheCreation = rawObject["cache_creation"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicCacheCreation?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cache_creation_input_tokens")) {
        throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b is missing required property 'cache_creation_input_tokens'")
      }
      val cacheCreationInputTokens = rawObject["cache_creation_input_tokens"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cache_read_input_tokens")) {
        throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b is missing required property 'cache_read_input_tokens'")
      }
      val cacheReadInputTokens = rawObject["cache_read_input_tokens"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("inference_geo")) {
        throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b is missing required property 'inference_geo'")
      }
      val inferenceGeo = rawObject["inference_geo"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("output_tokens_details")) {
        throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b is missing required property 'output_tokens_details'")
      }
      val outputTokensDetails = rawObject["output_tokens_details"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicOutputTokensDetails?>(requireNotNull(element)) }
      if (!rawObject.containsKey("server_tool_use")) {
        throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b is missing required property 'server_tool_use'")
      }
      val serverToolUse = rawObject["server_tool_use"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicServerToolUsage?>(requireNotNull(element)) }
      if (!rawObject.containsKey("service_tier")) {
        throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b is missing required property 'service_tier'")
      }
      val serviceTier = rawObject["service_tier"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicServiceTier?>(requireNotNull(element)) }
      return InlineMessagesResultAllOf2UsageX81dc147b(
        cacheCreation = cacheCreation,
        cacheCreationInputTokens = cacheCreationInputTokens,
        cacheReadInputTokens = cacheReadInputTokens,
        inferenceGeo = inferenceGeo,
        inputTokens = inputTokens,
        outputTokens = outputTokens,
        outputTokensDetails = outputTokensDetails,
        serverToolUse = serverToolUse,
        serviceTier = serviceTier,
        costState = json.decodeOptional(rawObject, "cost", nullable = true),
        costDetailsState = json.decodeOptional(rawObject, "cost_details", nullable = true),
        isByokState = json.decodeOptional(rawObject, "is_byok", nullable = false),
        iterationsState = json.decodeOptional(rawObject, "iterations", nullable = false),
        speedState = json.decodeOptional(rawObject, "speed", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesResultAllOf2UsageX81dc147b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesResultAllOf2UsageX81dc147b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cache_creation", value.cacheCreation?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cache_creation_input_tokens", value.cacheCreationInputTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cache_read_input_tokens", value.cacheReadInputTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("inference_geo", value.inferenceGeo?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("input_tokens", json.encodeToJsonElement(value.inputTokens))
        put("output_tokens", json.encodeToJsonElement(value.outputTokens))
        put("output_tokens_details", value.outputTokensDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("server_tool_use", value.serverToolUse?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("service_tier", value.serviceTier?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("cost", value.costState, json::encodeToJsonElement)
        putState("cost_details", value.costDetailsState, json::encodeToJsonElement)
        putState("is_byok", value.isByokState, json::encodeToJsonElement)
        putState("iterations", value.iterationsState, json::encodeToJsonElement)
        putState("speed", value.speedState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesResultAllOf2UsageX81dc147b(block: InlineMessagesResultAllOf2UsageX81dc147b.Builder.() -> Unit): InlineMessagesResultAllOf2UsageX81dc147b = InlineMessagesResultAllOf2UsageX81dc147b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineMessagesResultAllOf2UsageX81dc147b property '" + name + "' is not nullable")
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
