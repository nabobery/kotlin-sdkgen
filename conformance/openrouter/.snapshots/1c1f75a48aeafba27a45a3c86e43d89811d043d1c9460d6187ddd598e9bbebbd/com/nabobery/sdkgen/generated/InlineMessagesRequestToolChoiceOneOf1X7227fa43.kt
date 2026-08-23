package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/0
 */
@Serializable(with = InlineMessagesRequestToolChoiceOneOf1X7227fa43.Serializer::class)
public class InlineMessagesRequestToolChoiceOneOf1X7227fa43(
  public val type: InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611,
  public val disableParallelToolUse: Boolean? = null,
) {
  public class Builder {
    private var typeValue: InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611? = null

    public var type: InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var disableParallelToolUse: Boolean? = null

    public fun build(): InlineMessagesRequestToolChoiceOneOf1X7227fa43 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolChoiceOneOf1X7227fa43(
        type = type,
        disableParallelToolUse = disableParallelToolUse,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolChoiceOneOf1X7227fa43 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolChoiceOneOf1X7227fa43> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolChoiceOneOf1X7227fa43 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolChoiceOneOf1X7227fa43")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolChoiceOneOf1X7227fa43 must be a JSON object")
      val type = json.decodeRequired<InlineMessagesRequestToolChoiceOneOf1TypeXbf4d8611>(rawObject, "type")
      return InlineMessagesRequestToolChoiceOneOf1X7227fa43(
        type = type,
        disableParallelToolUse = rawObject["disable_parallel_tool_use"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolChoiceOneOf1X7227fa43) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolChoiceOneOf1X7227fa43")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.disableParallelToolUse?.let { put("disable_parallel_tool_use", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestToolChoiceOneOf1X7227fa43(block: InlineMessagesRequestToolChoiceOneOf1X7227fa43.Builder.() -> Unit): InlineMessagesRequestToolChoiceOneOf1X7227fa43 = InlineMessagesRequestToolChoiceOneOf1X7227fa43.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolChoiceOneOf1X7227fa43 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
