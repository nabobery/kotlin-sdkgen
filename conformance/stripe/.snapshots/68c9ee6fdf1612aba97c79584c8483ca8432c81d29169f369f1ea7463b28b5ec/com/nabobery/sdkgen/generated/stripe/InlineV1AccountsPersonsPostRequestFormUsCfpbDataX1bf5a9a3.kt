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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/us_cfpb_data
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3(
  public val ethnicityDetails:
      InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a? = null,
  public val raceDetails:
      InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b? = null,
  public val selfIdentifiedGender: String? = null,
) {
  public class Builder {
    public var ethnicityDetails:
        InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a? = null

    public var raceDetails: InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b? =
        null

    public var selfIdentifiedGender: String? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3 = InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3(
      ethnicityDetails = ethnicityDetails,
      raceDetails = raceDetails,
      selfIdentifiedGender = selfIdentifiedGender,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3 must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3(
        ethnicityDetails = rawObject["ethnicity_details"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a>(it) },
        raceDetails = rawObject["race_details"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b>(it) },
        selfIdentifiedGender = rawObject["self_identified_gender"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3")
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

public fun inlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3(block: InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3 = InlineV1AccountsPersonsPostRequestFormUsCfpbDataX1bf5a9a3.build(block)
