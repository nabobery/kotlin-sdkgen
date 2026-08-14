package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/relationship.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/relationship
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466(
  public val director: Boolean? = null,
  public val executive: Boolean? = null,
  public val owner: Boolean? = null,
  public val percentOwnership:
      InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9? = null,
  public val title: String? = null,
) {
  public class Builder {
    public var director: Boolean? = null

    public var executive: Boolean? = null

    public var owner: Boolean? = null

    public var percentOwnership:
        InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9? = null

    public var title: String? = null

    public fun build(): InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466 = InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466(
      director = director,
      executive = executive,
      owner = owner,
      percentOwnership = percentOwnership,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466 must be a JSON object")
      return InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466(
        director = rawObject["director"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        executive = rawObject["executive"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        percentOwnership = rawObject["percent_ownership"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.director?.let { put("director", json.encodeToJsonElement(it)) }
        value.executive?.let { put("executive", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.percentOwnership?.let { put("percent_ownership", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466(block: InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466.Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466 = InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466.build(block)
