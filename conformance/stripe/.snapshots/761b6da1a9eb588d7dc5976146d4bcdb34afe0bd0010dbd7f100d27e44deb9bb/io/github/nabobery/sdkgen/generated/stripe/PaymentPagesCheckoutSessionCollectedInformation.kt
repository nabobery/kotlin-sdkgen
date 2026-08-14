package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentPagesCheckoutSessionCollectedInformationView(
  @SerialName("business_name")
  public val businessName: String? = null,
  @SerialName("individual_name")
  public val individualName: String? = null,
  @SerialName("shipping_details")
  public val shippingDetails:
      InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_collected_information
 */
@Serializable(with = PaymentPagesCheckoutSessionCollectedInformation.Serializer::class)
public class PaymentPagesCheckoutSessionCollectedInformation(
  /**
   * Customer’s business name for this Checkout Session
   */
  public val businessName: String? = null,
  /**
   * Customer’s individual name for this Checkout Session
   */
  public val individualName: String? = null,
  /**
   * Shipping information for this Checkout Session.
   */
  public val shippingDetails:
      InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5? = null,
) {
  public class Builder {
    /**
     * Customer’s business name for this Checkout Session
     */
    public var businessName: String? = null

    /**
     * Customer’s individual name for this Checkout Session
     */
    public var individualName: String? = null

    /**
     * Shipping information for this Checkout Session.
     */
    public var shippingDetails:
        InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5? = null

    public fun build(): PaymentPagesCheckoutSessionCollectedInformation = PaymentPagesCheckoutSessionCollectedInformation(
      businessName = businessName,
      individualName = individualName,
      shippingDetails = shippingDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCollectedInformation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionCollectedInformation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCollectedInformation {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCollectedInformation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCollectedInformation must be a JSON object")
      return PaymentPagesCheckoutSessionCollectedInformation(
        businessName = rawObject["business_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        individualName = rawObject["individual_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        shippingDetails = rawObject["shipping_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionCollectedInformationShippingDetailsXd759f8a5?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCollectedInformation) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCollectedInformation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.businessName?.let { put("business_name", it) }
        value.individualName?.let { put("individual_name", it) }
        value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCollectedInformation(block: PaymentPagesCheckoutSessionCollectedInformation.Builder.() -> Unit): PaymentPagesCheckoutSessionCollectedInformation = PaymentPagesCheckoutSessionCollectedInformation.build(block)
