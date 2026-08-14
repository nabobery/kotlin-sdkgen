package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOtelCollectorDestination/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOtelCollectorDestination/properties/config
 */
@Serializable(with = InlineObservabilityOtelCollectorDestinationConfigX25371089.Serializer::class)
public class InlineObservabilityOtelCollectorDestinationConfigX25371089(
  public val endpoint: String,
  headers: Map<String, String>? = null,
) {
  /**
   * Custom HTTP headers as a JSON object. For Axiom, use {"Authorization": "Bearer xaat-xxx", "X-Axiom-Dataset":
   * "your-dataset"}
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var endpointValue: String? = null

    public var endpoint: String
      get() = requireNotNull(endpointValue) { "endpoint is required" }
      set(`value`) {
        endpointValue = value
      }

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers as a JSON object. For Axiom, use {"Authorization": "Bearer xaat-xxx", "X-Axiom-Dataset":
     * "your-dataset"}
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineObservabilityOtelCollectorDestinationConfigX25371089 {
      check(endpointValue != null) { "endpoint is required" }
      return InlineObservabilityOtelCollectorDestinationConfigX25371089(
        endpoint = endpoint,
        headers = headers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineObservabilityOtelCollectorDestinationConfigX25371089 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityOtelCollectorDestinationConfigX25371089> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityOtelCollectorDestinationConfigX25371089 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityOtelCollectorDestinationConfigX25371089")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityOtelCollectorDestinationConfigX25371089 must be a JSON object")
      val endpoint = json.decodeRequired<String>(rawObject, "endpoint")
      return InlineObservabilityOtelCollectorDestinationConfigX25371089(
        endpoint = endpoint,
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityOtelCollectorDestinationConfigX25371089) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityOtelCollectorDestinationConfigX25371089")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("endpoint", value.endpoint)
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineObservabilityOtelCollectorDestinationConfigX25371089(block: InlineObservabilityOtelCollectorDestinationConfigX25371089.Builder.() -> Unit): InlineObservabilityOtelCollectorDestinationConfigX25371089 = InlineObservabilityOtelCollectorDestinationConfigX25371089.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityOtelCollectorDestinationConfigX25371089 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
