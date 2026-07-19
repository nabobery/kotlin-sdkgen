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
 * Information about a specific model endpoint
 */
@Serializable(with = PublicEndpoint.Serializer::class)
public class PublicEndpoint internal constructor(
  public val contextLength: Int,
  public val latencyLast30m: PercentileStats?,
  public val maxCompletionTokens: Int?,
  public val maxPromptTokens: Int?,
  /**
   * The unique identifier for the model (permaslug)
   */
  public val modelId: String,
  public val modelName: String,
  public val name: String,
  public val pricing: InlineComponentsSchemasPublicEndpointPropertiesPricing,
  public val providerName: ProviderName,
  public val quantization: Quantization?,
  supportedParameters: List<Parameter>,
  public val supportsImplicitCaching: Boolean,
  public val tag: String,
  public val throughputLast30m: PercentileStats?,
  /**
   * Uptime percentage over the last 1 day, calculated as successful requests / (successful + error requests) * 100.
   * Rate-limited requests are excluded. Returns null if insufficient data.
   */
  public val uptimeLast1d: Double?,
  public val uptimeLast30m: Double?,
  /**
   * Uptime percentage over the last 5 minutes, calculated as successful requests / (successful + error requests) * 100.
   * Rate-limited requests are excluded. Returns null if insufficient data.
   */
  public val uptimeLast5m: Double?,
  private val statusState: FieldState<Int>,
) {
  public val supportedParameters: List<Parameter> = supportedParameters.toList()

  public val status: Int?
    get() = statusState.valueOrNull()

  public constructor(
    contextLength: Int,
    latencyLast30m: PercentileStats?,
    maxCompletionTokens: Int?,
    maxPromptTokens: Int?,
    modelId: String,
    modelName: String,
    name: String,
    pricing: InlineComponentsSchemasPublicEndpointPropertiesPricing,
    providerName: ProviderName,
    quantization: Quantization?,
    supportedParameters: List<Parameter>,
    supportsImplicitCaching: Boolean,
    tag: String,
    throughputLast30m: PercentileStats?,
    uptimeLast1d: Double?,
    uptimeLast30m: Double?,
    uptimeLast5m: Double?,
  ) : this(contextLength = contextLength,
  latencyLast30m = latencyLast30m,
  maxCompletionTokens = maxCompletionTokens,
  maxPromptTokens = maxPromptTokens,
  modelId = modelId,
  modelName = modelName,
  name = name,
  pricing = pricing,
  providerName = providerName,
  quantization = quantization,
  supportedParameters = supportedParameters,
  supportsImplicitCaching = supportsImplicitCaching,
  tag = tag,
  throughputLast30m = throughputLast30m,
  uptimeLast1d = uptimeLast1d,
  uptimeLast30m = uptimeLast30m,
  uptimeLast5m = uptimeLast5m,
  statusState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `status`.
   */
  public fun statusPresence(): FieldPresence = statusState.presence

  public class Builder {
    private var contextLengthValue: Int? = null

    public var contextLength: Int
      get() = requireNotNull(contextLengthValue) { "contextLength is required" }
      set(`value`) {
        contextLengthValue = value
      }

    private var modelIdValue: String? = null

    public var modelId: String
      get() = requireNotNull(modelIdValue) { "modelId is required" }
      set(`value`) {
        modelIdValue = value
      }

    private var modelNameValue: String? = null

    public var modelName: String
      get() = requireNotNull(modelNameValue) { "modelName is required" }
      set(`value`) {
        modelNameValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var pricingValue: InlineComponentsSchemasPublicEndpointPropertiesPricing? = null

    public var pricing: InlineComponentsSchemasPublicEndpointPropertiesPricing
      get() = requireNotNull(pricingValue) { "pricing is required" }
      set(`value`) {
        pricingValue = value
      }

    private var providerNameValue: ProviderName? = null

    public var providerName: ProviderName
      get() = requireNotNull(providerNameValue) { "providerName is required" }
      set(`value`) {
        providerNameValue = value
      }

    private var supportedParametersValue: List<Parameter>? = null

    public var supportedParameters: List<Parameter>
      get() = requireNotNull(supportedParametersValue) { "supportedParameters is required" }
      set(`value`) {
        supportedParametersValue = value
      }

    private var supportsImplicitCachingValue: Boolean? = null

    public var supportsImplicitCaching: Boolean
      get() = requireNotNull(supportsImplicitCachingValue) { "supportsImplicitCaching is required" }
      set(`value`) {
        supportsImplicitCachingValue = value
      }

    private var tagValue: String? = null

    public var tag: String
      get() = requireNotNull(tagValue) { "tag is required" }
      set(`value`) {
        tagValue = value
      }

    private var latencyLast30mState: FieldState<PercentileStats?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var latencyLast30m: PercentileStats?
      get() = latencyLast30mState.valueOrNull()
      set(`value`) {
        latencyLast30mState = value.toNullableFieldState()
      }

    private var maxCompletionTokensState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var maxCompletionTokens: Int?
      get() = maxCompletionTokensState.valueOrNull()
      set(`value`) {
        maxCompletionTokensState = value.toNullableFieldState()
      }

    private var maxPromptTokensState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var maxPromptTokens: Int?
      get() = maxPromptTokensState.valueOrNull()
      set(`value`) {
        maxPromptTokensState = value.toNullableFieldState()
      }

    private var quantizationState: FieldState<Quantization?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var quantization: Quantization?
      get() = quantizationState.valueOrNull()
      set(`value`) {
        quantizationState = value.toNullableFieldState()
      }

    private var throughputLast30mState: FieldState<PercentileStats?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var throughputLast30m: PercentileStats?
      get() = throughputLast30mState.valueOrNull()
      set(`value`) {
        throughputLast30mState = value.toNullableFieldState()
      }

    private var uptimeLast1dState: FieldState<Double?> = FieldState.Absent

    /**
     * Uptime percentage over the last 1 day, calculated as successful requests / (successful + error requests) * 100.
     * Rate-limited requests are excluded. Returns null if insufficient data.
     * Required nullable field; assigning `null` records present-null.
     */
    public var uptimeLast1d: Double?
      get() = uptimeLast1dState.valueOrNull()
      set(`value`) {
        uptimeLast1dState = value.toNullableFieldState()
      }

    private var uptimeLast30mState: FieldState<Double?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var uptimeLast30m: Double?
      get() = uptimeLast30mState.valueOrNull()
      set(`value`) {
        uptimeLast30mState = value.toNullableFieldState()
      }

    private var uptimeLast5mState: FieldState<Double?> = FieldState.Absent

    /**
     * Uptime percentage over the last 5 minutes, calculated as successful requests / (successful + error requests) *
     * 100. Rate-limited requests are excluded. Returns null if insufficient data.
     * Required nullable field; assigning `null` records present-null.
     */
    public var uptimeLast5m: Double?
      get() = uptimeLast5mState.valueOrNull()
      set(`value`) {
        uptimeLast5mState = value.toNullableFieldState()
      }

    private var statusState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var status: Int?
      get() = statusState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "status is not nullable; call unsetStatus() to omit it" }
        statusState = FieldState.Value(present)
      }

    /**
     * Omits `status` from serialized output.
     */
    public fun unsetStatus() {
      statusState = FieldState.Absent
    }

    public fun build(): PublicEndpoint {
      check(contextLengthValue != null) { "contextLength is required" }
      check(modelIdValue != null) { "modelId is required" }
      check(modelNameValue != null) { "modelName is required" }
      check(nameValue != null) { "name is required" }
      check(pricingValue != null) { "pricing is required" }
      check(providerNameValue != null) { "providerName is required" }
      check(supportedParametersValue != null) { "supportedParameters is required" }
      check(supportsImplicitCachingValue != null) { "supportsImplicitCaching is required" }
      check(tagValue != null) { "tag is required" }
      check(latencyLast30mState !== FieldState.Absent) { "latencyLast30m is required, even when null" }
      check(maxCompletionTokensState !== FieldState.Absent) { "maxCompletionTokens is required, even when null" }
      check(maxPromptTokensState !== FieldState.Absent) { "maxPromptTokens is required, even when null" }
      check(quantizationState !== FieldState.Absent) { "quantization is required, even when null" }
      check(throughputLast30mState !== FieldState.Absent) { "throughputLast30m is required, even when null" }
      check(uptimeLast1dState !== FieldState.Absent) { "uptimeLast1d is required, even when null" }
      check(uptimeLast30mState !== FieldState.Absent) { "uptimeLast30m is required, even when null" }
      check(uptimeLast5mState !== FieldState.Absent) { "uptimeLast5m is required, even when null" }
      return PublicEndpoint(
        contextLength = contextLength,
        latencyLast30m = latencyLast30mState.valueOrNull(),
        maxCompletionTokens = maxCompletionTokensState.valueOrNull(),
        maxPromptTokens = maxPromptTokensState.valueOrNull(),
        modelId = modelId,
        modelName = modelName,
        name = name,
        pricing = pricing,
        providerName = providerName,
        quantization = quantizationState.valueOrNull(),
        supportedParameters = supportedParameters,
        supportsImplicitCaching = supportsImplicitCaching,
        tag = tag,
        throughputLast30m = throughputLast30mState.valueOrNull(),
        uptimeLast1d = uptimeLast1dState.valueOrNull(),
        uptimeLast30m = uptimeLast30mState.valueOrNull(),
        uptimeLast5m = uptimeLast5mState.valueOrNull(),
        statusState = statusState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PublicEndpoint = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PublicEndpoint> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PublicEndpoint {
      val jsonDecoder = decoder.requireJsonDecoder("PublicEndpoint")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("PublicEndpoint must be a JSON object")
      val contextLength = json.decodeRequired<Int>(raw, "context_length")
      val modelId = json.decodeRequired<String>(raw, "model_id")
      val modelName = json.decodeRequired<String>(raw, "model_name")
      val name = json.decodeRequired<String>(raw, "name")
      val pricing = json.decodeRequired<InlineComponentsSchemasPublicEndpointPropertiesPricing>(raw, "pricing")
      val providerName = json.decodeRequired<ProviderName>(raw, "provider_name")
      val supportedParameters = json.decodeRequired<List<Parameter>>(raw, "supported_parameters")
      val supportsImplicitCaching = json.decodeRequired<Boolean>(raw, "supports_implicit_caching")
      val tag = json.decodeRequired<String>(raw, "tag")
      if (!raw.containsKey("latency_last_30m")) {
        throw SerializationException("PublicEndpoint is missing required property 'latency_last_30m'")
      }
      val latencyLast30m = raw["latency_last_30m"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<PercentileStats?>(requireNotNull(element)) }
      if (!raw.containsKey("max_completion_tokens")) {
        throw SerializationException("PublicEndpoint is missing required property 'max_completion_tokens'")
      }
      val maxCompletionTokens = raw["max_completion_tokens"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!raw.containsKey("max_prompt_tokens")) {
        throw SerializationException("PublicEndpoint is missing required property 'max_prompt_tokens'")
      }
      val maxPromptTokens = raw["max_prompt_tokens"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!raw.containsKey("quantization")) {
        throw SerializationException("PublicEndpoint is missing required property 'quantization'")
      }
      val quantization = raw["quantization"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Quantization?>(requireNotNull(element)) }
      if (!raw.containsKey("throughput_last_30m")) {
        throw SerializationException("PublicEndpoint is missing required property 'throughput_last_30m'")
      }
      val throughputLast30m = raw["throughput_last_30m"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<PercentileStats?>(requireNotNull(element)) }
      if (!raw.containsKey("uptime_last_1d")) {
        throw SerializationException("PublicEndpoint is missing required property 'uptime_last_1d'")
      }
      val uptimeLast1d = raw["uptime_last_1d"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!raw.containsKey("uptime_last_30m")) {
        throw SerializationException("PublicEndpoint is missing required property 'uptime_last_30m'")
      }
      val uptimeLast30m = raw["uptime_last_30m"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!raw.containsKey("uptime_last_5m")) {
        throw SerializationException("PublicEndpoint is missing required property 'uptime_last_5m'")
      }
      val uptimeLast5m = raw["uptime_last_5m"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<Double?>(requireNotNull(element)) }
      return PublicEndpoint(
        contextLength = contextLength,
        latencyLast30m = latencyLast30m,
        maxCompletionTokens = maxCompletionTokens,
        maxPromptTokens = maxPromptTokens,
        modelId = modelId,
        modelName = modelName,
        name = name,
        pricing = pricing,
        providerName = providerName,
        quantization = quantization,
        supportedParameters = supportedParameters,
        supportsImplicitCaching = supportsImplicitCaching,
        tag = tag,
        throughputLast30m = throughputLast30m,
        uptimeLast1d = uptimeLast1d,
        uptimeLast30m = uptimeLast30m,
        uptimeLast5m = uptimeLast5m,
        statusState = json.decodeOptional(raw, "status", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: PublicEndpoint) {
      val jsonEncoder = encoder.requireJsonEncoder("PublicEndpoint")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("context_length", json.encodeToJsonElement(value.contextLength))
        put("latency_last_30m", value.latencyLast30m?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("max_completion_tokens", value.maxCompletionTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("max_prompt_tokens", value.maxPromptTokens?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("model_id", value.modelId)
        put("model_name", value.modelName)
        put("name", value.name)
        put("pricing", json.encodeToJsonElement(value.pricing))
        put("provider_name", json.encodeToJsonElement(value.providerName))
        put("quantization", value.quantization?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("supported_parameters", json.encodeToJsonElement(value.supportedParameters))
        put("supports_implicit_caching", json.encodeToJsonElement(value.supportsImplicitCaching))
        put("tag", value.tag)
        put("throughput_last_30m", value.throughputLast30m?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("uptime_last_1d", value.uptimeLast1d?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("uptime_last_30m", value.uptimeLast30m?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("uptime_last_5m", value.uptimeLast5m?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("status", value.statusState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun publicEndpoint(block: PublicEndpoint.Builder.() -> Unit): PublicEndpoint = PublicEndpoint.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PublicEndpoint is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("PublicEndpoint property '" + name + "' is not nullable")
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
