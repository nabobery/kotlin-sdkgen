package com.nabobery.sdkgen.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesDeltaEvent/properties/usage/properties/server_tool_use.
 */
@Serializable(with = InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse.Serializer::class)
public class InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse(
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

    public fun build(): InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse {
      check(webFetchRequestsValue != null) { "webFetchRequests is required" }
      check(webSearchRequestsValue != null) { "webSearchRequests is required" }
      return InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse(
        webFetchRequests = webFetchRequests,
        webSearchRequests = webSearchRequests,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse " +
          "must be a JSON object")
      val webFetchRequests = json.decodeRequired<Int>(raw, "web_fetch_requests")
      val webSearchRequests = json.decodeRequired<Int>(raw, "web_search_requests")
      return InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse(
        webFetchRequests = webFetchRequests,
        webSearchRequests = webSearchRequests,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("web_fetch_requests", json.encodeToJsonElement(value.webFetchRequests))
        put("web_search_requests", json.encodeToJsonElement(value.webSearchRequests))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse(block: InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse.Builder.() -> Unit): InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse = InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesDeltaEventPropertiesUsagePropertiesServerToolUse is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
