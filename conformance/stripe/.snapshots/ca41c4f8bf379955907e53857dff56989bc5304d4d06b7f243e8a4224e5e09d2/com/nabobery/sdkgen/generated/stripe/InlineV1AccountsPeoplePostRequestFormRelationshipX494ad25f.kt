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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/relationship
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f(
  public val authorizer: Boolean? = null,
  public val director: Boolean? = null,
  public val executive: Boolean? = null,
  public val legalGuardian: Boolean? = null,
  public val owner: Boolean? = null,
  public val percentOwnership:
      InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4? = null,
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
        InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4? = null

    public var representative: Boolean? = null

    public var title: String? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f = InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f(
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
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f(
        authorizer = rawObject["authorizer"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        director = rawObject["director"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        executive = rawObject["executive"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        legalGuardian = rawObject["legal_guardian"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        percentOwnership = rawObject["percent_ownership"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4>(it) },
        representative = rawObject["representative"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f")
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

public fun inlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f(block: InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f = InlineV1AccountsPeoplePostRequestFormRelationshipX494ad25f.build(block)
