package com.nabobery.sdkgen.generated.stripe

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
public data class SubscriptionsResourcePaymentSettingsView internal constructor(
  @SerialName("payment_method_options")
  public val paymentMethodOptions:
      InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d? = null,
  @SerialName("payment_method_types")
  public val paymentMethodTypes:
      List<InlineSubscriptionsResourcePaymentSettingsPaymentMethodTypesItemXb8e13a76>? = null,
  @SerialName("save_default_payment_method")
  public val saveDefaultPaymentMethod:
      InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_settings
 */
@Serializable(with = SubscriptionsResourcePaymentSettings.Serializer::class)
public class SubscriptionsResourcePaymentSettings(
  /**
   * Payment-method-specific configuration to provide to invoices created by the subscription.
   */
  public val paymentMethodOptions:
      InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d? = null,
  paymentMethodTypes: List<InlineSubscriptionsResourcePaymentSettingsPaymentMethodTypesItemXb8e13a76>? = null,
  /**
   * Configure whether Stripe updates `subscription.default_payment_method` when payment succeeds. Defaults to `off`.
   */
  public val saveDefaultPaymentMethod:
      InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b? = null,
) {
  /**
   * The list of payment method types to provide to every invoice created by the subscription. If not set, Stripe
   * attempts to automatically determine the types to use by looking at the invoice’s default payment method, the
   * subscription’s default payment method, the customer’s default payment method, and your [invoice template
   * settings](https://dashboard.stripe.com/settings/billing/invoice).
   */
  public val paymentMethodTypes:
      List<InlineSubscriptionsResourcePaymentSettingsPaymentMethodTypesItemXb8e13a76>? =
      paymentMethodTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Payment-method-specific configuration to provide to invoices created by the subscription.
     */
    public var paymentMethodOptions:
        InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d? = null

    private var paymentMethodTypesValue:
        List<InlineSubscriptionsResourcePaymentSettingsPaymentMethodTypesItemXb8e13a76>? = null

    /**
     * The list of payment method types to provide to every invoice created by the subscription. If not set, Stripe
     * attempts to automatically determine the types to use by looking at the invoice’s default payment method, the
     * subscription’s default payment method, the customer’s default payment method, and your [invoice template
     * settings](https://dashboard.stripe.com/settings/billing/invoice).
     */
    public var paymentMethodTypes:
        List<InlineSubscriptionsResourcePaymentSettingsPaymentMethodTypesItemXb8e13a76>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Configure whether Stripe updates `subscription.default_payment_method` when payment succeeds. Defaults to `off`.
     */
    public var saveDefaultPaymentMethod:
        InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b? = null

    public fun build(): SubscriptionsResourcePaymentSettings = SubscriptionsResourcePaymentSettings(
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
      saveDefaultPaymentMethod = saveDefaultPaymentMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourcePaymentSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsResourcePaymentSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourcePaymentSettings {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourcePaymentSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourcePaymentSettings must be a JSON object")
      return SubscriptionsResourcePaymentSettings(
        paymentMethodOptions = rawObject["payment_method_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionsResourcePaymentSettingsPaymentMethodOptionsX5727ff7d?>(element) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineSubscriptionsResourcePaymentSettingsPaymentMethodTypesItemXb8e13a76>?>(element) },
        saveDefaultPaymentMethod = rawObject["save_default_payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionsResourcePaymentSettingsSaveDefaultPaymentMethodX8bd52f4b?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourcePaymentSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourcePaymentSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
        value.saveDefaultPaymentMethod?.let { put("save_default_payment_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourcePaymentSettings(block: SubscriptionsResourcePaymentSettings.Builder.() -> Unit): SubscriptionsResourcePaymentSettings = SubscriptionsResourcePaymentSettings.build(block)
