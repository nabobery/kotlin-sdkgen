package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4.Serializer::class)
public class InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4(
  public val industryProductCode: String? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  public val type:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelTypeX439d7949? = null,
  public val unit:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelUnitX54079258? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitCostDecimal: String? = null,
) {
  public class Builder {
    public var industryProductCode: String? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantityDecimal: String? = null

    public var type: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelTypeX439d7949?
        = null

    public var unit: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelUnitX54079258?
        = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitCostDecimal: String? = null

    public fun build(): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4 = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4(
      industryProductCode = industryProductCode,
      quantityDecimal = quantityDecimal,
      type = type,
      unit = unit,
      unitCostDecimal = unitCostDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4 must be a JSON object")
      return InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4(
        industryProductCode = rawObject["industry_product_code"]?.let { json.decodeFromJsonElement<String>(it) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelTypeX439d7949>(it) },
        unit = rawObject["unit"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelUnitX54079258>(it) },
        unitCostDecimal = rawObject["unit_cost_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.industryProductCode?.let { put("industry_product_code", it) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.unit?.let { put("unit", json.encodeToJsonElement(it)) }
        value.unitCostDecimal?.let { put("unit_cost_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4(block: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4.Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4 = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4.build(block)
