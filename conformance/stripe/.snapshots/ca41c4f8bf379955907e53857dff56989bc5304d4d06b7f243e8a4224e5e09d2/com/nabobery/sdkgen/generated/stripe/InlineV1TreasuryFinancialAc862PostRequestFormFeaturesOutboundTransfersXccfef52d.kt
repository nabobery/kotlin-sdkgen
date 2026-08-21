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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/outbound_transfers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/outbound_transfers
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d(
  public val ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf8ddf3f8? = null,
  public val usDomesticWire:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX67ca64c3? = null,
) {
  public class Builder {
    public var ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf8ddf3f8? = null

    public var usDomesticWire:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX67ca64c3? = null

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d(
      ach = ach,
      usDomesticWire = usDomesticWire,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d must be a JSON object")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d(
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf8ddf3f8>(it) },
        usDomesticWire = rawObject["us_domestic_wire"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesUsDomesticWireX67ca64c3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
        value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d.build(block)
