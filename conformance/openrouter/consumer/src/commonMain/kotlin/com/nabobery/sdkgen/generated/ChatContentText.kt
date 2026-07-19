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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Text content part
 */
@Serializable(with = ChatContentText.Serializer::class)
public class ChatContentText(
  public val text: String,
  public val type: InlineComponentsSchemasChatContentTextPropertiesType,
  public val cacheControl: ChatContentCacheControl? = null,
  public val promptCacheBreakpoint: PromptCacheBreakpoint? = null,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineComponentsSchemasChatContentTextPropertiesType? = null

    public var type: InlineComponentsSchemasChatContentTextPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: ChatContentCacheControl? = null

    public var promptCacheBreakpoint: PromptCacheBreakpoint? = null

    public fun build(): ChatContentText {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return ChatContentText(
        text = text,
        type = type,
        cacheControl = cacheControl,
        promptCacheBreakpoint = promptCacheBreakpoint,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatContentText = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatContentText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatContentText {
      val jsonDecoder = decoder.requireJsonDecoder("ChatContentText")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatContentText must be a JSON object")
      val text = json.decodeRequired<String>(raw, "text")
      val type = json.decodeRequired<InlineComponentsSchemasChatContentTextPropertiesType>(raw, "type")
      return ChatContentText(
        text = text,
        type = type,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<ChatContentCacheControl>(it) },
        promptCacheBreakpoint = raw["prompt_cache_breakpoint"]?.let { element ->
          if (element == JsonNull) null else json.decodeFromJsonElement<PromptCacheBreakpoint?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatContentText) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatContentText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.promptCacheBreakpoint?.let { put("prompt_cache_breakpoint", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatContentText(block: ChatContentText.Builder.() -> Unit): ChatContentText = ChatContentText.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatContentText is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
