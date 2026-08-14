package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/shipping_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1disputes~1{dispute}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/evidence/properties/enhanced_evidence/anyOf/0/properties/visa_compelling_evidence_3/properties
 * /disputed_transaction/properties/shipping_address
 */
@Serializable(with = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa.Serializer::class)
public class InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa(
  public val city:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1CityX9064bf12? = null,
  public val country:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1CountryX8f3c4af9? = null,
  public val line1:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46? = null,
  public val line2:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X73e1a9ad? = null,
  public val postalCode:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1PostalCodeXf19dcee3? = null,
  public val state:
      InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX690e4728? = null,
) {
  public class Builder {
    public var city: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1CityX9064bf12? =
        null

    public var country:
        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1CountryX8f3c4af9? = null

    public var line1: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46? =
        null

    public var line2: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X73e1a9ad? =
        null

    public var postalCode:
        InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1PostalCodeXf19dcee3? = null

    public var state: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX690e4728? =
        null

    public fun build(): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa(
      city = city,
      country = country,
      line1 = line1,
      line2 = line2,
      postalCode = postalCode,
      state = state,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa must be a JSON object")
      return InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa(
        city = rawObject["city"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1CityX9064bf12>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1CountryX8f3c4af9>(it) },
        line1 = rawObject["line1"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line1X42130c46>(it) },
        line2 = rawObject["line2"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1Line2X73e1a9ad>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1PostalCodeXf19dcee3>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceAnyOf1StateX690e4728>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa")
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

public fun inlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa(block: InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa.Builder.() -> Unit): InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa = InlineV1DisputesPostRequestFormEvidenceEnhancedEvidenceShippingAddressX9b6619aa.build(block)
