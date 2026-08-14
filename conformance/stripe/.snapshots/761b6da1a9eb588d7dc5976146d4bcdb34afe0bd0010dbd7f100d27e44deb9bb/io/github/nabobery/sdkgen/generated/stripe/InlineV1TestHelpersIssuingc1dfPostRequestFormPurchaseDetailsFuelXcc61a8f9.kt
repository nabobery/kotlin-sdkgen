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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9.Serializer::class)
public class InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9(
  public val industryProductCode: String? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  public val type:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4? = null,
  public val unit:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelUnitXb05f9aa7? = null,
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

    public var type: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4?
        = null

    public var unit: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelUnitXb05f9aa7?
        = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitCostDecimal: String? = null

    public fun build(): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9 = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9(
      industryProductCode = industryProductCode,
      quantityDecimal = quantityDecimal,
      type = type,
      unit = unit,
      unitCostDecimal = unitCostDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9 must be a JSON object")
      return InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9(
        industryProductCode = rawObject["industry_product_code"]?.let { json.decodeFromJsonElement<String>(it) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4>(it) },
        unit = rawObject["unit"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelUnitXb05f9aa7>(it) },
        unitCostDecimal = rawObject["unit_cost_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9")
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

public fun inlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9(block: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9.Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9 = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9.build(block)
