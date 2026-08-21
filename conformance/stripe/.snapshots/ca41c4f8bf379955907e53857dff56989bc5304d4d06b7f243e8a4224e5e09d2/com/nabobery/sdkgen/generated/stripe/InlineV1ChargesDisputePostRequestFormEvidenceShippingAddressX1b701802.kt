package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1dispute/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/pro
 * perties/disputed_transaction/properties/shipping_address
 */
@Serializable(with = InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802.Serializer::class)
public class InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802(
  public val city:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1CityXf0ab9506? = null,
  public val country:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryXaa4bec02? = null,
  public val line1:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25? = null,
  public val line2:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f? = null,
  public val postalCode:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidencePostalCodeX3cc8f317? = null,
  public val state:
      InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9? = null,
) {
  public class Builder {
    public var city:
        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1CityXf0ab9506? = null

    public var country:
        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryXaa4bec02? = null

    public var line1: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25? =
        null

    public var line2: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f? =
        null

    public var postalCode:
        InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidencePostalCodeX3cc8f317? = null

    public var state: InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9? =
        null

    public fun build(): InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802 = InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802(
      city = city,
      country = country,
      line1 = line1,
      line2 = line2,
      postalCode = postalCode,
      state = state,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802 must be a JSON object")
      return InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802(
        city = rawObject["city"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceAnyOf1CityXf0ab9506>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceCountryXaa4bec02>(it) },
        line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine1X1c9c8c25>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceLine2Xfc26894f>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidencePostalCodeX3cc8f317>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<InlineV1ChargesDisputePostRequestFormEvidenceEnhancedEvidenceStateX5d8cccc9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.city?.let { put("city", json.encodeToJsonElement(it)) }
        value.country?.let { put("country", json.encodeToJsonElement(it)) }
        value.line1?.let { put("line1", json.encodeToJsonElement(it)) }
        value.line2?.let { put("line2", json.encodeToJsonElement(it)) }
        value.postalCode?.let { put("postal_code", json.encodeToJsonElement(it)) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802(block: InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802.Builder.() -> Unit): InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802 = InlineV1ChargesDisputePostRequestFormEvidenceShippingAddressX1b701802.build(block)
