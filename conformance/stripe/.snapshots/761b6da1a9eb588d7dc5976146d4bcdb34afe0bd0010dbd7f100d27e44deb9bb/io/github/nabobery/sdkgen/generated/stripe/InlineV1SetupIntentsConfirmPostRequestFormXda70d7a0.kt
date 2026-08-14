package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0(
  /**
   * The client secret of the SetupIntent.
   */
  public val clientSecret: String? = null,
  /**
   * ID of the ConfirmationToken used to confirm this SetupIntent.
   *
   * If the provided ConfirmationToken contains properties that are also being provided in this request, such as
   * `payment_method`, then the values in this request will take precedence.
   */
  public val confirmationToken: String? = null,
  expand: List<String>? = null,
  public val mandateData: InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597? = null,
  /**
   * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this SetupIntent.
   */
  public val paymentMethod: String? = null,
  /**
   * When included, this hash creates a PaymentMethod that is set as the
   * [`payment_method`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-payment_method)
   * value in the SetupIntent.
   */
  public val paymentMethodData:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataX5f0fda72? = null,
  /**
   * Payment method-specific configuration for this SetupIntent.
   */
  public val paymentMethodOptions:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292? = null,
  /**
   * The URL to redirect your customer back to after they authenticate on the payment method's app or site.
   * If you'd prefer to redirect to a mobile application, you can alternatively supply an application URI scheme.
   * This parameter is only used for cards and other redirect-based payment methods.
   */
  public val returnUrl: String? = null,
  /**
   * Set to `true` when confirming server-side and using Stripe.js, iOS, or Android client-side SDKs to handle the next
   * actions.
   */
  public val useStripeSdk: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The client secret of the SetupIntent.
     */
    public var clientSecret: String? = null

    /**
     * ID of the ConfirmationToken used to confirm this SetupIntent.
     *
     * If the provided ConfirmationToken contains properties that are also being provided in this request, such as
     * `payment_method`, then the values in this request will take precedence.
     */
    public var confirmationToken: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public var mandateData: InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597? = null

    /**
     * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this SetupIntent.
     */
    public var paymentMethod: String? = null

    /**
     * When included, this hash creates a PaymentMethod that is set as the
     * [`payment_method`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-payment_method)
     * value in the SetupIntent.
     */
    public var paymentMethodData:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataX5f0fda72? = null

    /**
     * Payment method-specific configuration for this SetupIntent.
     */
    public var paymentMethodOptions:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292? = null

    /**
     * The URL to redirect your customer back to after they authenticate on the payment method's app or site.
     * If you'd prefer to redirect to a mobile application, you can alternatively supply an application URI scheme.
     * This parameter is only used for cards and other redirect-based payment methods.
     */
    public var returnUrl: String? = null

    /**
     * Set to `true` when confirming server-side and using Stripe.js, iOS, or Android client-side SDKs to handle the
     * next actions.
     */
    public var useStripeSdk: Boolean? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0 = InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0(
      clientSecret = clientSecret,
      confirmationToken = confirmationToken,
      expand = expand,
      mandateData = mandateData,
      paymentMethod = paymentMethod,
      paymentMethodData = paymentMethodData,
      paymentMethodOptions = paymentMethodOptions,
      returnUrl = returnUrl,
      useStripeSdk = useStripeSdk,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0(
        clientSecret = rawObject["client_secret"]?.let { json.decodeFromJsonElement<String>(it) },
        confirmationToken = rawObject["confirmation_token"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        mandateData = rawObject["mandate_data"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodData = rawObject["payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataX5f0fda72>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
        useStripeSdk = rawObject["use_stripe_sdk"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.clientSecret?.let { put("client_secret", it) }
        value.confirmationToken?.let { put("confirmation_token", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.mandateData?.let { put("mandate_data", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paymentMethodData?.let { put("payment_method_data", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
        value.useStripeSdk?.let { put("use_stripe_sdk", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormXda70d7a0(block: InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0 = InlineV1SetupIntentsConfirmPostRequestFormXda70d7a0.build(block)
