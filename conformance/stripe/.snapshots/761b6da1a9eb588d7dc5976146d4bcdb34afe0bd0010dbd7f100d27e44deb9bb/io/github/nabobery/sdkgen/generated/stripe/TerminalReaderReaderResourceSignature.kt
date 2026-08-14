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
 * Information about a signature being collected using a reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_signature
 */
@Serializable(with = TerminalReaderReaderResourceSignature.Serializer::class)
public class TerminalReaderReaderResourceSignature(
  /**
   * The File ID of a collected signature image
   */
  public val `value`: String? = null,
) {
  public class Builder {
    /**
     * The File ID of a collected signature image
     */
    public var `value`: String? = null

    public fun build(): TerminalReaderReaderResourceSignature = TerminalReaderReaderResourceSignature(
      value = value,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceSignature = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalReaderReaderResourceSignature> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceSignature {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceSignature")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceSignature must be a JSON object")
      return TerminalReaderReaderResourceSignature(
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceSignature) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceSignature")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.value?.let { put("value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceSignature(block: TerminalReaderReaderResourceSignature.Builder.() -> Unit): TerminalReaderReaderResourceSignature = TerminalReaderReaderResourceSignature.build(block)
