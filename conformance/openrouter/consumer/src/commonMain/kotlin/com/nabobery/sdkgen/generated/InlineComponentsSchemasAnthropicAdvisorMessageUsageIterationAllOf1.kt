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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorMessageUsageIteration/allOf/1.
 */
@Serializable(with = InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1.Serializer::class)
public class InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1(
  public val model: String,
  public val type: InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var typeValue:
        InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType? = null

    public var type:
        InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1 {
      check(modelValue != null) { "model is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1(
        model = model,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1 must be a " +
          "JSON object")
      val model = json.decodeRequired<String>(raw, "model")
      val type = json
        .decodeRequired<InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType>(raw, "type")
      return InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1(
        model = model,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1(block: InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1.Builder.() -> Unit): InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1 = InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
