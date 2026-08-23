package com.nabobery.sdkgen.generated.stripe

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
 * roperties/person/properties/us_cfpb_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/us_cfpb_data
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0.Serializer::class)
public class InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0(
  public val ethnicityDetails:
      InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75? = null,
  public val raceDetails: InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69? = null,
  public val selfIdentifiedGender: String? = null,
) {
  public class Builder {
    public var ethnicityDetails:
        InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75? = null

    public var raceDetails: InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69? =
        null

    public var selfIdentifiedGender: String? = null

    public fun build(): InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0 = InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0(
      ethnicityDetails = ethnicityDetails,
      raceDetails = raceDetails,
      selfIdentifiedGender = selfIdentifiedGender,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0 must be a JSON object")
      return InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0(
        ethnicityDetails = rawObject["ethnicity_details"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75>(it) },
        raceDetails = rawObject["race_details"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonUsCfpbDataRaceDetailsXbb944d69>(it) },
        selfIdentifiedGender = rawObject["self_identified_gender"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ethnicityDetails?.let { put("ethnicity_details", json.encodeToJsonElement(it)) }
        value.raceDetails?.let { put("race_details", json.encodeToJsonElement(it)) }
        value.selfIdentifiedGender?.let { put("self_identified_gender", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0(block: InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0 = InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0.build(block)
