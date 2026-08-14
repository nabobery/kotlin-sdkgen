package io.github.nabobery.sdkgen.generated.stripe

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
 * Information about a phone number being collected using a reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_phone
 */
@Serializable(with = TerminalReaderReaderResourcePhone.Serializer::class)
public class TerminalReaderReaderResourcePhone(
  /**
   * The collected phone number
   */
  public val `value`: String? = null,
) {
  public class Builder {
    /**
     * The collected phone number
     */
    public var `value`: String? = null

    public fun build(): TerminalReaderReaderResourcePhone = TerminalReaderReaderResourcePhone(
      value = value,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourcePhone = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourcePhone> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourcePhone {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourcePhone")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourcePhone must be a JSON object")
      return TerminalReaderReaderResourcePhone(
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourcePhone) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourcePhone")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.value?.let { put("value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourcePhone(block: TerminalReaderReaderResourcePhone.Builder.() -> Unit): TerminalReaderReaderResourcePhone = TerminalReaderReaderResourcePhone.build(block)
