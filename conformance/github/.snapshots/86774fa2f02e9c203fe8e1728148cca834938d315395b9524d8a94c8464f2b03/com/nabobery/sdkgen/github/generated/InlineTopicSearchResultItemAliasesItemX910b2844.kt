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
 * sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item/properties/aliases/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item/properties/aliases/items
 */
@Serializable(with = InlineTopicSearchResultItemAliasesItemX910b2844.Serializer::class)
public class InlineTopicSearchResultItemAliasesItemX910b2844(
  public val topicRelation: InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94? = null,
) {
  public class Builder {
    public var topicRelation: InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94? = null

    public fun build(): InlineTopicSearchResultItemAliasesItemX910b2844 = InlineTopicSearchResultItemAliasesItemX910b2844(
      topicRelation = topicRelation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTopicSearchResultItemAliasesItemX910b2844 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTopicSearchResultItemAliasesItemX910b2844> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTopicSearchResultItemAliasesItemX910b2844 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTopicSearchResultItemAliasesItemX910b2844")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTopicSearchResultItemAliasesItemX910b2844 must be a JSON object")
      return InlineTopicSearchResultItemAliasesItemX910b2844(
        topicRelation = rawObject["topic_relation"]?.let { json.decodeFromJsonElement<InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTopicSearchResultItemAliasesItemX910b2844) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTopicSearchResultItemAliasesItemX910b2844")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.topicRelation?.let { put("topic_relation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTopicSearchResultItemAliasesItemX910b2844(block: InlineTopicSearchResultItemAliasesItemX910b2844.Builder.() -> Unit): InlineTopicSearchResultItemAliasesItemX910b2844 = InlineTopicSearchResultItemAliasesItemX910b2844.build(block)
