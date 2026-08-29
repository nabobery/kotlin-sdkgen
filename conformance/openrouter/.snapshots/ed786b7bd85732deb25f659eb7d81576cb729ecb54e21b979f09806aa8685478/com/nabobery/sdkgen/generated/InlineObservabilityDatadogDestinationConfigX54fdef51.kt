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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityDatadogDestination/properties/config
 */
@Serializable(with = InlineObservabilityDatadogDestinationConfigX54fdef51.Serializer::class)
public class InlineObservabilityDatadogDestinationConfigX54fdef51(
  /**
   * Datadog API key must have LLM Observability permissions. Create at:
   */
  public val apiKey: String,
  /**
   * Name to identify your application in Datadog LLM Observability
   */
  public val mlApp: String,
  headers: Map<String, String>? = null,
  /**
   * Datadog API URL for your region (e.g., https://api.datadoghq.com, https://api.us3.datadoghq.com,
   * https://api.datadoghq.eu)
   */
  public val url: String? = null,
) {
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

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

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Datadog API URL for your region (e.g., https://api.datadoghq.com, https://api.us3.datadoghq.com,
     * https://api.datadoghq.eu)
     */
    public var url: String? = null

    public fun build(): InlineObservabilityDatadogDestinationConfigX54fdef51 {
      check(apiKeyValue != null) { "apiKey is required" }
      check(mlAppValue != null) { "mlApp is required" }
      return InlineObservabilityDatadogDestinationConfigX54fdef51(
        apiKey = apiKey,
        mlApp = mlApp,
        headers = headers,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityDatadogDestinationConfigX54fdef51 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityDatadogDestinationConfigX54fdef51> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityDatadogDestinationConfigX54fdef51 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityDatadogDestinationConfigX54fdef51")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityDatadogDestinationConfigX54fdef51 must be a JSON object")
      val apiKey = json.decodeRequired<String>(rawObject, "apiKey")
      val mlApp = json.decodeRequired<String>(rawObject, "mlApp")
      return InlineObservabilityDatadogDestinationConfigX54fdef51(
        apiKey = apiKey,
        mlApp = mlApp,
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityDatadogDestinationConfigX54fdef51) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityDatadogDestinationConfigX54fdef51")
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

public fun inlineObservabilityDatadogDestinationConfigX54fdef51(block: InlineObservabilityDatadogDestinationConfigX54fdef51.Builder.() -> Unit): InlineObservabilityDatadogDestinationConfigX54fdef51 = InlineObservabilityDatadogDestinationConfigX54fdef51.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityDatadogDestinationConfigX54fdef51 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
