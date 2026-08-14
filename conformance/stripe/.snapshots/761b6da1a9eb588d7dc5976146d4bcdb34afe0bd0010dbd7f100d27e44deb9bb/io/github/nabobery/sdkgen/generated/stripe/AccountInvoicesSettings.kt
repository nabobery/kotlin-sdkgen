package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_invoices_settings
 */
@Serializable(with = AccountInvoicesSettings.Serializer::class)
public class AccountInvoicesSettings(
  defaultAccountTaxIds: List<InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4>? = null,
  /**
   * Whether to save the payment method after a payment is completed for a one-time invoice or a subscription invoice
   * when the customer already has a default payment method on the hosted invoice page.
   */
  public val hostedPaymentMethodSave:
      InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523? = null,
) {
  /**
   * The list of default Account Tax IDs to automatically include on invoices. Account Tax IDs get added when an invoice
   * is finalized.
   */
  public val defaultAccountTaxIds:
      List<InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4>? =
      defaultAccountTaxIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var defaultAccountTaxIdsValue:
        List<InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4>? = null

    /**
     * The list of default Account Tax IDs to automatically include on invoices. Account Tax IDs get added when an
     * invoice is finalized.
     */
    public var defaultAccountTaxIds:
        List<InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4>?
      get() = defaultAccountTaxIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultAccountTaxIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Whether to save the payment method after a payment is completed for a one-time invoice or a subscription invoice
     * when the customer already has a default payment method on the hosted invoice page.
     */
    public var hostedPaymentMethodSave:
        InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523? = null

    public fun build(): AccountInvoicesSettings = AccountInvoicesSettings(
      defaultAccountTaxIds = defaultAccountTaxIds,
      hostedPaymentMethodSave = hostedPaymentMethodSave,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountInvoicesSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountInvoicesSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountInvoicesSettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountInvoicesSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountInvoicesSettings must be a JSON object")
      return AccountInvoicesSettings(
        defaultAccountTaxIds = rawObject["default_account_tax_ids"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineAccountInvoicesSettingsDefaultAccountTaxIdsItemX7a5634e4>?>(element) },
        hostedPaymentMethodSave = rawObject["hosted_payment_method_save"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineAccountInvoicesSettingsHostedPaymentMethodSaveXdc5ae523?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountInvoicesSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountInvoicesSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultAccountTaxIds?.let { put("default_account_tax_ids", json.encodeToJsonElement(it)) }
        value.hostedPaymentMethodSave?.let { put("hosted_payment_method_save", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountInvoicesSettings(block: AccountInvoicesSettings.Builder.() -> Unit): AccountInvoicesSettings = AccountInvoicesSettings.build(block)
