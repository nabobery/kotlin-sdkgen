package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicUnknownUsageIteration/allOf/1
 */
@Serializable(with = InlineAnthropicUnknownUsageIterationAllOf2X25173df0.Serializer::class)
public class InlineAnthropicUnknownUsageIterationAllOf2X25173df0(
  public val type: String,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineAnthropicUnknownUsageIterationAllOf2X25173df0 {
      check(typeValue != null) { "type is required" }
      return InlineAnthropicUnknownUsageIterationAllOf2X25173df0(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnthropicUnknownUsageIterationAllOf2X25173df0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnthropicUnknownUsageIterationAllOf2X25173df0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnthropicUnknownUsageIterationAllOf2X25173df0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnthropicUnknownUsageIterationAllOf2X25173df0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnthropicUnknownUsageIterationAllOf2X25173df0 must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineAnthropicUnknownUsageIterationAllOf2X25173df0(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicUnknownUsageIterationAllOf2X25173df0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnthropicUnknownUsageIterationAllOf2X25173df0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnthropicUnknownUsageIterationAllOf2X25173df0(block: InlineAnthropicUnknownUsageIterationAllOf2X25173df0.Builder.() -> Unit): InlineAnthropicUnknownUsageIterationAllOf2X25173df0 = InlineAnthropicUnknownUsageIterationAllOf2X25173df0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnthropicUnknownUsageIterationAllOf2X25173df0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
