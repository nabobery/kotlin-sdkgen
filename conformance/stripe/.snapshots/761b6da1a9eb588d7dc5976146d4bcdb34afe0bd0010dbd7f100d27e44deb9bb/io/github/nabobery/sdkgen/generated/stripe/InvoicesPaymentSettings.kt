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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_settings
 */
@Serializable(with = InvoicesPaymentSettings.Serializer::class)
public class InvoicesPaymentSettings(
  /**
   * ID of the mandate to be used for this invoice. It must correspond to the payment method used to pay the invoice,
   * including the invoice's default_payment_method or default_source, if set.
   */
  public val defaultMandate: String? = null,
  /**
   * Payment-method-specific configuration to provide to the invoice’s PaymentIntent.
   */
  public val paymentMethodOptions:
      InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8? = null,
  paymentMethodTypes: List<InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d>? = null,
) {
  /**
   * The list of payment method types (e.g. card) to provide to the invoice’s PaymentIntent. If not set, Stripe attempts
   * to automatically determine the types to use by looking at the invoice’s default payment method, the subscription’s
   * default payment method, the customer’s default payment method, and your [invoice template
   * settings](https://dashboard.stripe.com/settings/billing/invoice).
   */
  public val paymentMethodTypes: List<InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d>?
      = paymentMethodTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * ID of the mandate to be used for this invoice. It must correspond to the payment method used to pay the invoice,
     * including the invoice's default_payment_method or default_source, if set.
     */
    public var defaultMandate: String? = null

    /**
     * Payment-method-specific configuration to provide to the invoice’s PaymentIntent.
     */
    public var paymentMethodOptions: InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8? =
        null

    private var paymentMethodTypesValue:
        List<InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d>? = null

    /**
     * The list of payment method types (e.g. card) to provide to the invoice’s PaymentIntent. If not set, Stripe
     * attempts to automatically determine the types to use by looking at the invoice’s default payment method, the
     * subscription’s default payment method, the customer’s default payment method, and your [invoice template
     * settings](https://dashboard.stripe.com/settings/billing/invoice).
     */
    public var paymentMethodTypes:
        List<InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d>?
      get() = paymentMethodTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        paymentMethodTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InvoicesPaymentSettings = InvoicesPaymentSettings(
      defaultMandate = defaultMandate,
      paymentMethodOptions = paymentMethodOptions,
      paymentMethodTypes = paymentMethodTypes,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicesPaymentSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicesPaymentSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicesPaymentSettings {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicesPaymentSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicesPaymentSettings must be a JSON object")
      return InvoicesPaymentSettings(
        defaultMandate = rawObject["default_mandate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paymentMethodOptions = rawObject["payment_method_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInvoicesPaymentSettingsPaymentMethodOptionsXd97a36d8?>(element) },
        paymentMethodTypes = rawObject["payment_method_types"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicesPaymentSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicesPaymentSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultMandate?.let { put("default_mandate", it) }
        value.paymentMethodOptions?.let { put("payment_method_options", json.encodeToJsonElement(it)) }
        value.paymentMethodTypes?.let { put("payment_method_types", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicesPaymentSettings(block: InvoicesPaymentSettings.Builder.() -> Unit): InvoicesPaymentSettings = InvoicesPaymentSettings.build(block)
