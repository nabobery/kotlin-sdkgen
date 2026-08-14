package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/line_items/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3(
  public val adjustableQuantity:
      InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX5f0bbed0? = null,
  dynamicTaxRates: List<String>? = null,
  metadata: Map<String, String>? = null,
  public val price: String? = null,
  public val priceData:
      InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataX9cb4c560? = null,
  public val quantity: Int? = null,
  taxRates: List<String>? = null,
) {
  public val dynamicTaxRates: List<String>? =
      dynamicTaxRates?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public val taxRates: List<String>? = taxRates?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var adjustableQuantity:
        InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX5f0bbed0? = null

    private var dynamicTaxRatesValue: List<String>? = null

    public var dynamicTaxRates: List<String>?
      get() = dynamicTaxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        dynamicTaxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var price: String? = null

    public var priceData: InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataX9cb4c560? =
        null

    public var quantity: Int? = null

    private var taxRatesValue: List<String>? = null

    public var taxRates: List<String>?
      get() = taxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3 = InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3(
      adjustableQuantity = adjustableQuantity,
      dynamicTaxRates = dynamicTaxRates,
      metadata = metadata,
      price = price,
      priceData = priceData,
      quantity = quantity,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3(
        adjustableQuantity = rawObject["adjustable_quantity"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX5f0bbed0>(it) },
        dynamicTaxRates = rawObject["dynamic_tax_rates"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataX9cb4c560>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.adjustableQuantity?.let { put("adjustable_quantity", json.encodeToJsonElement(it)) }
        value.dynamicTaxRates?.let { put("dynamic_tax_rates", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.price?.let { put("price", it) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3(block: InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3 = InlineV1CheckoutSessionsPostRequestFormLineItemsItemX5aad24f3.build(block)
