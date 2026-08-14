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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/outbound_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/outbound_payments
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8(
  public val ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e? = null,
  public val usDomesticWire:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX38db6b72? = null,
) {
  public class Builder {
    public var ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e? = null

    public var usDomesticWire:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX38db6b72? = null

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8 = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8(
      ach = ach,
      usDomesticWire = usDomesticWire,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8 must be a JSON object")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8(
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e>(it) },
        usDomesticWire = rawObject["us_domestic_wire"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX38db6b72>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
        value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8 = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8.build(block)
