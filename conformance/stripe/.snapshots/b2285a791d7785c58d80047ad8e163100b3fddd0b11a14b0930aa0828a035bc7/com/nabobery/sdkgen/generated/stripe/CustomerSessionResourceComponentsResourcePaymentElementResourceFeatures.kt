package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class CustomerSessionResourceComponentsResourcePaymentElementResourceFeaturesView internal constructor(
  @SerialName("payment_method_allow_redisplay_filters")
  public val paymentMethodAllowRedisplayFilters:
      List<InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf>,
  @SerialName("payment_method_redisplay")
  public val paymentMethodRedisplay: InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e,
  @SerialName("payment_method_redisplay_limit")
  public val paymentMethodRedisplayLimit: Int? = null,
  @SerialName("payment_method_remove")
  public val paymentMethodRemove: InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf,
  @SerialName("payment_method_save")
  public val paymentMethodSave: InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf,
  @SerialName("payment_method_save_usage")
  public val paymentMethodSaveUsage:
      InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d? = null,
)

/**
 * This hash contains the features the Payment Element supports.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element_resour
 * ce_features
 */
@Serializable(with = CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures.Serializer::class)
public class CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures(
  paymentMethodAllowRedisplayFilters: List<InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf>,
  /**
   * Controls whether or not the Payment Element shows saved payment methods. This parameter defaults to `disabled`.
   */
  public val paymentMethodRedisplay: InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e,
  /**
   * Controls whether the Payment Element displays the option to remove a saved payment method. This parameter defaults
   * to `disabled`.
   *
   * Allowing buyers to remove their saved payment methods impacts subscriptions that depend on that payment method.
   * Removing the payment method detaches the [`customer`
   * object](https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer) from that
   * [PaymentMethod](https://docs.stripe.com/api/payment_methods).
   */
  public val paymentMethodRemove: InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf,
  /**
   * Controls whether the Payment Element displays a checkbox offering to save a new payment method. This parameter
   * defaults to `disabled`.
   *
   * If a customer checks the box, the
   * [`allow_redisplay`](https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay) value
   * on the PaymentMethod is set to `'always'` at confirmation time. For PaymentIntents, the
   * [`setup_future_usage`](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage)
   * value is also set to the value defined in `payment_method_save_usage`.
   */
  public val paymentMethodSave: InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf,
  /**
   * Determines the max number of saved payment methods for the Payment Element to display. This parameter defaults to
   * `3`. The maximum redisplay limit is `10`.
   */
  public val paymentMethodRedisplayLimit: Int? = null,
  /**
   * When using PaymentIntents and the customer checks the save checkbox, this field determines the
   * [`setup_future_usage`](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage)
   * value used to confirm the PaymentIntent.
   *
   * When using SetupIntents, directly configure the
   * [`usage`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-usage) value on SetupIntent
   * creation.
   */
  public val paymentMethodSaveUsage:
      InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d? = null,
) {
  /**
   * A list of
   * [`allow_redisplay`](https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay)
   * values that controls which saved payment methods the Payment Element displays by filtering to only show payment
   * methods with an `allow_redisplay` value that is present in this list.
   *
   * If not specified, defaults to ["always"]. In order to display all saved payment methods, specify ["always",
   * "limited", "unspecified"].
   */
  public val paymentMethodAllowRedisplayFilters:
      List<InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf> =
      paymentMethodAllowRedisplayFilters.toList()

  public class Builder {
    private var paymentMethodAllowRedisplayFiltersValue:
        List<InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf>? = null

    public var paymentMethodAllowRedisplayFilters:
        List<InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf>
      get() = requireNotNull(paymentMethodAllowRedisplayFiltersValue) { "paymentMethodAllowRedisplayFilters is required" }.toList()
      set(`value`) {
        paymentMethodAllowRedisplayFiltersValue = value.toList()
      }

    private var paymentMethodRedisplayValue:
        InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e? = null

    public var paymentMethodRedisplay: InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e
      get() = requireNotNull(paymentMethodRedisplayValue) { "paymentMethodRedisplay is required" }
      set(`value`) {
        paymentMethodRedisplayValue = value
      }

    private var paymentMethodRemoveValue:
        InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf? = null

    public var paymentMethodRemove: InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf
      get() = requireNotNull(paymentMethodRemoveValue) { "paymentMethodRemove is required" }
      set(`value`) {
        paymentMethodRemoveValue = value
      }

    private var paymentMethodSaveValue: InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf? =
        null

    public var paymentMethodSave: InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf
      get() = requireNotNull(paymentMethodSaveValue) { "paymentMethodSave is required" }
      set(`value`) {
        paymentMethodSaveValue = value
      }

    /**
     * Determines the max number of saved payment methods for the Payment Element to display. This parameter defaults to
     * `3`. The maximum redisplay limit is `10`.
     */
    public var paymentMethodRedisplayLimit: Int? = null

    /**
     * When using PaymentIntents and the customer checks the save checkbox, this field determines the
     * [`setup_future_usage`](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usag
     * e) value used to confirm the PaymentIntent.
     *
     * When using SetupIntents, directly configure the
     * [`usage`](https://docs.stripe.com/api/setup_intents/object#setup_intent_object-usage) value on SetupIntent
     * creation.
     */
    public var paymentMethodSaveUsage:
        InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d? = null

    public fun build(): CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures {
      check(paymentMethodAllowRedisplayFiltersValue != null) { "paymentMethodAllowRedisplayFilters is required" }
      check(paymentMethodRedisplayValue != null) { "paymentMethodRedisplay is required" }
      check(paymentMethodRemoveValue != null) { "paymentMethodRemove is required" }
      check(paymentMethodSaveValue != null) { "paymentMethodSave is required" }
      return CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures(
        paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters,
        paymentMethodRedisplay = paymentMethodRedisplay,
        paymentMethodRemove = paymentMethodRemove,
        paymentMethodSave = paymentMethodSave,
        paymentMethodRedisplayLimit = paymentMethodRedisplayLimit,
        paymentMethodSaveUsage = paymentMethodSaveUsage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures must be a JSON object")
      val paymentMethodAllowRedisplayFilters = json.decodeRequired<List<InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf>>(rawObject, "payment_method_allow_redisplay_filters")
      val paymentMethodRedisplay = json.decodeRequired<InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e>(rawObject, "payment_method_redisplay")
      val paymentMethodRemove = json.decodeRequired<InlineCustomerSessionResoud9dcPaymentMethodRemoveXbc038ecf>(rawObject, "payment_method_remove")
      val paymentMethodSave = json.decodeRequired<InlineCustomerSessionResoud9dcPaymentMethodSaveX66d7ccdf>(rawObject, "payment_method_save")
      return CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures(
        paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters,
        paymentMethodRedisplay = paymentMethodRedisplay,
        paymentMethodRemove = paymentMethodRemove,
        paymentMethodSave = paymentMethodSave,
        paymentMethodRedisplayLimit = rawObject["payment_method_redisplay_limit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        paymentMethodSaveUsage = rawObject["payment_method_save_usage"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCustomerSessionResoud9dcPaymentMethodSaveUsageX5f27063d?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_method_allow_redisplay_filters", json.encodeToJsonElement(value.paymentMethodAllowRedisplayFilters))
        put("payment_method_redisplay", json.encodeToJsonElement(value.paymentMethodRedisplay))
        put("payment_method_remove", json.encodeToJsonElement(value.paymentMethodRemove))
        put("payment_method_save", json.encodeToJsonElement(value.paymentMethodSave))
        value.paymentMethodRedisplayLimit?.let { put("payment_method_redisplay_limit", json.encodeToJsonElement(it)) }
        value.paymentMethodSaveUsage?.let { put("payment_method_save_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerSessionResourceComponentsResourcePaymentElementResourceFeatures(block: CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures.Builder.() -> Unit): CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures = CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
