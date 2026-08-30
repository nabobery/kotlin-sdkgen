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
 * rm-urlencoded/schema/properties/features/properties/inbound_transfers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/inbound_transfers
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd(
  public val ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXff39d1aa? = null,
) {
  public class Builder {
    public var ach: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXff39d1aa? = null

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd(
      ach = ach,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd must be a JSON object")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd(
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXff39d1aa>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd.build(block)
