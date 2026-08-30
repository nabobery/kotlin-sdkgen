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
 * Demographic data related to the person.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/us_cfpb_data
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa(
  public val ethnicityDetails:
      InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX8d48f1bb? = null,
  public val raceDetails:
      InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809? = null,
  public val selfIdentifiedGender: String? = null,
) {
  public class Builder {
    public var ethnicityDetails:
        InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX8d48f1bb? = null

    public var raceDetails: InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809? =
        null

    public var selfIdentifiedGender: String? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa = InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa(
      ethnicityDetails = ethnicityDetails,
      raceDetails = raceDetails,
      selfIdentifiedGender = selfIdentifiedGender,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa(
        ethnicityDetails = rawObject["ethnicity_details"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX8d48f1bb>(it) },
        raceDetails = rawObject["race_details"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809>(it) },
        selfIdentifiedGender = rawObject["self_identified_gender"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa")
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

public fun inlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa(block: InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa = InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa.build(block)
