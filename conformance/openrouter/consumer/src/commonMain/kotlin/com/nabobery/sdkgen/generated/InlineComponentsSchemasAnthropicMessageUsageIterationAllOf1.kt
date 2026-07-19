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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicMessageUsageIteration/allOf/1.
 */
@Serializable(with = InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1.Serializer::class)
public class InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1(
  public val type: InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType,
  public val model: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var model: String? = null

    public fun build(): InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1(
        type = type,
        model = model,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1 must be a JSON " +
          "object")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType>(raw,
        "type")
      return InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1(
        type = type,
        model = raw["model"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.model?.let { put("model", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAnthropicMessageUsageIterationAllOf1(block: InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1.Builder.() -> Unit): InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1 = InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1 is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
