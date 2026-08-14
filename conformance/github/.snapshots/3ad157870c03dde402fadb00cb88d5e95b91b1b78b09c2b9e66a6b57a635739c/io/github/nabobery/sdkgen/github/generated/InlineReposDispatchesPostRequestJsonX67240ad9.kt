package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dispatches/post/requestBody/content/application~1json/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dispatches/post/requestBody/content/application~1json/s
 * chema
 */
@Serializable(with = InlineReposDispatchesPostRequestJsonX67240ad9.Serializer::class)
public class InlineReposDispatchesPostRequestJsonX67240ad9(
  /**
   * A custom webhook event name. Must be 100 characters or fewer.
   */
  public val eventType: String,
  /**
   * JSON payload with extra information about the webhook event that your action or workflow may use. The maximum
   * number of top-level properties is 10. The total size of the JSON payload must be less than 64KB.
   */
  public val clientPayload: JsonObject? = null,
) {
  public class Builder {
    private var eventTypeValue: String? = null

    public var eventType: String
      get() = requireNotNull(eventTypeValue) { "eventType is required" }
      set(`value`) {
        eventTypeValue = value
      }

    /**
     * JSON payload with extra information about the webhook event that your action or workflow may use. The maximum
     * number of top-level properties is 10. The total size of the JSON payload must be less than 64KB.
     */
    public var clientPayload: JsonObject? = null

    public fun build(): InlineReposDispatchesPostRequestJsonX67240ad9 {
      check(eventTypeValue != null) { "eventType is required" }
      return InlineReposDispatchesPostRequestJsonX67240ad9(
        eventType = eventType,
        clientPayload = clientPayload,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDispatchesPostRequestJsonX67240ad9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDispatchesPostRequestJsonX67240ad9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDispatchesPostRequestJsonX67240ad9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDispatchesPostRequestJsonX67240ad9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDispatchesPostRequestJsonX67240ad9 must be a JSON object")
      val eventType = json.decodeRequired<String>(rawObject, "event_type")
      return InlineReposDispatchesPostRequestJsonX67240ad9(
        eventType = eventType,
        clientPayload = rawObject["client_payload"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDispatchesPostRequestJsonX67240ad9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDispatchesPostRequestJsonX67240ad9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("event_type", value.eventType)
        value.clientPayload?.let { put("client_payload", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDispatchesPostRequestJsonX67240ad9(block: InlineReposDispatchesPostRequestJsonX67240ad9.Builder.() -> Unit): InlineReposDispatchesPostRequestJsonX67240ad9 = InlineReposDispatchesPostRequestJsonX67240ad9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposDispatchesPostRequestJsonX67240ad9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
