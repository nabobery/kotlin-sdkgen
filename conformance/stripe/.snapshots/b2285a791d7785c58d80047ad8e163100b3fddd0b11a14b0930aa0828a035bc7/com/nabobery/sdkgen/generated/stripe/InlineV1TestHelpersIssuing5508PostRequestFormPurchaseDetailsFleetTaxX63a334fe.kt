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
 * ted_breakdown/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/repor
 * ted_breakdown/properties/tax
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe.Serializer::class)
public class InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe(
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val localAmountDecimal: String? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val nationalAmountDecimal: String? = null,
) {
  public class Builder {
    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var localAmountDecimal: String? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var nationalAmountDecimal: String? = null

    public fun build(): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe(
      localAmountDecimal = localAmountDecimal,
      nationalAmountDecimal = nationalAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe must be a JSON object")
      return InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe(
        localAmountDecimal = rawObject["local_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        nationalAmountDecimal = rawObject["national_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.localAmountDecimal?.let { put("local_amount_decimal", it) }
        value.nationalAmountDecimal?.let { put("national_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe(block: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe.Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe.build(block)
