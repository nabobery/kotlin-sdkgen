package com.nabobery.sdkgen.generated.stripe

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
 * Represents a reader action to print content
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_print_content
 */
@Serializable(with = TerminalReaderReaderResourcePrintContent.Serializer::class)
public class TerminalReaderReaderResourcePrintContent(
  /**
   * The type of content to print. Currently supports `image`.
   */
  public val type: InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36,
  public val image: TerminalReaderReaderResourceFileMetadata? = null,
) {
  public class Builder {
    private var typeValue: InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36? = null

    public var type: InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var image: TerminalReaderReaderResourceFileMetadata? = null

    public fun build(): TerminalReaderReaderResourcePrintContent {
      check(typeValue != null) { "type is required" }
      return TerminalReaderReaderResourcePrintContent(
        type = type,
        image = image,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourcePrintContent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourcePrintContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourcePrintContent {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourcePrintContent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourcePrintContent must be a JSON object")
      val type = json.decodeRequired<InlineTerminalReaderReaderResourcePrintContentTypeX8c315c36>(rawObject, "type")
      return TerminalReaderReaderResourcePrintContent(
        type = type,
        image = rawObject["image"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceFileMetadata>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourcePrintContent) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourcePrintContent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.image?.let { put("image", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourcePrintContent(block: TerminalReaderReaderResourcePrintContent.Builder.() -> Unit): TerminalReaderReaderResourcePrintContent = TerminalReaderReaderResourcePrintContent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourcePrintContent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
