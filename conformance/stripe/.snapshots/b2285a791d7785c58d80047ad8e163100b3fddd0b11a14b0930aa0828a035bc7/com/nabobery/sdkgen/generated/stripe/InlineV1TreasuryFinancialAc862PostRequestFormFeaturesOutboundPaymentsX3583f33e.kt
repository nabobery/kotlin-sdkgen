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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/features/properties/outbound_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/features/properties/outbound_payments
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e(
  public val ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXecbeab69? = null,
  public val usDomesticWire:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX70828828? = null,
) {
  public class Builder {
    public var ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXecbeab69? = null

    public var usDomesticWire:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX70828828? = null

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e(
      ach = ach,
      usDomesticWire = usDomesticWire,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e must be a JSON object")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e(
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXecbeab69>(it) },
        usDomesticWire = rawObject["us_domestic_wire"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX70828828>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
        value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e.build(block)
