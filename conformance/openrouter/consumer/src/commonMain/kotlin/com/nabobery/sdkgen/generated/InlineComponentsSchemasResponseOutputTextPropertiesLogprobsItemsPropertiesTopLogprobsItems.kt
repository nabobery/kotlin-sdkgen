package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/components/schemas/ResponseOutputText/properties/logprobs/items/properties/top_logprobs
 * /items.
 */
@Serializable(with = InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems
  .Serializer::class)
public class InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems(
  bytes: List<Int>,
  public val logprob: Double,
  public val token: String,
) {
  public val bytes: List<Int> = bytes.toList()

  public class Builder {
    private var bytesValue: List<Int>? = null

    public var bytes: List<Int>
      get() = requireNotNull(bytesValue) { "bytes is required" }
      set(`value`) {
        bytesValue = value
      }

    private var logprobValue: Double? = null

    public var logprob: Double
      get() = requireNotNull(logprobValue) { "logprob is required" }
      set(`value`) {
        logprobValue = value
      }

    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    public fun build(): InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems {
      check(bytesValue != null) { "bytes is required" }
      check(logprobValue != null) { "logprob is required" }
      check(tokenValue != null) { "token is required" }
      return InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems(
        bytes = bytes,
        logprob = logprob,
        token = token,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems {
      val jsonDecoder = decoder
























































                                                                                                                        .requireJsonDecoder("InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems " +
          "must be a JSON object")
      val bytes = json.decodeRequired<List<Int>>(raw, "bytes")
      val logprob = json.decodeRequired<Double>(raw, "logprob")
      val token = json.decodeRequired<String>(raw, "token")
      return InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems(
        bytes = bytes,
        logprob = logprob,
        token = token,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems) {
      val jsonEncoder = encoder
























































                                                                                                                        .requireJsonEncoder("InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bytes", json.encodeToJsonElement(value.bytes))
        put("logprob", json.encodeToJsonElement(value.logprob))
        put("token", value.token)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems(block: InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems.Builder.() -> Unit): InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems = InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItemsPropertiesTopLogprobsItems " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
