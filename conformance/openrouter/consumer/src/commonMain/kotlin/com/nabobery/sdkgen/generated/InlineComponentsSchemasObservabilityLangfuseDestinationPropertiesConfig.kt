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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangfuseDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig(
  public val publicKey: String,
  public val secretKey: String,
  public val baseUrl: String? = null,
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = null,
) {
  public class Builder {
    private var publicKeyValue: String? = null

    public var publicKey: String
      get() = requireNotNull(publicKeyValue) { "publicKey is required" }
      set(`value`) {
        publicKeyValue = value
      }

    private var secretKeyValue: String? = null

    public var secretKey: String
      get() = requireNotNull(secretKeyValue) { "secretKey is required" }
      set(`value`) {
        secretKeyValue = value
      }

    public var baseUrl: String? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    public fun build(): InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig {
      check(publicKeyValue != null) { "publicKey is required" }
      check(secretKeyValue != null) { "secretKey is required" }
      return InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig(
        publicKey = publicKey,
        secretKey = secretKey,
        baseUrl = baseUrl,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig must be " +
          "a JSON object")
      val publicKey = json.decodeRequired<String>(raw, "publicKey")
      val secretKey = json.decodeRequired<String>(raw, "secretKey")
      return InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig(
        publicKey = publicKey,
        secretKey = secretKey,
        baseUrl = raw["baseUrl"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("publicKey", value.publicKey)
        put("secretKey", value.secretKey)
        value.baseUrl?.let { put("baseUrl", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig = InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
