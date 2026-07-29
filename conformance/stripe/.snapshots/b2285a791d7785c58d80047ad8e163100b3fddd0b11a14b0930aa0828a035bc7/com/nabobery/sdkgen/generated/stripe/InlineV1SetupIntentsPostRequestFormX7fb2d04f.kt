package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormX7fb2d04f.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormX7fb2d04f(
  /**
   * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers.
   * It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a
   * PaymentMethod to a Customer.
   */
  public val attachToSelf: Boolean? = null,
  /**
   * ID of the Customer this SetupIntent belongs to, if one exists.
   *
   * If present, the SetupIntent's payment method will be attached to the Customer on successful setup. Payment methods
   * attached to other Customers cannot be used with this SetupIntent.
   */
  public val customer: String? = null,
  /**
   * ID of the Account this SetupIntent belongs to, if one exists.
   *
   * If present, the SetupIntent's payment method will be attached to the Account on successful setup. Payment methods
   * attached to other Accounts cannot be used with this SetupIntent.
   */
  public val customerAccount: String? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * The list of payment method types to exclude from use with this SetupIntent.
   */
  public val excludedPaymentMethodTypes:
      InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3? = null,
  expand: List<String>? = null,
  flowDirections: List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54? = null,
  /**
   * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this SetupIntent. To unset
   * this field to null, pass in an empty string.
   */
  public val paymentMethod: String? = null,
  /**
   * The ID of the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) to use with
   * this SetupIntent.
   */
  public val paymentMethodConfiguration: String? = null,
  /**
   * When included, this hash creates a PaymentMethod that is set as the
   * [`payment_method`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-payment_method)
   * value in the SetupIntent.
   */
  public val paymentMethodData:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataX88650dc4? = null,
  /**
   * Payment method-specific configuration for this SetupIntent.
   */
  public val paymentMethodOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09? = null,
  paymentMethodTypes: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Indicates the directions of money movement for which this payment method is intended to be used.
   *
   * Include `inbound` if you intend to use the payment method as the origin to pull funds from. Include `outbound` if
   * you intend to use the payment method as the destination to send funds to. You can include both if you intend to use
   * the payment method for both purposes.
   */
  public val flowDirections: List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c>? =
      flowDirections?.let { collection0 -> collection0.toList() }

  /**
   * The list of payment method types (for example, card) that this SetupIntent can set up. If you don't provide this,
   * Stripe will dynamically show relevant payment methods from your [payment method
   * settings](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be found
   * [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
   */
  public val paymentMethodTypes: List<String>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
     *
     * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and
     * OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false
     * when attaching a PaymentMethod to a Customer.
     */
    public var attachToSelf: Boolean? = null

    /**
     * ID of the Customer this SetupIntent belongs to, if one exists.
     *
     * If present, the SetupIntent's payment method will be attached to the Customer on successful setup. Payment
     * methods attached to other Customers cannot be used with this SetupIntent.
     */
    public var customer: String? = null

    /**
     * ID of the Account this SetupIntent belongs to, if one exists.
     *
     * If present, the SetupIntent's payment method will be attached to the Account on successful setup. Payment methods
     * attached to other Accounts cannot be used with this SetupIntent.
     */
    public var customerAccount: String? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * The list of payment method types to exclude from use with this SetupIntent.
     */
    public var excludedPaymentMethodTypes:
        InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var flowDirectionsValue:
        List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c>? = null

    /**
     * Indicates the directions of money movement for which this payment method is intended to be used.
     *
     * Include `inbound` if you intend to use the payment method as the origin to pull funds from. Include `outbound` if
     * you intend to use the payment method as the destination to send funds to. You can include both if you intend to
     * use the payment method for both purposes.
     */
    public var flowDirections: List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c>?
      get() = flowDirectionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        flowDirectionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54? = null

    /**
     * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this SetupIntent. To unset
     * this field to null, pass in an empty string.
     */
    public var paymentMethod: String? = null

    /**
     * The ID of the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) to use
     * with this SetupIntent.
     */
    public var paymentMethodConfiguration: String? = null

    /**
     * When included, this hash creates a PaymentMethod that is set as the
     * [`payment_method`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-payment_method)
     * value in the SetupIntent.
     */
    public var paymentMethodData: InlineV1SetupIntentsPostRequestFormPaymentMethodDataX88650dc4? =
        null

    /**
     * Payment method-specific configuration for this SetupIntent.
     */
    public var paymentMethodOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09? = null

    private var paymentMethodTypesValue: List<String>? = null

    /**
     * The list of payment method types (for example, card) that this SetupIntent can set up. If you don't provide this,
     * Stripe will dynamically show relevant payment methods from your [payment method
     * settings](https://dashboard.stripe.com/settings/payment_methods). A list of valid payment method types can be
     * found [here](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type).
     */
    public var paymentMethodTypes: List<String>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1SetupIntentsPostRequestFormX7fb2d04f = InlineV1SetupIntentsPostRequestFormX7fb2d04f(
      attachToSelf = attachToSelf,
      customer = customer,
      customerAccount = customerAccount,
      description = description,
      excludedPaymentMethodTypes = excludedPaymentMethodTypes,
      expand = expand,
      flowDirections = flowDirections,
      metadata = metadata,
      paymentMethod = paymentMethod,
      paymentMethodConfiguration = paymentMethodConfiguration,
      paymentMethodData = paymentMethodData,
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormX7fb2d04f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormX7fb2d04f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormX7fb2d04f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormX7fb2d04f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormX7fb2d04f must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormX7fb2d04f(
        attachToSelf = rawObject["attach_to_self"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        excludedPaymentMethodTypes = rawObject["excluded_payment_method_types"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        flowDirections = rawObject["flow_directions"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormFlowDirectionsItemXff66ef5c>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodConfiguration = rawObject["payment_method_configuration"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodData = rawObject["payment_method_data"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataX88650dc4>(it) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsXef95eb09>(it) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormX7fb2d04f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormX7fb2d04f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.attachToSelf?.let { put("attach_to_self", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.description?.let { put("description", it) }
        value.excludedPaymentMethodTypes?.let { put("excluded_payment_method_types", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.flowDirections?.let { put("flow_directions", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paymentMethodConfiguration?.let { put("payment_method_configuration", it) }
        value.paymentMethodData?.let { put("payment_method_data", json.encodeToJsonElement(it)) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormX7fb2d04f(block: InlineV1SetupIntentsPostRequestFormX7fb2d04f.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormX7fb2d04f = InlineV1SetupIntentsPostRequestFormX7fb2d04f.build(block)
