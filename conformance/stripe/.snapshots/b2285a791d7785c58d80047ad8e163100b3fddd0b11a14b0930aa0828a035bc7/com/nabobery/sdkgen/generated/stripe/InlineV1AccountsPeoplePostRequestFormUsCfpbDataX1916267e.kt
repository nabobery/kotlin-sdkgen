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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/us_cfpb_data
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e(
  public val ethnicityDetails:
      InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d? = null,
  public val raceDetails:
      InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8? = null,
  public val selfIdentifiedGender: String? = null,
) {
  public class Builder {
    public var ethnicityDetails:
        InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d? = null

    public var raceDetails: InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8? =
        null

    public var selfIdentifiedGender: String? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e = InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e(
      ethnicityDetails = ethnicityDetails,
      raceDetails = raceDetails,
      selfIdentifiedGender = selfIdentifiedGender,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e(
        ethnicityDetails = rawObject["ethnicity_details"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d>(it) },
        raceDetails = rawObject["race_details"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8>(it) },
        selfIdentifiedGender = rawObject["self_identified_gender"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e")
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

public fun inlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e(block: InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e = InlineV1AccountsPeoplePostRequestFormUsCfpbDataX1916267e.build(block)
