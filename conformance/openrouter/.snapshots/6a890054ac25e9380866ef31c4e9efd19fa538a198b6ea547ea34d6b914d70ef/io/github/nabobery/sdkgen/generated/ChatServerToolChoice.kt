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

@Serializable
public data class ChatServerToolChoiceView(
  public val type: String,
)

/**
 * OpenRouter extension: force a specific server tool by naming it directly in `tool_choice.type` instead of wrapping it
 * in `{ type: "function", function: { name } }`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatServerToolChoice
 */
@Serializable(with = ChatServerToolChoice.Serializer::class)
public class ChatServerToolChoice(
  /**
   * OpenRouter server-tool type to force (e.g. `openrouter:web_search`, `web_search`, `web_search_preview`).
   */
  public val type: String,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatServerToolChoice {
      check(typeValue != null) { "type is required" }
      return ChatServerToolChoice(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatServerToolChoice = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatServerToolChoice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatServerToolChoice {
      val jsonDecoder = decoder.requireJsonDecoder("ChatServerToolChoice")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatServerToolChoice must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return ChatServerToolChoice(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatServerToolChoice) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatServerToolChoice")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatServerToolChoice(block: ChatServerToolChoice.Builder.() -> Unit): ChatServerToolChoice = ChatServerToolChoice.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatServerToolChoice is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
