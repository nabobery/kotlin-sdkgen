package io.github.nabobery.sdkgen.generated.stripe

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
 * Choice to be selected on a Reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_choice
 */
@Serializable(with = TerminalReaderReaderResourceChoice.Serializer::class)
public class TerminalReaderReaderResourceChoice(
  /**
   * The text to be selected. Maximum 30 characters.
   */
  public val text: String,
  /**
   * The identifier for the selected choice. Maximum 50 characters.
   */
  public val id: String? = null,
  /**
   * The button style for the choice. Can be `primary` or `secondary`.
   */
  public val style: InlineTerminalReaderReaderResourceChoiceStyleX04084fe4? = null,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    /**
     * The identifier for the selected choice. Maximum 50 characters.
     */
    public var id: String? = null

    /**
     * The button style for the choice. Can be `primary` or `secondary`.
     */
    public var style: InlineTerminalReaderReaderResourceChoiceStyleX04084fe4? = null

    public fun build(): TerminalReaderReaderResourceChoice {
      check(textValue != null) { "text is required" }
      return TerminalReaderReaderResourceChoice(
        text = text,
        id = id,
        style = style,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceChoice = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourceChoice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceChoice {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceChoice")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceChoice must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      return TerminalReaderReaderResourceChoice(
        text = text,
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        style = rawObject["style"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTerminalReaderReaderResourceChoiceStyleX04084fe4?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceChoice) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceChoice")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        value.id?.let { put("id", it) }
        value.style?.let { put("style", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceChoice(block: TerminalReaderReaderResourceChoice.Builder.() -> Unit): TerminalReaderReaderResourceChoice = TerminalReaderReaderResourceChoice.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceChoice is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
