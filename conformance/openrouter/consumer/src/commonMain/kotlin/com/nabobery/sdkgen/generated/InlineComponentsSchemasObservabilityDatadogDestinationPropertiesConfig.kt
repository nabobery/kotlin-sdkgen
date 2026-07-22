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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityDatadogDestination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig(
  /**
   * Datadog API key must have LLM Observability permissions. Create at:
   */
  public val apiKey: String,
  /**
   * Name to identify your application in Datadog LLM Observability
   */
  public val mlApp: String,
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = null,
  /**
   * Datadog API URL for your region (e.g., https://api.datadoghq.com, https://api.us3.datadoghq.com,
   * https://api.datadoghq.eu)
   */
  public val url: String? = null,
) {
  public class Builder {
    private var apiKeyValue: String? = null

    public var apiKey: String
      get() = requireNotNull(apiKeyValue) { "apiKey is required" }
      set(`value`) {
        apiKeyValue = value
      }

    private var mlAppValue: String? = null

    public var mlApp: String
      get() = requireNotNull(mlAppValue) { "mlApp is required" }
      set(`value`) {
        mlAppValue = value
      }

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    /**
     * Datadog API URL for your region (e.g., https://api.datadoghq.com, https://api.us3.datadoghq.com,
     * https://api.datadoghq.eu)
     */
    public var url: String? = null

    public fun build(): InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig {
      check(apiKeyValue != null) { "apiKey is required" }
      check(mlAppValue != null) { "mlApp is required" }
      return InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig(
        apiKey = apiKey,
        mlApp = mlApp,
        headers = headers,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig must be " +
          "a JSON object")
      val apiKey = json.decodeRequired<String>(raw, "apiKey")
      val mlApp = json.decodeRequired<String>(raw, "mlApp")
      return InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig(
        apiKey = apiKey,
        mlApp = mlApp,
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        url = raw["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apiKey", value.apiKey)
        put("mlApp", value.mlApp)
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig = InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
