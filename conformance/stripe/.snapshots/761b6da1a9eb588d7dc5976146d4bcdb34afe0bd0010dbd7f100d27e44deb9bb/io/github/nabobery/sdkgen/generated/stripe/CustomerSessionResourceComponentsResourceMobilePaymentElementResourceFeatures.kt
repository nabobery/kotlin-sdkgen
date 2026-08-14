package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
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
public data class CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeaturesView internal constructor(
  @SerialName("payment_method_allow_redisplay_filters")
  public val paymentMethodAllowRedisplayFilters:
      List<InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f>? = null,
  @SerialName("payment_method_redisplay")
  public val paymentMethodRedisplay:
      InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68? = null,
  @SerialName("payment_method_remove")
  public val paymentMethodRemove:
      InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683? = null,
  @SerialName("payment_method_save")
  public val paymentMethodSave: InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa? = null,
  @SerialName("payment_method_save_allow_redisplay_override")
  public val paymentMethodSaveAllowRedisplayOverride:
      InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648? = null,
)

/**
 * This hash contains the features the mobile payment element supports.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 * _resource_features
 */
@Serializable(with = CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures.Serializer::class)
public class CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures(
  paymentMethodAllowRedisplayFilters: List<InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f>? = null,
  /**
   * Controls whether or not the mobile payment element shows saved payment methods.
   */
  public val paymentMethodRedisplay:
      InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68? = null,
  /**
   * Controls whether the mobile payment element displays the option to remove a saved payment method."
   *
   * Allowing buyers to remove their saved payment methods impacts subscriptions that depend on that payment method.
   * Removing the payment method detaches the [`customer`
   * object](https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer) from that
   * [PaymentMethod](https://docs.stripe.com/api/payment_methods).
   */
  public val paymentMethodRemove:
      InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683? = null,
  /**
   * Controls whether the mobile payment element displays a checkbox offering to save a new payment method.
   *
   * If a customer checks the box, the
   * [`allow_redisplay`](https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay) value
   * on the PaymentMethod is set to `'always'` at confirmation time. For PaymentIntents, the
   * [`setup_future_usage`](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage)
   * value is also set to the value defined in `payment_method_save_usage`.
   */
  public val paymentMethodSave: InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa? = null,
  /**
   * Allows overriding the value of allow_override when saving a new payment method when payment_method_save is set to
   * disabled. Use values: "always", "limited", or "unspecified".
   *
   * If not specified, defaults to `nil` (no override value).
   */
  public val paymentMethodSaveAllowRedisplayOverride:
      InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648? = null,
) {
  /**
   * A list of
   * [`allow_redisplay`](https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay)
   * values that controls which saved payment methods the mobile payment element displays by filtering to only show
   * payment methods with an `allow_redisplay` value that is present in this list.
   *
   * If not specified, defaults to ["always"]. In order to display all saved payment methods, specify ["always",
   * "limited", "unspecified"].
   */
  public val paymentMethodAllowRedisplayFilters:
      List<InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f>? =
      paymentMethodAllowRedisplayFilters?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var paymentMethodAllowRedisplayFiltersValue:
        List<InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f>? = null

    /**
     * A list of
     * [`allow_redisplay`](https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay)
     * values that controls which saved payment methods the mobile payment element displays by filtering to only show
     * payment methods with an `allow_redisplay` value that is present in this list.
     *
     * If not specified, defaults to ["always"]. In order to display all saved payment methods, specify ["always",
     * "limited", "unspecified"].
     */
    public var paymentMethodAllowRedisplayFilters:
        List<InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f>?
      get() = paymentMethodAllowRedisplayFiltersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodAllowRedisplayFiltersValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Controls whether or not the mobile payment element shows saved payment methods.
     */
    public var paymentMethodRedisplay:
        InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68? = null

    /**
     * Controls whether the mobile payment element displays the option to remove a saved payment method."
     *
     * Allowing buyers to remove their saved payment methods impacts subscriptions that depend on that payment method.
     * Removing the payment method detaches the [`customer`
     * object](https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer) from that
     * [PaymentMethod](https://docs.stripe.com/api/payment_methods).
     */
    public var paymentMethodRemove: InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683? =
        null

    /**
     * Controls whether the mobile payment element displays a checkbox offering to save a new payment method.
     *
     * If a customer checks the box, the
     * [`allow_redisplay`](https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay)
     * value on the PaymentMethod is set to `'always'` at confirmation time. For PaymentIntents, the
     * [`setup_future_usage`](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usag
     * e) value is also set to the value defined in `payment_method_save_usage`.
     */
    public var paymentMethodSave: InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa? = null

    /**
     * Allows overriding the value of allow_override when saving a new payment method when payment_method_save is set to
     * disabled. Use values: "always", "limited", or "unspecified".
     *
     * If not specified, defaults to `nil` (no override value).
     */
    public var paymentMethodSaveAllowRedisplayOverride:
        InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648? = null

    public fun build(): CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures = CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures(
      paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters,
      paymentMethodRedisplay = paymentMethodRedisplay,
      paymentMethodRemove = paymentMethodRemove,
      paymentMethodSave = paymentMethodSave,
      paymentMethodSaveAllowRedisplayOverride = paymentMethodSaveAllowRedisplayOverride,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures must be a JSON object")
      return CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures(
        paymentMethodAllowRedisplayFilters = rawObject["payment_method_allow_redisplay_filters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f>?>(element) },
        paymentMethodRedisplay = rawObject["payment_method_redisplay"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68?>(element) },
        paymentMethodRemove = rawObject["payment_method_remove"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerSessionResou7afdPaymentMethodRemoveX98f4a683?>(element) },
        paymentMethodSave = rawObject["payment_method_save"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerSessionResou7afdPaymentMethodSaveXf008e2fa?>(element) },
        paymentMethodSaveAllowRedisplayOverride = rawObject["payment_method_save_allow_redisplay_override"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerSessionResou7afdPaymentMethodSaveAll7d2cXd2d7d648?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentMethodAllowRedisplayFilters?.let { put("payment_method_allow_redisplay_filters", json.encodeToJsonElement(it)) }
        value.paymentMethodRedisplay?.let { put("payment_method_redisplay", json.encodeToJsonElement(it)) }
        value.paymentMethodRemove?.let { put("payment_method_remove", json.encodeToJsonElement(it)) }
        value.paymentMethodSave?.let { put("payment_method_save", json.encodeToJsonElement(it)) }
        value.paymentMethodSaveAllowRedisplayOverride?.let { put("payment_method_save_allow_redisplay_override", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures(block: CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures.Builder.() -> Unit): CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures = CustomerSessionResourceComponentsResourceMobilePaymentElementResourceFeatures.build(block)
