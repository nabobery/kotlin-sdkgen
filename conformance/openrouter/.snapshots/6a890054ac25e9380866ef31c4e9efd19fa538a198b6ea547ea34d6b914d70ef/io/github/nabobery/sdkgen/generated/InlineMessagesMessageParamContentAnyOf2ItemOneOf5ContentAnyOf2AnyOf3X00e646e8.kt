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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content/anyOf/1/items/anyOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/4/proper
 * ties/content/anyOf/1/items/anyOf/2
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8(
  public val toolName: String,
  public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4,
) {
  public class Builder {
    private var toolNameValue: String? = null

    public var toolName: String
      get() = requireNotNull(toolNameValue) { "toolName is required" }
      set(`value`) {
        toolNameValue = value
      }

    private var typeValue:
        InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4? = null

    public var type: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 {
      check(toolNameValue != null) { "toolName is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8(
        toolName = toolName,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 must be a JSON object")
      val toolName = json.decodeRequired<String>(rawObject, "tool_name")
      val type = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2ItemTypeX10072ad4>(rawObject, "type")
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8(
        toolName = toolName,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tool_name", value.toolName)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8(block: InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8.Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 = InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf5ContentAnyOf2AnyOf3X00e646e8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
