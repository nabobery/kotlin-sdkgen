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
 * sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item/properties/related/items/properties/topic_r
 * elation.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/topic-search-result-item/properties/related/items/properties/topic_r
 * elation
 */
@Serializable(with = InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab.Serializer::class)
public class InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab(
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

    public fun build(): InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab = InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab(
      id = id,
      name = name,
      relationType = relationType,
      topicId = topicId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab must be a JSON object")
      return InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        relationType = rawObject["relation_type"]?.let { json.decodeFromJsonElement<String>(it) },
        topicId = rawObject["topic_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab")
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

public fun inlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab(block: InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab.Builder.() -> Unit): InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab = InlineTopicSearchResultItemRelatedItemTopicRelationX310a5eab.build(block)
