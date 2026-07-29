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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff.Serializer::class)
public class InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff(
  expand: List<String>? = null,
  /**
   * ID of an existing PaymentMethod.
   */
  public val paymentMethod: String? = null,
  /**
   * If provided, this hash will be used to create a PaymentMethod.
   */
  public val paymentMethodData:
      InlineV1TestHelpersConfirmationTokensPostRequestFormPaymentMethodDataX9823133d? = null,
  /**
   * Payment-method-specific configuration for this ConfirmationToken.
   */
  public val paymentMethodOptions:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396? = null,
  /**
   * Return URL used to confirm the Intent.
   */
  public val returnUrl: String? = null,
  /**
   * Indicates that you intend to make future payments with this ConfirmationToken's payment method.
   *
   * The presence of this property will [attach the payment
   * method](https://docs.stripe.com/payments/save-during-payment) to the PaymentIntent's Customer, if present, after
   * the PaymentIntent is confirmed and any required actions from the user are complete.
   */
  public val setupFutureUsage:
      InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d? = null,
  /**
   * Shipping information for this ConfirmationToken.
   */
  public val shipping:
      InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
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
     * ID of an existing PaymentMethod.
     */
    public var paymentMethod: String? = null

    /**
     * If provided, this hash will be used to create a PaymentMethod.
     */
    public var paymentMethodData:
        InlineV1TestHelpersConfirmationTokensPostRequestFormPaymentMethodDataX9823133d? = null

    /**
     * Payment-method-specific configuration for this ConfirmationToken.
     */
    public var paymentMethodOptions:
        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396? = null

    /**
     * Return URL used to confirm the Intent.
     */
    public var returnUrl: String? = null

    /**
     * Indicates that you intend to make future payments with this ConfirmationToken's payment method.
     *
     * The presence of this property will [attach the payment
     * method](https://docs.stripe.com/payments/save-during-payment) to the PaymentIntent's Customer, if present, after
     * the PaymentIntent is confirmed and any required actions from the user are complete.
     */
    public var setupFutureUsage:
        InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d? = null

    /**
     * Shipping information for this ConfirmationToken.
     */
    public var shipping: InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20? =
        null

    public fun build(): InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff = InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff(
      expand = expand,
      paymentMethod = paymentMethod,
      paymentMethodData = paymentMethodData,
      paymentMethodOptions = paymentMethodOptions,
      returnUrl = returnUrl,
      setupFutureUsage = setupFutureUsage,
      shipping = shipping,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff must be a JSON object")
      return InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodData = rawObject["payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmationTokensPostRequestFormPaymentMethodDataX9823133d>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmationTokensPostRequestFormSetupFutureUsageX081fa35d>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paymentMethodData?.let { put("payment_method_data", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff(block: InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff.Builder.() -> Unit): InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff = InlineV1TestHelpersConfirmationTokensPostRequestFormXdfb366ff.build(block)
