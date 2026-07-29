package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Information about text being collected using a reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_text
 */
@Serializable(with = TerminalReaderReaderResourceText.Serializer::class)
public class TerminalReaderReaderResourceText(
  /**
   * The collected text value
   */
  public val `value`: String? = null,
) {
  public class Builder {
    /**
     * The collected text value
     */
    public var `value`: String? = null

    public fun build(): TerminalReaderReaderResourceText = TerminalReaderReaderResourceText(
      value = value,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceText = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourceText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceText {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceText must be a JSON object")
      return TerminalReaderReaderResourceText(
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceText) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.value?.let { put("value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceText(block: TerminalReaderReaderResourceText.Builder.() -> Unit): TerminalReaderReaderResourceText = TerminalReaderReaderResourceText.build(block)
