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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/0
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299.Serializer::class)
public class InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299(
  public val text: String,
  public val type: InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670? = null

    public var type: InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299 {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299(
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299 must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670>(rawObject, "type")
      return InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299(
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299(block: InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299.Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299 = InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
