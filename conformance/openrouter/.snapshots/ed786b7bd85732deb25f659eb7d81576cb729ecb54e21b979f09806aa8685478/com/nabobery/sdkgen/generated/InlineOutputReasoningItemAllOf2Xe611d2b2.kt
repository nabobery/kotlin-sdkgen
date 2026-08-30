package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputReasoningItem/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputReasoningItem/allOf/1
 */
@Serializable(with = InlineOutputReasoningItemAllOf2Xe611d2b2.Serializer::class)
public class InlineOutputReasoningItemAllOf2Xe611d2b2(
  content: List<ReasoningTextContent>? = null,
  public val format: ReasoningFormat? = null,
  /**
   * A signature for the reasoning content, used for verification
   */
  public val signature: String? = null,
) {
  public val content: List<ReasoningTextContent>? =
      content?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var contentValue: List<ReasoningTextContent>? = null

    public var content: List<ReasoningTextContent>?
      get() = contentValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        contentValue = value?.let { collection0 -> collection0.toList() }
      }

    public var format: ReasoningFormat? = null

    /**
     * A signature for the reasoning content, used for verification
     */
    public var signature: String? = null

    public fun build(): InlineOutputReasoningItemAllOf2Xe611d2b2 = InlineOutputReasoningItemAllOf2Xe611d2b2(
      content = content,
      format = format,
      signature = signature,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputReasoningItemAllOf2Xe611d2b2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputReasoningItemAllOf2Xe611d2b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputReasoningItemAllOf2Xe611d2b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputReasoningItemAllOf2Xe611d2b2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputReasoningItemAllOf2Xe611d2b2 must be a JSON object")
      return InlineOutputReasoningItemAllOf2Xe611d2b2(
        content = rawObject["content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ReasoningTextContent>?>(element) },
        format = rawObject["format"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningFormat?>(element) },
        signature = rawObject["signature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputReasoningItemAllOf2Xe611d2b2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputReasoningItemAllOf2Xe611d2b2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.content?.let { put("content", json.encodeToJsonElement(it)) }
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
        value.signature?.let { put("signature", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputReasoningItemAllOf2Xe611d2b2(block: InlineOutputReasoningItemAllOf2Xe611d2b2.Builder.() -> Unit): InlineOutputReasoningItemAllOf2Xe611d2b2 = InlineOutputReasoningItemAllOf2Xe611d2b2.build(block)
