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
 * application~1x-www-form-urlencoded/schema/properties/features/properties/financial_addresses.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/features/properties/financial_addresses
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb(
  public val aba: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAbaX03a00c3d? = null,
) {
  public class Builder {
    public var aba: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAbaX03a00c3d? = null

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb(
      aba = aba,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb must be a JSON object")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb(
        aba = rawObject["aba"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAbaX03a00c3d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.aba?.let { put("aba", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb.build(block)
