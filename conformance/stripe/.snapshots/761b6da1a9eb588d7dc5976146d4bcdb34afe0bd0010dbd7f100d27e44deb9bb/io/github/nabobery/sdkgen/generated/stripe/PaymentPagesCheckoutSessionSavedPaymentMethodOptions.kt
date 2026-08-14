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
public data class PaymentPagesCheckoutSessionSavedPaymentMethodOptionsView internal constructor(
  @SerialName("allow_redisplay_filters")
  public val allowRedisplayFilters:
      List<InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d>? = null,
  @SerialName("payment_method_remove")
  public val paymentMethodRemove:
      InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78? = null,
  @SerialName("payment_method_save")
  public val paymentMethodSave: InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_saved_payment_method_options
 */
@Serializable(with = PaymentPagesCheckoutSessionSavedPaymentMethodOptions.Serializer::class)
public class PaymentPagesCheckoutSessionSavedPaymentMethodOptions(
  allowRedisplayFilters: List<InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d>? = null,
  /**
   * Enable customers to choose if they wish to remove their saved payment methods. Disabled by default.
   */
  public val paymentMethodRemove:
      InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78? = null,
  /**
   * Enable customers to choose if they wish to save their payment method for future use. Disabled by default.
   */
  public val paymentMethodSave: InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08? = null,
) {
  /**
   * Uses the `allow_redisplay` value of each saved payment method to filter the set presented to a returning customer.
   * By default, only saved payment methods with ’allow_redisplay: ‘always’ are shown in Checkout.
   */
  public val allowRedisplayFilters:
      List<InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d>? =
      allowRedisplayFilters?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowRedisplayFiltersValue:
        List<InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d>? = null

    /**
     * Uses the `allow_redisplay` value of each saved payment method to filter the set presented to a returning
     * customer. By default, only saved payment methods with ’allow_redisplay: ‘always’ are shown in Checkout.
     */
    public var allowRedisplayFilters:
        List<InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d>?
      get() = allowRedisplayFiltersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowRedisplayFiltersValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Enable customers to choose if they wish to remove their saved payment methods. Disabled by default.
     */
    public var paymentMethodRemove: InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78? =
        null

    /**
     * Enable customers to choose if they wish to save their payment method for future use. Disabled by default.
     */
    public var paymentMethodSave: InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08? = null

    public fun build(): PaymentPagesCheckoutSessionSavedPaymentMethodOptions = PaymentPagesCheckoutSessionSavedPaymentMethodOptions(
      allowRedisplayFilters = allowRedisplayFilters,
      paymentMethodRemove = paymentMethodRemove,
      paymentMethodSave = paymentMethodSave,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionSavedPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionSavedPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionSavedPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionSavedPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionSavedPaymentMethodOptions must be a JSON object")
      return PaymentPagesCheckoutSessionSavedPaymentMethodOptions(
        allowRedisplayFilters = rawObject["allow_redisplay_filters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlinePaymentPagesCheckoutca5aAllowRedisplayFiltersItemXf1cd964d>?>(element) },
        paymentMethodRemove = rawObject["payment_method_remove"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutca5aPaymentMethodRemoveX91464a78?>(element) },
        paymentMethodSave = rawObject["payment_method_save"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutca5aPaymentMethodSaveX1b3c9d08?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionSavedPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionSavedPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowRedisplayFilters?.let { put("allow_redisplay_filters", json.encodeToJsonElement(it)) }
        value.paymentMethodRemove?.let { put("payment_method_remove", json.encodeToJsonElement(it)) }
        value.paymentMethodSave?.let { put("payment_method_save", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionSavedPaymentMethodOptions(block: PaymentPagesCheckoutSessionSavedPaymentMethodOptions.Builder.() -> Unit): PaymentPagesCheckoutSessionSavedPaymentMethodOptions = PaymentPagesCheckoutSessionSavedPaymentMethodOptions.build(block)
