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
import kotlinx.serialization.json.put

@Serializable
public data class IssuingCardShippingCustomsView(
  @SerialName("eori_number")
  public val eoriNumber: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping_customs
 */
@Serializable(with = IssuingCardShippingCustoms.Serializer::class)
public class IssuingCardShippingCustoms(
  /**
   * A registration number used for customs in Europe. See [https://www.gov.uk/eori](https://www.gov.uk/eori) for the UK
   * and
   * [https://ec.europa.eu/taxation_customs/business/customs-procedures-import-and-export/customs-procedures/economic-op
   * erators-registration-and-identification-number-eori_en](https://ec.europa.eu/taxation_customs/business/customs-proc
   * edures-import-and-export/customs-procedures/economic-operators-registration-and-identification-number-eori_en) for
   * the EU.
   */
  public val eoriNumber: String? = null,
) {
  public class Builder {
    /**
     * A registration number used for customs in Europe. See [https://www.gov.uk/eori](https://www.gov.uk/eori) for the
     * UK and
     * [https://ec.europa.eu/taxation_customs/business/customs-procedures-import-and-export/customs-procedures/economic-
     * operators-registration-and-identification-number-eori_en](https://ec.europa.eu/taxation_customs/business/customs-
     * procedures-import-and-export/customs-procedures/economic-operators-registration-and-identification-number-eori_en
     * ) for the EU.
     */
    public var eoriNumber: String? = null

    public fun build(): IssuingCardShippingCustoms = IssuingCardShippingCustoms(
      eoriNumber = eoriNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardShippingCustoms = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardShippingCustoms> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardShippingCustoms {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardShippingCustoms")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardShippingCustoms must be a JSON object")
      return IssuingCardShippingCustoms(
        eoriNumber = rawObject["eori_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardShippingCustoms) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardShippingCustoms")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.eoriNumber?.let { put("eori_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardShippingCustoms(block: IssuingCardShippingCustoms.Builder.() -> Unit): IssuingCardShippingCustoms = IssuingCardShippingCustoms.build(block)
