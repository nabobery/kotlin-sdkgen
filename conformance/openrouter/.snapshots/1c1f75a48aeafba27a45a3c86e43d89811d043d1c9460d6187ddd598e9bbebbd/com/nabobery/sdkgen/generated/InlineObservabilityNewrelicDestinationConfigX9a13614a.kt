package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityNewrelicDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityNewrelicDestination/properties/config
 */
@Serializable(with = InlineObservabilityNewrelicDestinationConfigX9a13614a.Serializer::class)
public class InlineObservabilityNewrelicDestinationConfigX9a13614a(
  public val licenseKey: String,
  headers: Map<String, String>? = null,
  public val region: InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21? = null,
) {
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var licenseKeyValue: String? = null

    public var licenseKey: String
      get() = requireNotNull(licenseKeyValue) { "licenseKey is required" }
      set(`value`) {
        licenseKeyValue = value
      }

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var region: InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21? = null

    public fun build(): InlineObservabilityNewrelicDestinationConfigX9a13614a {
      check(licenseKeyValue != null) { "licenseKey is required" }
      return InlineObservabilityNewrelicDestinationConfigX9a13614a(
        licenseKey = licenseKey,
        headers = headers,
        region = region,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityNewrelicDestinationConfigX9a13614a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityNewrelicDestinationConfigX9a13614a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityNewrelicDestinationConfigX9a13614a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityNewrelicDestinationConfigX9a13614a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityNewrelicDestinationConfigX9a13614a must be a JSON object")
      val licenseKey = json.decodeRequired<String>(rawObject, "licenseKey")
      return InlineObservabilityNewrelicDestinationConfigX9a13614a(
        licenseKey = licenseKey,
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        region = rawObject["region"]?.let { json.decodeFromJsonElement<InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityNewrelicDestinationConfigX9a13614a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityNewrelicDestinationConfigX9a13614a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("licenseKey", value.licenseKey)
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
        value.region?.let { put("region", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineObservabilityNewrelicDestinationConfigX9a13614a(block: InlineObservabilityNewrelicDestinationConfigX9a13614a.Builder.() -> Unit): InlineObservabilityNewrelicDestinationConfigX9a13614a = InlineObservabilityNewrelicDestinationConfigX9a13614a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityNewrelicDestinationConfigX9a13614a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
