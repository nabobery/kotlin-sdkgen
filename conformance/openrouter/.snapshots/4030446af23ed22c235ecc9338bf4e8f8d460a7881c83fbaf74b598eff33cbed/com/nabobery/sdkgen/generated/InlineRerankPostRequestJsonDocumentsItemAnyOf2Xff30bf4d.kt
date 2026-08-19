package com.nabobery.sdkgen.generated

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * A structured document with optional text and/or image content. At least one of `text` or `image` must be provided.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1rerank/post/requestBody/content/application~1json/schema/properties/documents/i
 * tems/anyOf/1
 */
@Serializable(with = InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d.Serializer::class)
public class InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d(
  /**
   * An image associated with the document, as a remote URL (http/https) or a base64-encoded data URI (data:image/...).
   */
  public val image: String? = null,
  /**
   * The document text
   */
  public val text: String? = null,
) {
  public class Builder {
    /**
     * An image associated with the document, as a remote URL (http/https) or a base64-encoded data URI
     * (data:image/...).
     */
    public var image: String? = null

    /**
     * The document text
     */
    public var text: String? = null

    public fun build(): InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d = InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d(
      image = image,
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d must be a JSON object")
      return InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d(
        image = rawObject["image"]?.let { json.decodeFromJsonElement<String>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.image?.let { put("image", it) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d(block: InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d.Builder.() -> Unit): InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d = InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d.build(block)
