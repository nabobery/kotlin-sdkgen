package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenRouterMetadata.
 */
@Serializable(with = OpenRouterMetadata.Serializer::class)
public class OpenRouterMetadata internal constructor(
  public val attempt: Int,
  public val endpoints: EndpointsMetadata,
  public val isByok: Boolean,
  public val region: String?,
  public val requested: String,
  public val strategy: RoutingStrategy,
  public val summary: String,
  private val attemptsState: FieldState<List<RouterAttempt>>,
  private val paramsState: FieldState<RouterParams>,
  private val pipelineState: FieldState<List<PipelineStage>>,
) {
  public val attempts: List<RouterAttempt>?
    get() = attemptsState.valueOrNull()

  public val params: RouterParams?
    get() = paramsState.valueOrNull()

  public val pipeline: List<PipelineStage>?
    get() = pipelineState.valueOrNull()

  public constructor(
    attempt: Int,
    endpoints: EndpointsMetadata,
    isByok: Boolean,
    region: String?,
    requested: String,
    strategy: RoutingStrategy,
    summary: String,
  ) : this(attempt = attempt,
  endpoints = endpoints,
  isByok = isByok,
  region = region,
  requested = requested,
  strategy = strategy,
  summary = summary,
  attemptsState = FieldState.Absent,
  paramsState = FieldState.Absent,
  pipelineState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `attempts`.
   */
  public fun attemptsPresence(): FieldPresence = attemptsState.presence

  /**
   * Returns the wire presence of `params`.
   */
  public fun paramsPresence(): FieldPresence = paramsState.presence

  /**
   * Returns the wire presence of `pipeline`.
   */
  public fun pipelinePresence(): FieldPresence = pipelineState.presence

  public class Builder {
    private var attemptValue: Int? = null

    public var attempt: Int
      get() = requireNotNull(attemptValue) { "attempt is required" }
      set(`value`) {
        attemptValue = value
      }

    private var endpointsValue: EndpointsMetadata? = null

    public var endpoints: EndpointsMetadata
      get() = requireNotNull(endpointsValue) { "endpoints is required" }
      set(`value`) {
        endpointsValue = value
      }

    private var isByokValue: Boolean? = null

    public var isByok: Boolean
      get() = requireNotNull(isByokValue) { "isByok is required" }
      set(`value`) {
        isByokValue = value
      }

    private var requestedValue: String? = null

    public var requested: String
      get() = requireNotNull(requestedValue) { "requested is required" }
      set(`value`) {
        requestedValue = value
      }

    private var strategyValue: RoutingStrategy? = null

    public var strategy: RoutingStrategy
      get() = requireNotNull(strategyValue) { "strategy is required" }
      set(`value`) {
        strategyValue = value
      }

    private var summaryValue: String? = null

    public var summary: String
      get() = requireNotNull(summaryValue) { "summary is required" }
      set(`value`) {
        summaryValue = value
      }

    private var regionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var region: String?
      get() = regionState.valueOrNull()
      set(`value`) {
        regionState = value.toNullableFieldState()
      }

    private var attemptsState: FieldState<List<RouterAttempt>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var attempts: List<RouterAttempt>?
      get() = attemptsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "attempts is not nullable; call unsetAttempts() to omit it" }
        attemptsState = FieldState.Value(present)
      }

    private var paramsState: FieldState<RouterParams> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var params: RouterParams?
      get() = paramsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "params is not nullable; call unsetParams() to omit it" }
        paramsState = FieldState.Value(present)
      }

    private var pipelineState: FieldState<List<PipelineStage>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pipeline: List<PipelineStage>?
      get() = pipelineState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pipeline is not nullable; call unsetPipeline() to omit it" }
        pipelineState = FieldState.Value(present)
      }

    /**
     * Omits `attempts` from serialized output.
     */
    public fun unsetAttempts() {
      attemptsState = FieldState.Absent
    }

    /**
     * Omits `params` from serialized output.
     */
    public fun unsetParams() {
      paramsState = FieldState.Absent
    }

    /**
     * Omits `pipeline` from serialized output.
     */
    public fun unsetPipeline() {
      pipelineState = FieldState.Absent
    }

    public fun build(): OpenRouterMetadata {
      check(attemptValue != null) { "attempt is required" }
      check(endpointsValue != null) { "endpoints is required" }
      check(isByokValue != null) { "isByok is required" }
      check(requestedValue != null) { "requested is required" }
      check(strategyValue != null) { "strategy is required" }
      check(summaryValue != null) { "summary is required" }
      check(regionState !== FieldState.Absent) { "region is required, even when null" }
      return OpenRouterMetadata(
        attempt = attempt,
        endpoints = endpoints,
        isByok = isByok,
        region = regionState.valueOrNull(),
        requested = requested,
        strategy = strategy,
        summary = summary,
        attemptsState = attemptsState,
        paramsState = paramsState,
        pipelineState = pipelineState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenRouterMetadata = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OpenRouterMetadata> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenRouterMetadata {
      val jsonDecoder = decoder.requireJsonDecoder("OpenRouterMetadata")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OpenRouterMetadata must be a JSON object")
      val attempt = json.decodeRequired<Int>(raw, "attempt")
      val endpoints = json.decodeRequired<EndpointsMetadata>(raw, "endpoints")
      val isByok = json.decodeRequired<Boolean>(raw, "is_byok")
      val requested = json.decodeRequired<String>(raw, "requested")
      val strategy = json.decodeRequired<RoutingStrategy>(raw, "strategy")
      val summary = json.decodeRequired<String>(raw, "summary")
      if (!raw.containsKey("region")) {
        throw SerializationException("OpenRouterMetadata is missing required property 'region'")
      }
      val region = raw["region"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return OpenRouterMetadata(
        attempt = attempt,
        endpoints = endpoints,
        isByok = isByok,
        region = region,
        requested = requested,
        strategy = strategy,
        summary = summary,
        attemptsState = json.decodeOptional(raw, "attempts", nullable = false),
        paramsState = json.decodeOptional(raw, "params", nullable = false),
        pipelineState = json.decodeOptional(raw, "pipeline", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenRouterMetadata) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenRouterMetadata")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("attempt", json.encodeToJsonElement(value.attempt))
        put("endpoints", json.encodeToJsonElement(value.endpoints))
        put("is_byok", json.encodeToJsonElement(value.isByok))
        put("region", value.region?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("requested", value.requested)
        put("strategy", json.encodeToJsonElement(value.strategy))
        put("summary", value.summary)
        putState("attempts", value.attemptsState, json::encodeToJsonElement)
        putState("params", value.paramsState, json::encodeToJsonElement)
        putState("pipeline", value.pipelineState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openRouterMetadata(block: OpenRouterMetadata.Builder.() -> Unit): OpenRouterMetadata = OpenRouterMetadata
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenRouterMetadata is missing required property '" + name +
    "'")
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
    if (!nullable) throw SerializationException("OpenRouterMetadata property '" + name + "' is not nullable")
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
