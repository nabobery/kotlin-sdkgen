package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Information about a selection being collected using a reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_selection
 */
@Serializable(with = TerminalReaderReaderResourceSelection.Serializer::class)
public class TerminalReaderReaderResourceSelection(
  choices: List<TerminalReaderReaderResourceChoice>,
  /**
   * The id of the selected choice
   */
  public val id: String? = null,
  /**
   * The text of the selected choice
   */
  public val text: String? = null,
) {
  /**
   * List of possible choices to be selected
   */
  public val choices: List<TerminalReaderReaderResourceChoice> = choices.toList()

  public class Builder {
    private var choicesValue: List<TerminalReaderReaderResourceChoice>? = null

    public var choices: List<TerminalReaderReaderResourceChoice>
      get() = requireNotNull(choicesValue) { "choices is required" }.toList()
      set(`value`) {
        choicesValue = value.toList()
      }

    /**
     * The id of the selected choice
     */
    public var id: String? = null

    /**
     * The text of the selected choice
     */
    public var text: String? = null

    public fun build(): TerminalReaderReaderResourceSelection {
      check(choicesValue != null) { "choices is required" }
      return TerminalReaderReaderResourceSelection(
        choices = choices,
        id = id,
        text = text,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceSelection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourceSelection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceSelection {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceSelection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceSelection must be a JSON object")
      val choices = json.decodeRequired<List<TerminalReaderReaderResourceChoice>>(rawObject, "choices")
      return TerminalReaderReaderResourceSelection(
        choices = choices,
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        text = rawObject["text"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceSelection) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceSelection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("choices", json.encodeToJsonElement(value.choices))
        value.id?.let { put("id", it) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceSelection(block: TerminalReaderReaderResourceSelection.Builder.() -> Unit): TerminalReaderReaderResourceSelection = TerminalReaderReaderResourceSelection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceSelection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
