package com.nabobery.sdkgen.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Options for PDF parsing.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PDFParserOptions
 */
@Serializable(with = PdfParserOptions.Serializer::class)
public class PdfParserOptions(
  public val engine: PdfParserEngine? = null,
) {
  public class Builder {
    public var engine: PdfParserEngine? = null

    public fun build(): PdfParserOptions = PdfParserOptions(
      engine = engine,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PdfParserOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PdfParserOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PdfParserOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PdfParserOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PdfParserOptions must be a JSON object")
      return PdfParserOptions(
        engine = rawObject["engine"]?.let { json.decodeFromJsonElement<PdfParserEngine>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PdfParserOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PdfParserOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.engine?.let { put("engine", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pdfParserOptions(block: PdfParserOptions.Builder.() -> Unit): PdfParserOptions = PdfParserOptions.build(block)
