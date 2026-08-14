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
 * Custom grammar response format
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatGrammarConfig
 */
@Serializable(with = ChatFormatGrammarConfig.Serializer::class)
public class ChatFormatGrammarConfig(
  /**
   * Custom grammar for text generation
   */
  public val grammar: String,
  public val type: InlineChatFormatGrammarConfigTypeX48ad27f4,
) {
  public class Builder {
    private var grammarValue: String? = null

    public var grammar: String
      get() = requireNotNull(grammarValue) { "grammar is required" }
      set(`value`) {
        grammarValue = value
      }

    private var typeValue: InlineChatFormatGrammarConfigTypeX48ad27f4? = null

    public var type: InlineChatFormatGrammarConfigTypeX48ad27f4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatFormatGrammarConfig {
      check(grammarValue != null) { "grammar is required" }
      check(typeValue != null) { "type is required" }
      return ChatFormatGrammarConfig(
        grammar = grammar,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatFormatGrammarConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatFormatGrammarConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatFormatGrammarConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ChatFormatGrammarConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatFormatGrammarConfig must be a JSON object")
      val grammar = json.decodeRequired<String>(rawObject, "grammar")
      val type = json.decodeRequired<InlineChatFormatGrammarConfigTypeX48ad27f4>(rawObject, "type")
      return ChatFormatGrammarConfig(
        grammar = grammar,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatFormatGrammarConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatFormatGrammarConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("grammar", value.grammar)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatFormatGrammarConfig(block: ChatFormatGrammarConfig.Builder.() -> Unit): ChatFormatGrammarConfig = ChatFormatGrammarConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatFormatGrammarConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
