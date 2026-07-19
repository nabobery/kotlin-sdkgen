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
 * The document object echoing the original input (text and/or image)
 */
@Serializable(with = InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20
  .Serializer::class)
public class InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20(
  /**
   * The image (URL or data URI) from the original document
   */
  public val image: String? = null,
  /**
   * The document text
   */
  public val text: String? = null,
) {
  public class Builder {
    /**
     * The image (URL or data URI) from the original document
     */
    public var image: String? = null

    /**
     * The document text
     */
    public var text: String? = null

    public fun build(): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20 =
      InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20(
      image = image,
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20 = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20 " +
          "must be a JSON object")
      return InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20(
        image = raw["image"]?.let { json.decodeFromJsonElement<String>(it) },
        text = raw["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.image?.let { put("image", it) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20(block: InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20.Builder.() -> Unit): InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20 = InlinePathsRerankPostResponses200ContentApplicationJsonSchemaPropertiesResultsItfec02a20.build(block)
