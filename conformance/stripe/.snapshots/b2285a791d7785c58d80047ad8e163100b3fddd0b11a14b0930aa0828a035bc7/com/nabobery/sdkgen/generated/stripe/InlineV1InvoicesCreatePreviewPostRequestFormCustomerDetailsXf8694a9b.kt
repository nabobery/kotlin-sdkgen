package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
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
 * Details about the customer you want to invoice or overrides for an existing customer. If `automatic_tax` is enabled
 * then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b(
  public val address:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6? = null,
  public val shipping:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9? = null,
  public val tax: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93? = null,
  public val taxExempt:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde? = null,
  taxIds: List<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3>? = null,
) {
  public val taxIds:
      List<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3>? =
      taxIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var address: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6?
        = null

    public var shipping:
        InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9? = null

    public var tax: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93? = null

    public var taxExempt:
        InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde? = null

    private var taxIdsValue:
        List<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3>? = null

    public var taxIds:
        List<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3>?
      get() = taxIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b(
      address = address,
      shipping = shipping,
      tax = tax,
      taxExempt = taxExempt,
      taxIds = taxIds,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b must be a JSON object")
      return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsAddressXe64e5ac6>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsShippingX02e8e1e9>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93>(it) },
        taxExempt = rawObject["tax_exempt"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxExemptXa6f80dde>(it) },
        taxIds = rawObject["tax_ids"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIdsItemXd5e36ad3>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
        value.taxExempt?.let { put("tax_exempt", json.encodeToJsonElement(it)) }
        value.taxIds?.let { put("tax_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b(block: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b.build(block)
