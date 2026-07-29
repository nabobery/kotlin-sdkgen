package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/rendering/properties/pdf.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/rendering/properties/pdf
 */
@Serializable(with = InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21.Serializer::class)
public class InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21(
  public val pageSize: InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416? = null,
) {
  public class Builder {
    public var pageSize: InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416? = null

    public fun build(): InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21 = InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21(
      pageSize = pageSize,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21 must be a JSON object")
      return InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21(
        pageSize = rawObject["page_size"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingPdfPageSizeX425f3416>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.pageSize?.let { put("page_size", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21(block: InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21.Builder.() -> Unit): InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21 = InlineV1InvoicesPostRequestFormRenderingPdfXe6f0df21.build(block)
