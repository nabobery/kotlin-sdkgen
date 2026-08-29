package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item/properties/related/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item/properties/related/items
 */
@Serializable(with = InlineTopicSearchResultItemRelatedItemX12870445.Serializer::class)
public class InlineTopicSearchResultItemRelatedItemX12870445(
  public val topicRelation: InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab? = null,
) {
  public class Builder {
    public var topicRelation: InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab? = null

    public fun build(): InlineTopicSearchResultItemRelatedItemX12870445 = InlineTopicSearchResultItemRelatedItemX12870445(
      topicRelation = topicRelation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTopicSearchResultItemRelatedItemX12870445 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTopicSearchResultItemRelatedItemX12870445> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTopicSearchResultItemRelatedItemX12870445 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTopicSearchResultItemRelatedItemX12870445")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTopicSearchResultItemRelatedItemX12870445 must be a JSON object")
      return InlineTopicSearchResultItemRelatedItemX12870445(
        topicRelation = rawObject["topic_relation"]?.let { json.decodeFromJsonElement<InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTopicSearchResultItemRelatedItemX12870445) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTopicSearchResultItemRelatedItemX12870445")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.topicRelation?.let { put("topic_relation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTopicSearchResultItemRelatedItemX12870445(block: InlineTopicSearchResultItemRelatedItemX12870445.Builder.() -> Unit): InlineTopicSearchResultItemRelatedItemX12870445 = InlineTopicSearchResultItemRelatedItemX12870445.build(block)
