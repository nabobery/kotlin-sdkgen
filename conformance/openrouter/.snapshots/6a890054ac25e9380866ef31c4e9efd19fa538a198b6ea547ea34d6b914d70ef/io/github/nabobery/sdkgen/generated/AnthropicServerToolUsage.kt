package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicServerToolUsage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicServerToolUsage
 */
@Serializable(with = AnthropicServerToolUsage.Serializer::class)
public class AnthropicServerToolUsage(
  public val webFetchRequests: Int,
  public val webSearchRequests: Int,
) {
  public class Builder {
    private var webFetchRequestsValue: Int? = null

    public var webFetchRequests: Int
      get() = requireNotNull(webFetchRequestsValue) { "webFetchRequests is required" }
      set(`value`) {
        webFetchRequestsValue = value
      }

    private var webSearchRequestsValue: Int? = null

    public var webSearchRequests: Int
      get() = requireNotNull(webSearchRequestsValue) { "webSearchRequests is required" }
      set(`value`) {
        webSearchRequestsValue = value
      }

    public fun build(): AnthropicServerToolUsage {
      check(webFetchRequestsValue != null) { "webFetchRequests is required" }
      check(webSearchRequestsValue != null) { "webSearchRequests is required" }
      return AnthropicServerToolUsage(
        webFetchRequests = webFetchRequests,
        webSearchRequests = webSearchRequests,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicServerToolUsage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicServerToolUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicServerToolUsage {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicServerToolUsage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicServerToolUsage must be a JSON object")
      val webFetchRequests = json.decodeRequired<Int>(rawObject, "web_fetch_requests")
      val webSearchRequests = json.decodeRequired<Int>(rawObject, "web_search_requests")
      return AnthropicServerToolUsage(
        webFetchRequests = webFetchRequests,
        webSearchRequests = webSearchRequests,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicServerToolUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicServerToolUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("web_fetch_requests", json.encodeToJsonElement(value.webFetchRequests))
        put("web_search_requests", json.encodeToJsonElement(value.webSearchRequests))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicServerToolUsage(block: AnthropicServerToolUsage.Builder.() -> Unit): AnthropicServerToolUsage = AnthropicServerToolUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicServerToolUsage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
