package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * An endpoint that serves a given image model.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageEndpoint
 */
@Serializable(with = ImageEndpoint.Serializer::class)
public class ImageEndpoint(
  allowedPassthroughParameters: List<String>,
  pricing: List<ImagePricingEntry>,
  /**
   * Provider display name
   */
  public val providerName: String,
  /**
   * Provider slug
   */
  public val providerSlug: String,
  /**
   * Provider tag for request-side selection
   */
  public val providerTag: String?,
  supportedParameters: Map<String, CapabilityDescriptor>,
  /**
   * Whether this endpoint supports native SSE streaming (`stream: true` in the request).
   */
  public val supportsStreaming: Boolean,
) {
  /**
   * Provider-specific options accepted under provider.options[provider_slug].
   */
  public val allowedPassthroughParameters: List<String> = allowedPassthroughParameters.toList()

  /**
   * Billable pricing lines for this endpoint.
   */
  public val pricing: List<ImagePricingEntry> = pricing.toList()

  public val supportedParameters: Map<String, CapabilityDescriptor> = supportedParameters.toMap()

  public class Builder {
    private var allowedPassthroughParametersValue: List<String>? = null

    public var allowedPassthroughParameters: List<String>
      get() = requireNotNull(allowedPassthroughParametersValue) { "allowedPassthroughParameters is required" }.toList()
      set(`value`) {
        allowedPassthroughParametersValue = value.toList()
      }

    private var pricingValue: List<ImagePricingEntry>? = null

    public var pricing: List<ImagePricingEntry>
      get() = requireNotNull(pricingValue) { "pricing is required" }.toList()
      set(`value`) {
        pricingValue = value.toList()
      }

    private var providerNameValue: String? = null

    public var providerName: String
      get() = requireNotNull(providerNameValue) { "providerName is required" }
      set(`value`) {
        providerNameValue = value
      }

    private var providerSlugValue: String? = null

    public var providerSlug: String
      get() = requireNotNull(providerSlugValue) { "providerSlug is required" }
      set(`value`) {
        providerSlugValue = value
      }

    private var supportedParametersValue: Map<String, CapabilityDescriptor>? = null

    public var supportedParameters: Map<String, CapabilityDescriptor>
      get() = requireNotNull(supportedParametersValue) { "supportedParameters is required" }.toMap()
      set(`value`) {
        supportedParametersValue = value.toMap()
      }

    private var supportsStreamingValue: Boolean? = null

    public var supportsStreaming: Boolean
      get() = requireNotNull(supportsStreamingValue) { "supportsStreaming is required" }
      set(`value`) {
        supportsStreamingValue = value
      }

    private var providerTagState: FieldState<String?> = FieldState.Absent

    /**
     * Provider tag for request-side selection
     * Required nullable field; assigning `null` records present-null.
     */
    public var providerTag: String?
      get() = providerTagState.valueOrNull()
      set(`value`) {
        providerTagState = value.toNullableFieldState()
      }

    public fun build(): ImageEndpoint {
      check(allowedPassthroughParametersValue != null) { "allowedPassthroughParameters is required" }
      check(pricingValue != null) { "pricing is required" }
      check(providerNameValue != null) { "providerName is required" }
      check(providerSlugValue != null) { "providerSlug is required" }
      check(supportedParametersValue != null) { "supportedParameters is required" }
      check(supportsStreamingValue != null) { "supportsStreaming is required" }
      check(providerTagState !== FieldState.Absent) { "providerTag is required, even when null" }
      return ImageEndpoint(
        allowedPassthroughParameters = allowedPassthroughParameters,
        pricing = pricing,
        providerName = providerName,
        providerSlug = providerSlug,
        providerTag = providerTagState.valueOrNull(),
        supportedParameters = supportedParameters,
        supportsStreaming = supportsStreaming,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageEndpoint = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageEndpoint> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageEndpoint {
      val jsonDecoder = decoder.requireJsonDecoder("ImageEndpoint")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageEndpoint must be a JSON object")
      val allowedPassthroughParameters = json.decodeRequired<List<String>>(rawObject, "allowed_passthrough_parameters")
      val pricing = json.decodeRequired<List<ImagePricingEntry>>(rawObject, "pricing")
      val providerName = json.decodeRequired<String>(rawObject, "provider_name")
      val providerSlug = json.decodeRequired<String>(rawObject, "provider_slug")
      val supportedParameters = json.decodeRequired<Map<String, CapabilityDescriptor>>(rawObject, "supported_parameters")
      val supportsStreaming = json.decodeRequired<Boolean>(rawObject, "supports_streaming")
      if (!rawObject.containsKey("provider_tag")) {
        throw SerializationException("ImageEndpoint is missing required property 'provider_tag'")
      }
      val providerTag = rawObject["provider_tag"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ImageEndpoint(
        allowedPassthroughParameters = allowedPassthroughParameters,
        pricing = pricing,
        providerName = providerName,
        providerSlug = providerSlug,
        providerTag = providerTag,
        supportedParameters = supportedParameters,
        supportsStreaming = supportsStreaming,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageEndpoint) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageEndpoint")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allowed_passthrough_parameters", json.encodeToJsonElement(value.allowedPassthroughParameters))
        put("pricing", json.encodeToJsonElement(value.pricing))
        put("provider_name", value.providerName)
        put("provider_slug", value.providerSlug)
        put("provider_tag", value.providerTag?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("supported_parameters", json.encodeToJsonElement(value.supportedParameters))
        put("supports_streaming", json.encodeToJsonElement(value.supportsStreaming))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageEndpoint(block: ImageEndpoint.Builder.() -> Unit): ImageEndpoint = ImageEndpoint.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageEndpoint is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ImageEndpoint property '" + name + "' is not nullable")
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
