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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionUsageIteration/allOf/1.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1.Serializer::class)
public class InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1(
  public val type: InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1 must be a JSON " +
          "object")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType>(raw,
        "type")
      return InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1(block: InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1.Builder.() -> Unit): InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1 = InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1 is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
