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
 */
@Serializable(with = InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig(
  public val licenseKey: String,
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = null,
  public val region:
      InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion? = null,
) {
  public class Builder {
    private var licenseKeyValue: String? = null

    public var licenseKey: String
      get() = requireNotNull(licenseKeyValue) { "licenseKey is required" }
      set(`value`) {
        licenseKeyValue = value
      }

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public var region:
        InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion? =
        null

    public fun build(): InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig {
      check(licenseKeyValue != null) { "licenseKey is required" }
      return InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig(
        licenseKey = licenseKey,
        headers = headers,
        region = region,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig must be " +
          "a JSON object")
      val licenseKey = json.decodeRequired<String>(raw, "licenseKey")
      return InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig(
        licenseKey = licenseKey,
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        region = raw["region"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig")
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

public fun inlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig = InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
