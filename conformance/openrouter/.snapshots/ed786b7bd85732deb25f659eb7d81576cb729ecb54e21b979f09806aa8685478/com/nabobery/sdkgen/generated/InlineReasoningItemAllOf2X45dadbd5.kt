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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ReasoningItem/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningItem/allOf/1
 */
@Serializable(with = InlineReasoningItemAllOf2X45dadbd5.Serializer::class)
public class InlineReasoningItemAllOf2X45dadbd5(
  content: List<ReasoningTextContent>? = null,
  public val format: ReasoningFormat? = null,
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

    public var signature: String? = null

    public fun build(): InlineReasoningItemAllOf2X45dadbd5 = InlineReasoningItemAllOf2X45dadbd5(
      content = content,
      format = format,
      signature = signature,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReasoningItemAllOf2X45dadbd5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReasoningItemAllOf2X45dadbd5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReasoningItemAllOf2X45dadbd5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReasoningItemAllOf2X45dadbd5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReasoningItemAllOf2X45dadbd5 must be a JSON object")
      return InlineReasoningItemAllOf2X45dadbd5(
        content = rawObject["content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ReasoningTextContent>?>(element) },
        format = rawObject["format"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningFormat?>(element) },
        signature = rawObject["signature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReasoningItemAllOf2X45dadbd5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReasoningItemAllOf2X45dadbd5")
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

public fun inlineReasoningItemAllOf2X45dadbd5(block: InlineReasoningItemAllOf2X45dadbd5.Builder.() -> Unit): InlineReasoningItemAllOf2X45dadbd5 = InlineReasoningItemAllOf2X45dadbd5.build(block)
