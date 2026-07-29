package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/relationship.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/relationship
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2.Serializer::class)
public class InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2(
  public val authorizer: Boolean? = null,
  public val director: Boolean? = null,
  public val executive: Boolean? = null,
  public val legalGuardian: Boolean? = null,
  public val owner: Boolean? = null,
  public val percentOwnership:
      InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184? = null,
  public val representative: Boolean? = null,
  public val title: String? = null,
) {
  public class Builder {
    public var authorizer: Boolean? = null

    public var director: Boolean? = null

    public var executive: Boolean? = null

    public var legalGuardian: Boolean? = null

    public var owner: Boolean? = null

    public var percentOwnership:
        InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184? = null

    public var representative: Boolean? = null

    public var title: String? = null

    public fun build(): InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2 = InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2(
      authorizer = authorizer,
      director = director,
      executive = executive,
      legalGuardian = legalGuardian,
      owner = owner,
      percentOwnership = percentOwnership,
      representative = representative,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2 must be a JSON object")
      return InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2(
        authorizer = rawObject["authorizer"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        director = rawObject["director"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        executive = rawObject["executive"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        legalGuardian = rawObject["legal_guardian"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        percentOwnership = rawObject["percent_ownership"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184>(it) },
        representative = rawObject["representative"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.authorizer?.let { put("authorizer", json.encodeToJsonElement(it)) }
        value.director?.let { put("director", json.encodeToJsonElement(it)) }
        value.executive?.let { put("executive", json.encodeToJsonElement(it)) }
        value.legalGuardian?.let { put("legal_guardian", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.percentOwnership?.let { put("percent_ownership", json.encodeToJsonElement(it)) }
        value.representative?.let { put("representative", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPersonRelationshipXa53c81a2(block: InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2 = InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2.build(block)
