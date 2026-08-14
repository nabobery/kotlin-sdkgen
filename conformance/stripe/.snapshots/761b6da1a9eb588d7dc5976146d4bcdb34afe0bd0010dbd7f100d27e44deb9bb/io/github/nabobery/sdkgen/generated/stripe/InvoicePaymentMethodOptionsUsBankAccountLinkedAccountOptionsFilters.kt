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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account_linked_account_option
 * s_filters
 */
@Serializable(with = InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters.Serializer::class)
public class InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters(
  accountSubcategories: List<InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d>? = null,
) {
  /**
   * The account subcategories to use to filter for possible accounts to link. Valid subcategories are `checking` and
   * `savings`.
   */
  public val accountSubcategories:
      List<InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d>? = null

    /**
     * The account subcategories to use to filter for possible accounts to link. Valid subcategories are `checking` and
     * `savings`.
     */
    public var accountSubcategories:
        List<InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters = InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters must be a JSON object")
      return InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineInvoicePaymentMethod6c4fAccountSubcategoriesItemXe62e9a1d>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters(block: InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters.Builder.() -> Unit): InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters = InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters.build(block)
