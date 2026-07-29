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
 * The relationship that this person has with the account's legal entity.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/relationship
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d(
  public val authorizer: Boolean? = null,
  public val director: Boolean? = null,
  public val executive: Boolean? = null,
  public val legalGuardian: Boolean? = null,
  public val owner: Boolean? = null,
  public val percentOwnership:
      InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce? = null,
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
        InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce? = null

    public var representative: Boolean? = null

    public var title: String? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d = InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d(
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
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d(
        authorizer = rawObject["authorizer"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        director = rawObject["director"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        executive = rawObject["executive"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        legalGuardian = rawObject["legal_guardian"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        percentOwnership = rawObject["percent_ownership"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce>(it) },
        representative = rawObject["representative"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d")
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

public fun inlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d(block: InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d = InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d.build(block)
