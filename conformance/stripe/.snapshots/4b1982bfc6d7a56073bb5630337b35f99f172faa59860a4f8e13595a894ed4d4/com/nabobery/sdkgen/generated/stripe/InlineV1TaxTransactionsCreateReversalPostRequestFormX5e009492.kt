package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1transactions~1create_reversal/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1transactions~1create_reversal/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492.Serializer::class)
public class InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492(
  /**
   * If `partial`, the provided line item or shipping cost amounts are reversed. If `full`, the original transaction is
   * fully reversed.
   */
  public val mode: InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce,
  /**
   * The ID of the Transaction to partially or fully reverse.
   */
  public val originalTransaction: String,
  /**
   * A custom identifier for this reversal, such as `myOrder_123-refund_1`, which must be unique across all
   * transactions. The reference helps identify this reversal transaction in exported [tax
   * reports](https://docs.stripe.com/tax/reports).
   */
  public val reference: String,
  expand: List<String>? = null,
  /**
   * A flat amount to reverse across the entire transaction, in the [smallest currency
   * unit](https://docs.stripe.com/currencies#minor-units) in negative. This value represents the total amount to refund
   * from the transaction, including taxes.
   */
  public val flatAmount: Int? = null,
  lineItems: List<InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb>? = null,
  metadata: Map<String, String>? = null,
  /**
   * The shipping cost to reverse.
   */
  public val shippingCost:
      InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * The line item amounts to reverse.
   */
  public val lineItems:
      List<InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb>? =
      lineItems?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var modeValue: InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce? = null

    public var mode: InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce
      get() = requireNotNull(modeValue) { "mode is required" }
      set(`value`) {
        modeValue = value
      }

    private var originalTransactionValue: String? = null

    public var originalTransaction: String
      get() = requireNotNull(originalTransactionValue) { "originalTransaction is required" }
      set(`value`) {
        originalTransactionValue = value
      }

    private var referenceValue: String? = null

    public var reference: String
      get() = requireNotNull(referenceValue) { "reference is required" }
      set(`value`) {
        referenceValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A flat amount to reverse across the entire transaction, in the [smallest currency
     * unit](https://docs.stripe.com/currencies#minor-units) in negative. This value represents the total amount to
     * refund from the transaction, including taxes.
     */
    public var flatAmount: Int? = null

    private var lineItemsValue:
        List<InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb>? = null

    /**
     * The line item amounts to reverse.
     */
    public var lineItems:
        List<InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb>?
      get() = lineItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        lineItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The shipping cost to reverse.
     */
    public var shippingCost:
        InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f? = null

    public fun build(): InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492 {
      check(modeValue != null) { "mode is required" }
      check(originalTransactionValue != null) { "originalTransaction is required" }
      check(referenceValue != null) { "reference is required" }
      return InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492(
        mode = mode,
        originalTransaction = originalTransaction,
        reference = reference,
        expand = expand,
        flatAmount = flatAmount,
        lineItems = lineItems,
        metadata = metadata,
        shippingCost = shippingCost,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492 must be a JSON object")
      val mode = json.decodeRequired<InlineV1TaxTransactionsCreateReversalPostRequestFormModeX191d5fce>(rawObject, "mode")
      val originalTransaction = json.decodeRequired<String>(rawObject, "original_transaction")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      return InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492(
        mode = mode,
        originalTransaction = originalTransaction,
        reference = reference,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        flatAmount = rawObject["flat_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<List<InlineV1TaxTransactionsCreateReversalPostRequestFormLineItemsItemX750499bb>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        shippingCost = rawObject["shipping_cost"]?.let { json.decodeFromJsonElement<InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("mode", json.encodeToJsonElement(value.mode))
        put("original_transaction", value.originalTransaction)
        put("reference", value.reference)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.flatAmount?.let { put("flat_amount", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.shippingCost?.let { put("shipping_cost", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492(block: InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492.Builder.() -> Unit): InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492 = InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
