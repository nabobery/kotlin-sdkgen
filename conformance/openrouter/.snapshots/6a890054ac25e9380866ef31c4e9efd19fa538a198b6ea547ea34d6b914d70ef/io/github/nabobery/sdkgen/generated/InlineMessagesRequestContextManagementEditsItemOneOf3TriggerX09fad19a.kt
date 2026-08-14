package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/2/properties/trigger.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/2/properties/trigger
 */
@Serializable(with = InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a.Serializer::class)
public class InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a(
  public val type: InlineAnthropicInputTokensTriggerTypeX8451559b,
  public val `value`: Int,
) {
  public class Builder {
    private var typeValue: InlineAnthropicInputTokensTriggerTypeX8451559b? = null

    public var type: InlineAnthropicInputTokensTriggerTypeX8451559b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: Int? = null

    public var `value`: Int
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicInputTokensTriggerTypeX8451559b>(rawObject, "type")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a(block: InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a.Builder.() -> Unit): InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a = InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestContextManagementEditsItemOneOf3TriggerX09fad19a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
