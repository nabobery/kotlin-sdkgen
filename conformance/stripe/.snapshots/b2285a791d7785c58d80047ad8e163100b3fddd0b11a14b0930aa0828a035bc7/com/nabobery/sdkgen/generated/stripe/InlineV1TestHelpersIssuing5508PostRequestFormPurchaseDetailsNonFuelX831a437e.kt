package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/repor
 * ted_breakdown/properties/non_fuel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/repor
 * ted_breakdown/properties/non_fuel
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e.Serializer::class)
public class InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e(
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val grossAmountDecimal: String? = null,
) {
  public class Builder {
    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var grossAmountDecimal: String? = null

    public fun build(): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e(
      grossAmountDecimal = grossAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e must be a JSON object")
      return InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e(
        grossAmountDecimal = rawObject["gross_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.grossAmountDecimal?.let { put("gross_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e(block: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e.Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e.build(block)
