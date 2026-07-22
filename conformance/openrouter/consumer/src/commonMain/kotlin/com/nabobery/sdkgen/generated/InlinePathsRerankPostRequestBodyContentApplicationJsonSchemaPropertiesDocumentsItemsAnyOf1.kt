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
 */
@Serializable(with = InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1
  .Serializer::class)
public class InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1(
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

    public fun build(): InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1 =
      InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1(
      image = image,
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1 = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1 " +
          "must be a JSON object")
      return InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1(
        image = raw["image"]?.let { json.decodeFromJsonElement<String>(it) },
        text = raw["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.image?.let { put("image", it) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1(block: InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1.Builder.() -> Unit): InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1 = InlinePathsRerankPostRequestBodyContentApplicationJsonSchemaPropertiesDocumentsItemsAnyOf1.build(block)
