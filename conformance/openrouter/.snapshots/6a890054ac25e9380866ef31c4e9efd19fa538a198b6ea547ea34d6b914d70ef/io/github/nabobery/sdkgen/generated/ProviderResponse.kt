package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
 * Details of a provider response for a generation attempt
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderResponse
 */
@Serializable(with = ProviderResponse.Serializer::class)
public class ProviderResponse internal constructor(
  /**
   * HTTP status code from the provider
   */
  public val status: Int?,
  private val endpointIdState: FieldState<String>,
  private val idState: FieldState<String>,
  private val isByokState: FieldState<Boolean>,
  private val latencyState: FieldState<Double>,
  private val modelPermaslugState: FieldState<String>,
  private val providerNameState: FieldState<InlineProviderResponseProviderNameX18a2fcb4>,
  private val routedServiceTierState: FieldState<InlineProviderResponseRoutedServiceTierX54907e0c>,
) {
  /**
   * Internal endpoint identifier
   */
  public val endpointId: String?
    get() = endpointIdState.valueOrNull()

  /**
   * Upstream provider response identifier
   */
  public val id: String?
    get() = idState.valueOrNull()

  /**
   * Whether the request used a bring-your-own-key
   */
  public val isByok: Boolean?
    get() = isByokState.valueOrNull()

  /**
   * Response latency in milliseconds
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val latency: Double?
    get() = latencyState.valueOrNull()

  /**
   * Canonical model slug
   */
  public val modelPermaslug: String?
    get() = modelPermaslugState.valueOrNull()

  /**
   * Name of the provider
   */
  public val providerName: InlineProviderResponseProviderNameX18a2fcb4?
    get() = providerNameState.valueOrNull()

  /**
   * The service tier this request was routed to (e.g. flex, priority). The tier actually applied and billed is
   * determined by the provider response and may differ.
   */
  public val routedServiceTier: InlineProviderResponseRoutedServiceTierX54907e0c?
    get() = routedServiceTierState.valueOrNull()

  public constructor(status: Int?) : this(status = status,
  endpointIdState = FieldState.Absent,
  idState = FieldState.Absent,
  isByokState = FieldState.Absent,
  latencyState = FieldState.Absent,
  modelPermaslugState = FieldState.Absent,
  providerNameState = FieldState.Absent,
  routedServiceTierState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `endpoint_id`.
   */
  public fun endpointIdPresence(): FieldPresence = endpointIdState.presence

  /**
   * Returns the wire presence of `id`.
   */
  public fun idPresence(): FieldPresence = idState.presence

  /**
   * Returns the wire presence of `is_byok`.
   */
  public fun isByokPresence(): FieldPresence = isByokState.presence

  /**
   * Returns the wire presence of `latency`.
   */
  public fun latencyPresence(): FieldPresence = latencyState.presence

  /**
   * Returns the wire presence of `model_permaslug`.
   */
  public fun modelPermaslugPresence(): FieldPresence = modelPermaslugState.presence

  /**
   * Returns the wire presence of `provider_name`.
   */
  public fun providerNamePresence(): FieldPresence = providerNameState.presence

  /**
   * Returns the wire presence of `routed_service_tier`.
   */
  public fun routedServiceTierPresence(): FieldPresence = routedServiceTierState.presence

  public class Builder {
    private var statusState: FieldState<Int?> = FieldState.Absent

    /**
     * HTTP status code from the provider
     * Required nullable field; assigning `null` records present-null.
     */
    public var status: Int?
      get() = statusState.valueOrNull()
      set(`value`) {
        statusState = value.toNullableFieldState()
      }

    private var endpointIdState: FieldState<String> = FieldState.Absent

    /**
     * Internal endpoint identifier
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var endpointId: String?
      get() = endpointIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "endpointId is not nullable; call unsetEndpointId() to omit it" }
        endpointIdState = FieldState.Value(present)
      }

    private var idState: FieldState<String> = FieldState.Absent

    /**
     * Upstream provider response identifier
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var id: String?
      get() = idState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "id is not nullable; call unsetId() to omit it" }
        idState = FieldState.Value(present)
      }

    private var isByokState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether the request used a bring-your-own-key
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isByok: Boolean?
      get() = isByokState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isByok is not nullable; call unsetIsByok() to omit it" }
        isByokState = FieldState.Value(present)
      }

    private var latencyState: FieldState<Double> = FieldState.Absent

    /**
     * Response latency in milliseconds
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var latency: Double?
      get() = latencyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "latency is not nullable; call unsetLatency() to omit it" }
        latencyState = FieldState.Value(present)
      }

    private var modelPermaslugState: FieldState<String> = FieldState.Absent

    /**
     * Canonical model slug
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var modelPermaslug: String?
      get() = modelPermaslugState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "modelPermaslug is not nullable; call unsetModelPermaslug() to omit it" }
        modelPermaslugState = FieldState.Value(present)
      }

    private var providerNameState: FieldState<InlineProviderResponseProviderNameX18a2fcb4> =
        FieldState.Absent

    /**
     * Name of the provider
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var providerName: InlineProviderResponseProviderNameX18a2fcb4?
      get() = providerNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "providerName is not nullable; call unsetProviderName() to omit it" }
        providerNameState = FieldState.Value(present)
      }

    private var routedServiceTierState: FieldState<InlineProviderResponseRoutedServiceTierX54907e0c>
        = FieldState.Absent

    /**
     * The service tier this request was routed to (e.g. flex, priority). The tier actually applied and billed is
     * determined by the provider response and may differ.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var routedServiceTier: InlineProviderResponseRoutedServiceTierX54907e0c?
      get() = routedServiceTierState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "routedServiceTier is not nullable; call unsetRoutedServiceTier() to omit it" }
        routedServiceTierState = FieldState.Value(present)
      }

    /**
     * Omits `endpoint_id` from serialized output.
     */
    public fun unsetEndpointId() {
      endpointIdState = FieldState.Absent
    }

    /**
     * Omits `id` from serialized output.
     */
    public fun unsetId() {
      idState = FieldState.Absent
    }

    /**
     * Omits `is_byok` from serialized output.
     */
    public fun unsetIsByok() {
      isByokState = FieldState.Absent
    }

    /**
     * Omits `latency` from serialized output.
     */
    public fun unsetLatency() {
      latencyState = FieldState.Absent
    }

    /**
     * Omits `model_permaslug` from serialized output.
     */
    public fun unsetModelPermaslug() {
      modelPermaslugState = FieldState.Absent
    }

    /**
     * Omits `provider_name` from serialized output.
     */
    public fun unsetProviderName() {
      providerNameState = FieldState.Absent
    }

    /**
     * Omits `routed_service_tier` from serialized output.
     */
    public fun unsetRoutedServiceTier() {
      routedServiceTierState = FieldState.Absent
    }

    public fun build(): ProviderResponse {
      check(statusState !== FieldState.Absent) { "status is required, even when null" }
      return ProviderResponse(
        status = statusState.valueOrNull(),
        endpointIdState = endpointIdState,
        idState = idState,
        isByokState = isByokState,
        latencyState = latencyState,
        modelPermaslugState = modelPermaslugState,
        providerNameState = providerNameState,
        routedServiceTierState = routedServiceTierState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProviderResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProviderResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProviderResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ProviderResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProviderResponse must be a JSON object")
      if (!rawObject.containsKey("status")) {
        throw SerializationException("ProviderResponse is missing required property 'status'")
      }
      val status = rawObject["status"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return ProviderResponse(
        status = status,
        endpointIdState = json.decodeOptional(rawObject, "endpoint_id", nullable = false),
        idState = json.decodeOptional(rawObject, "id", nullable = false),
        isByokState = json.decodeOptional(rawObject, "is_byok", nullable = false),
        latencyState = json.decodeOptional(rawObject, "latency", nullable = false),
        modelPermaslugState = json.decodeOptional(rawObject, "model_permaslug", nullable = false),
        providerNameState = json.decodeOptional(rawObject, "provider_name", nullable = false),
        routedServiceTierState = json.decodeOptional(rawObject, "routed_service_tier", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProviderResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ProviderResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", value.status?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("endpoint_id", value.endpointIdState, json::encodeToJsonElement)
        putState("id", value.idState, json::encodeToJsonElement)
        putState("is_byok", value.isByokState, json::encodeToJsonElement)
        putState("latency", value.latencyState, json::encodeToJsonElement)
        putState("model_permaslug", value.modelPermaslugState, json::encodeToJsonElement)
        putState("provider_name", value.providerNameState, json::encodeToJsonElement)
        putState("routed_service_tier", value.routedServiceTierState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun providerResponse(block: ProviderResponse.Builder.() -> Unit): ProviderResponse = ProviderResponse.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("ProviderResponse property '" + name + "' is not nullable")
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
