package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormXb2b09faa.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormXb2b09faa(
  /**
   * Information about the customer collected within the Checkout Session. Can only be set when updating `embedded` or
   * `custom` sessions.
   */
  public val collectedInformation:
      InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c? = null,
  expand: List<String>? = null,
  lineItems: List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f? = null,
  /**
   * The shipping rate options to apply to this Session. Up to a maximum of 5.
   */
  public val shippingOptions:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * A list of items the customer is purchasing.
   *
   * When updating line items, you must retransmit the entire array of line items.
   *
   * To retain an existing line item, specify its `id`.
   *
   * To update an existing line item, specify its `id` along with the new values of the fields to update.
   *
   * To add a new line item, specify one of `price` or `price_data` and `quantity`.
   *
   * To remove an existing line item, omit the line item's ID from the retransmitted array.
   *
   * To reorder a line item, specify it at the desired position in the retransmitted array.
   */
  public val lineItems: List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6>? =
      lineItems?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Information about the customer collected within the Checkout Session. Can only be set when updating `embedded` or
     * `custom` sessions.
     */
    public var collectedInformation:
        InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var lineItemsValue: List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6>?
        = null

    /**
     * A list of items the customer is purchasing.
     *
     * When updating line items, you must retransmit the entire array of line items.
     *
     * To retain an existing line item, specify its `id`.
     *
     * To update an existing line item, specify its `id` along with the new values of the fields to update.
     *
     * To add a new line item, specify one of `price` or `price_data` and `quantity`.
     *
     * To remove an existing line item, omit the line item's ID from the retransmitted array.
     *
     * To reorder a line item, specify it at the desired position in the retransmitted array.
     */
    public var lineItems: List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6>?
      get() = lineItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        lineItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f? = null

    /**
     * The shipping rate options to apply to this Session. Up to a maximum of 5.
     */
    public var shippingOptions: InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormXb2b09faa = InlineV1CheckoutSessionsPostRequestFormXb2b09faa(
      collectedInformation = collectedInformation,
      expand = expand,
      lineItems = lineItems,
      metadata = metadata,
      shippingOptions = shippingOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormXb2b09faa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormXb2b09faa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormXb2b09faa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormXb2b09faa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormXb2b09faa must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormXb2b09faa(
        collectedInformation = rawObject["collected_information"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        lineItems = rawObject["line_items"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f>(it) },
        shippingOptions = rawObject["shipping_options"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormXb2b09faa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormXb2b09faa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.collectedInformation?.let { put("collected_information", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.shippingOptions?.let { put("shipping_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormXb2b09faa(block: InlineV1CheckoutSessionsPostRequestFormXb2b09faa.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormXb2b09faa = InlineV1CheckoutSessionsPostRequestFormXb2b09faa.build(block)
