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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorMessageUsageIteration/allOf/1
 */
@Serializable(with = InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b.Serializer::class)
public class InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b(
  public val model: String,
  public val type: InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var typeValue: InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17? = null

    public var type: InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b {
      check(modelValue != null) { "model is required" }
      check(typeValue != null) { "type is required" }
      return InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b(
        model = model,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      val type = json.decodeRequired<InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17>(rawObject, "type")
      return InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b(
        model = model,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b(block: InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b.Builder.() -> Unit): InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b = InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnthropicAdvisorMessageUsageIterationAllOf2Xcb593e8b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
