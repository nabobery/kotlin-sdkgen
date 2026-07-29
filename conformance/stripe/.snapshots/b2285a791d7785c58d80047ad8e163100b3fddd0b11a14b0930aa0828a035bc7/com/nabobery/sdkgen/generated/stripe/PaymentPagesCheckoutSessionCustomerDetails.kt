package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@ConsistentCopyVisibility
@Serializable
public data class PaymentPagesCheckoutSessionCustomerDetailsView internal constructor(
  public val address: InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771? = null,
  @SerialName("business_name")
  public val businessName: String? = null,
  public val email: String? = null,
  @SerialName("individual_name")
  public val individualName: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
  @SerialName("tax_exempt")
  public val taxExempt: InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5? = null,
  @SerialName("tax_ids")
  public val taxIds: List<PaymentPagesCheckoutSessionTaxId>? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_customer_details
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomerDetails.Serializer::class)
public class PaymentPagesCheckoutSessionCustomerDetails(
  /**
   * The customer's address after a completed Checkout Session. Note: This property is populated only for sessions on or
   * after March 30, 2022.
   */
  public val address: InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771? = null,
  /**
   * The customer's business name after a completed Checkout Session.
   */
  public val businessName: String? = null,
  /**
   * The email associated with the Customer, if one exists, on the Checkout Session after a completed Checkout Session
   * or at time of session expiry.
   * Otherwise, if the customer has consented to promotional content, this value is the most recent valid email provided
   * by the customer on the Checkout form.
   */
  public val email: String? = null,
  /**
   * The customer's individual name after a completed Checkout Session.
   */
  public val individualName: String? = null,
  /**
   * The customer's name after a completed Checkout Session. Note: This property is populated only for sessions on or
   * after March 30, 2022.
   */
  public val name: String? = null,
  /**
   * The customer's phone number after a completed Checkout Session.
   */
  public val phone: String? = null,
  /**
   * The customer’s tax exempt status after a completed Checkout Session.
   */
  public val taxExempt: InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5? = null,
  taxIds: List<PaymentPagesCheckoutSessionTaxId>? = null,
) {
  /**
   * The customer’s tax IDs after a completed Checkout Session.
   */
  public val taxIds: List<PaymentPagesCheckoutSessionTaxId>? =
      taxIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The customer's address after a completed Checkout Session. Note: This property is populated only for sessions on
     * or after March 30, 2022.
     */
    public var address: InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771? = null

    /**
     * The customer's business name after a completed Checkout Session.
     */
    public var businessName: String? = null

    /**
     * The email associated with the Customer, if one exists, on the Checkout Session after a completed Checkout Session
     * or at time of session expiry.
     * Otherwise, if the customer has consented to promotional content, this value is the most recent valid email
     * provided by the customer on the Checkout form.
     */
    public var email: String? = null

    /**
     * The customer's individual name after a completed Checkout Session.
     */
    public var individualName: String? = null

    /**
     * The customer's name after a completed Checkout Session. Note: This property is populated only for sessions on or
     * after March 30, 2022.
     */
    public var name: String? = null

    /**
     * The customer's phone number after a completed Checkout Session.
     */
    public var phone: String? = null

    /**
     * The customer’s tax exempt status after a completed Checkout Session.
     */
    public var taxExempt: InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5? = null

    private var taxIdsValue: List<PaymentPagesCheckoutSessionTaxId>? = null

    /**
     * The customer’s tax IDs after a completed Checkout Session.
     */
    public var taxIds: List<PaymentPagesCheckoutSessionTaxId>?
      get() = taxIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        taxIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): PaymentPagesCheckoutSessionCustomerDetails = PaymentPagesCheckoutSessionCustomerDetails(
      address = address,
      businessName = businessName,
      email = email,
      individualName = individualName,
      name = name,
      phone = phone,
      taxExempt = taxExempt,
      taxIds = taxIds,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomerDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomerDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomerDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomerDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCustomerDetails must be a JSON object")
      return PaymentPagesCheckoutSessionCustomerDetails(
        address = rawObject["address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771?>(element) },
        businessName = rawObject["business_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        individualName = rawObject["individual_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        taxExempt = rawObject["tax_exempt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5?>(element) },
        taxIds = rawObject["tax_ids"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PaymentPagesCheckoutSessionTaxId>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCustomerDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomerDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.businessName?.let { put("business_name", it) }
        value.email?.let { put("email", it) }
        value.individualName?.let { put("individual_name", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
        value.taxExempt?.let { put("tax_exempt", json.encodeToJsonElement(it)) }
        value.taxIds?.let { put("tax_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCustomerDetails(block: PaymentPagesCheckoutSessionCustomerDetails.Builder.() -> Unit): PaymentPagesCheckoutSessionCustomerDetails = PaymentPagesCheckoutSessionCustomerDetails.build(block)
