package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PersonUsCfpbDataView(
  @SerialName("ethnicity_details")
  public val ethnicityDetails: InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8? = null,
  @SerialName("race_details")
  public val raceDetails: InlinePersonUsCfpbDataRaceDetailsX44c61382? = null,
  @SerialName("self_identified_gender")
  public val selfIdentifiedGender: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_us_cfpb_data
 */
@Serializable(with = PersonUsCfpbData.Serializer::class)
public class PersonUsCfpbData(
  /**
   * The persons ethnicity details
   */
  public val ethnicityDetails: InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8? = null,
  /**
   * The persons race details
   */
  public val raceDetails: InlinePersonUsCfpbDataRaceDetailsX44c61382? = null,
  /**
   * The persons self-identified gender
   */
  public val selfIdentifiedGender: String? = null,
) {
  public class Builder {
    /**
     * The persons ethnicity details
     */
    public var ethnicityDetails: InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8? = null

    /**
     * The persons race details
     */
    public var raceDetails: InlinePersonUsCfpbDataRaceDetailsX44c61382? = null

    /**
     * The persons self-identified gender
     */
    public var selfIdentifiedGender: String? = null

    public fun build(): PersonUsCfpbData = PersonUsCfpbData(
      ethnicityDetails = ethnicityDetails,
      raceDetails = raceDetails,
      selfIdentifiedGender = selfIdentifiedGender,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PersonUsCfpbData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PersonUsCfpbData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PersonUsCfpbData {
      val jsonDecoder = decoder.requireJsonDecoder("PersonUsCfpbData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PersonUsCfpbData must be a JSON object")
      return PersonUsCfpbData(
        ethnicityDetails = rawObject["ethnicity_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePersonUsCfpbDataEthnicityDetailsX04c1a9f8?>(element) },
        raceDetails = rawObject["race_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePersonUsCfpbDataRaceDetailsX44c61382?>(element) },
        selfIdentifiedGender = rawObject["self_identified_gender"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PersonUsCfpbData) {
      val jsonEncoder = encoder.requireJsonEncoder("PersonUsCfpbData")
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

public fun personUsCfpbData(block: PersonUsCfpbData.Builder.() -> Unit): PersonUsCfpbData = PersonUsCfpbData.build(block)
