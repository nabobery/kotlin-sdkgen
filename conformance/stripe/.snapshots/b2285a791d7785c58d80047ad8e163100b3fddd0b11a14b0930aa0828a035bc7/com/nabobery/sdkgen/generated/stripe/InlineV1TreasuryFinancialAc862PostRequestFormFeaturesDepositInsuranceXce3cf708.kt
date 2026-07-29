package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/deposit_insurance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/deposit_insurance
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708(
  public val requested: Boolean,
) {
  public class Builder {
    private var requestedValue: Boolean? = null

    public var requested: Boolean
      get() = requireNotNull(requestedValue) { "requested is required" }
      set(`value`) {
        requestedValue = value
      }

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708 {
      check(requestedValue != null) { "requested is required" }
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708(
        requested = requested,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708 must be a JSON object")
      val requested = json.decodeRequired<Boolean>(rawObject, "requested")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708(
        requested = requested,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("requested", json.encodeToJsonElement(value.requested))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708 = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
