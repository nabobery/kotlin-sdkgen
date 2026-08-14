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
 * rm-urlencoded/schema/properties/features/properties/financial_addresses.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/financial_addresses
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962(
  public val aba: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAbaX20382a3e? = null,
) {
  public class Builder {
    public var aba: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAbaX20382a3e? = null

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962 = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962(
      aba = aba,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962 must be a JSON object")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962(
        aba = rawObject["aba"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAbaX20382a3e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.aba?.let { put("aba", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962 = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962.build(block)
