package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/3.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/3
 */
@Serializable(with = InlineMessagesRequestToolChoiceOneOf4X63801b27.Serializer::class)
public class InlineMessagesRequestToolChoiceOneOf4X63801b27(
  public val name: String,
  public val type: InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968,
  public val disableParallelToolUse: Boolean? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968? = null

    public var type: InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var disableParallelToolUse: Boolean? = null

    public fun build(): InlineMessagesRequestToolChoiceOneOf4X63801b27 {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolChoiceOneOf4X63801b27(
        name = name,
        type = type,
        disableParallelToolUse = disableParallelToolUse,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolChoiceOneOf4X63801b27 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolChoiceOneOf4X63801b27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolChoiceOneOf4X63801b27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolChoiceOneOf4X63801b27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolChoiceOneOf4X63801b27 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineMessagesRequestToolChoiceOneOf4TypeX0ce41968>(rawObject, "type")
      return InlineMessagesRequestToolChoiceOneOf4X63801b27(
        name = name,
        type = type,
        disableParallelToolUse = rawObject["disable_parallel_tool_use"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolChoiceOneOf4X63801b27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolChoiceOneOf4X63801b27")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.disableParallelToolUse?.let { put("disable_parallel_tool_use", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestToolChoiceOneOf4X63801b27(block: InlineMessagesRequestToolChoiceOneOf4X63801b27.Builder.() -> Unit): InlineMessagesRequestToolChoiceOneOf4X63801b27 = InlineMessagesRequestToolChoiceOneOf4X63801b27.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolChoiceOneOf4X63801b27 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
