package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item/properties/aliases/items/properties/topic_r
 * elation.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item/properties/aliases/items/properties/topic_r
 * elation
 */
@Serializable(with = InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94.Serializer::class)
public class InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94(
  public val id: Int? = null,
  public val name: String? = null,
  public val relationType: String? = null,
  public val topicId: Int? = null,
) {
  public class Builder {
    public var id: Int? = null

    public var name: String? = null

    public var relationType: String? = null

    public var topicId: Int? = null

    public fun build(): InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94 = InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94(
      id = id,
      name = name,
      relationType = relationType,
      topicId = topicId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94 must be a JSON object")
      return InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        relationType = rawObject["relation_type"]?.let { json.decodeFromJsonElement<String>(it) },
        topicId = rawObject["topic_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.relationType?.let { put("relation_type", it) }
        value.topicId?.let { put("topic_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTopicSearchResultItemAliasesItemTopicRelationX09741b94(block: InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94.Builder.() -> Unit): InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94 = InlineTopicSearchResultItemAliasesItemTopicRelationX09741b94.build(block)
