package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormXd17dbd70.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormXd17dbd70(
  /**
   * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
   * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
   * payment method in a checkout flow. The field defaults to `unspecified`.
   */
  public val allowRedisplay: InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf? = null,
  /**
   * Billing information associated with the PaymentMethod that may be used or required by particular types of payment
   * methods.
   */
  public val billingDetails: InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d? = null,
  /**
   * If this is a `card` PaymentMethod, this hash contains the user's card details.
   */
  public val card: InlineV1PaymentMethodsPostRequestFormCardX090df98d? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae? = null,
  /**
   * If this is a `payto` PaymentMethod, this hash contains details about the PayTo payment method.
   */
  public val payto: InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b? = null,
  /**
   * If this is an `us_bank_account` PaymentMethod, this hash contains details about the US bank account payment method.
   */
  public val usBankAccount: InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
     * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a
     * saved payment method in a checkout flow. The field defaults to `unspecified`.
     */
    public var allowRedisplay: InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf? = null

    /**
     * Billing information associated with the PaymentMethod that may be used or required by particular types of payment
     * methods.
     */
    public var billingDetails: InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d? = null

    /**
     * If this is a `card` PaymentMethod, this hash contains the user's card details.
     */
    public var card: InlineV1PaymentMethodsPostRequestFormCardX090df98d? = null

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
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae? = null

    /**
     * If this is a `payto` PaymentMethod, this hash contains details about the PayTo payment method.
     */
    public var payto: InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b? = null

    /**
     * If this is an `us_bank_account` PaymentMethod, this hash contains details about the US bank account payment
     * method.
     */
    public var usBankAccount: InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormXd17dbd70 = InlineV1PaymentMethodsPostRequestFormXd17dbd70(
      allowRedisplay = allowRedisplay,
      billingDetails = billingDetails,
      card = card,
      expand = expand,
      metadata = metadata,
      payto = payto,
      usBankAccount = usBankAccount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormXd17dbd70 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormXd17dbd70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormXd17dbd70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormXd17dbd70")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormXd17dbd70 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormXd17dbd70(
        allowRedisplay = rawObject["allow_redisplay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormAllowRedisplayX8bf925cf>(it) },
        billingDetails = rawObject["billing_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsXc7835d4d>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCardX090df98d>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormPaytoX0e33255b>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormXd17dbd70) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormXd17dbd70")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowRedisplay?.let { put("allow_redisplay", json.encodeToJsonElement(it)) }
        value.billingDetails?.let { put("billing_details", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormXd17dbd70(block: InlineV1PaymentMethodsPostRequestFormXd17dbd70.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormXd17dbd70 = InlineV1PaymentMethodsPostRequestFormXd17dbd70.build(block)
