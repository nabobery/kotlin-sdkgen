package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicUnknownUsageIteration/allOf/1.
 */
@Serializable(with = InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1.Serializer::class)
public class InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1(
  public val type: String,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1 must be a JSON " +
          "object")
      val type = json.decodeRequired<String>(raw, "type")
      return InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1(block: InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1.Builder.() -> Unit): InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1 = InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasAnthropicUnknownUsageIterationAllOf1 is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
