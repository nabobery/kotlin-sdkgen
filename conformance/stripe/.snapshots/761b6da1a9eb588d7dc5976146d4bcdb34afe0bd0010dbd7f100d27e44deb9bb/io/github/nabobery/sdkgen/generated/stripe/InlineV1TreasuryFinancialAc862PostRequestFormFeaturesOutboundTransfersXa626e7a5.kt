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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/features/properties/outbound_transfers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/features/properties/outbound_transfers
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5(
  public val ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchX83ecfdf2? = null,
  public val usDomesticWire:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX1a0cbd81? = null,
) {
  public class Builder {
    public var ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchX83ecfdf2? = null

    public var usDomesticWire:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX1a0cbd81? = null

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5 = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5(
      ach = ach,
      usDomesticWire = usDomesticWire,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5 must be a JSON object")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5(
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchX83ecfdf2>(it) },
        usDomesticWire = rawObject["us_domestic_wire"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX1a0cbd81>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
        value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5 = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5.build(block)
