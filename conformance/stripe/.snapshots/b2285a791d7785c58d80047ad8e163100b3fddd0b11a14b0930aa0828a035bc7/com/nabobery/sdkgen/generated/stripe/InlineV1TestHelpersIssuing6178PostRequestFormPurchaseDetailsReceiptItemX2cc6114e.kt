package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/receipt/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/receipt/items
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e.Serializer::class)
public class InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e(
  public val description: String? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantity: String? = null,
  public val total: Int? = null,
  public val unitCost: Int? = null,
) {
  public class Builder {
    public var description: String? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantity: String? = null

    public var total: Int? = null

    public var unitCost: Int? = null

    public fun build(): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e(
      description = description,
      quantity = quantity,
      total = total,
      unitCost = unitCost,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e must be a JSON object")
      return InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<String>(it) },
        total = rawObject["total"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitCost = rawObject["unit_cost"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", it) }
        value.quantity?.let { put("quantity", it) }
        value.total?.let { put("total", json.encodeToJsonElement(it)) }
        value.unitCost?.let { put("unit_cost", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e(block: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e.Builder.() -> Unit): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e.build(block)
