package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class InputTextView(
  @SerialName("prompt_cache_breakpoint")
  public val promptCacheBreakpoint: PromptCacheBreakpoint? = null,
  public val text: String,
  public val type: InlineInputTextTypeX6c23df33,
)

/**
 * Text input content item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputText
 */
@Serializable(with = InputText.Serializer::class)
public class InputText(
  public val text: String,
  public val type: InlineInputTextTypeX6c23df33,
  public val promptCacheBreakpoint: PromptCacheBreakpoint? = null,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineInputTextTypeX6c23df33? = null

    public var type: InlineInputTextTypeX6c23df33
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var promptCacheBreakpoint: PromptCacheBreakpoint? = null

    public fun build(): InputText {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return InputText(
        text = text,
        type = type,
        promptCacheBreakpoint = promptCacheBreakpoint,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InputText = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InputText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InputText {
      val jsonDecoder = decoder.requireJsonDecoder("InputText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InputText must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineInputTextTypeX6c23df33>(rawObject, "type")
      return InputText(
        text = text,
        type = type,
        promptCacheBreakpoint = rawObject["prompt_cache_breakpoint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PromptCacheBreakpoint?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InputText) {
      val jsonEncoder = encoder.requireJsonEncoder("InputText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
        value.promptCacheBreakpoint?.let { put("prompt_cache_breakpoint", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inputText(block: InputText.Builder.() -> Unit): InputText = InputText.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InputText is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
