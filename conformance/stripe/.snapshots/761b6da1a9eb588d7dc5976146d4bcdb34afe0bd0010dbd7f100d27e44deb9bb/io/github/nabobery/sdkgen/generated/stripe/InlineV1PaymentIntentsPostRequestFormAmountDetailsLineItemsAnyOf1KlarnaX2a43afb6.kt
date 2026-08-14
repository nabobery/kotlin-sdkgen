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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options/properties/kl
 * arna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options/properties/kl
 * arna
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6(
  public val imageUrl: String? = null,
  public val productUrl: String? = null,
  public val reference: String? = null,
  public val subscriptionReference: String? = null,
) {
  public class Builder {
    public var imageUrl: String? = null

    public var productUrl: String? = null

    public var reference: String? = null

    public var subscriptionReference: String? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6 = InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6(
      imageUrl = imageUrl,
      productUrl = productUrl,
      reference = reference,
      subscriptionReference = subscriptionReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6(
        imageUrl = rawObject["image_url"]?.let { json.decodeFromJsonElement<String>(it) },
        productUrl = rawObject["product_url"]?.let { json.decodeFromJsonElement<String>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        subscriptionReference = rawObject["subscription_reference"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.imageUrl?.let { put("image_url", it) }
        value.productUrl?.let { put("product_url", it) }
        value.reference?.let { put("reference", it) }
        value.subscriptionReference?.let { put("subscription_reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6(block: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6 = InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1KlarnaX2a43afb6.build(block)
