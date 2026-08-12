package com.nabobery.sdkgen.generated.stripe

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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account_linked_account_option
 * s
 */
@Serializable(with = InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions.Serializer::class)
public class InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions(
  public val filters: InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters? = null,
  permissions: List<InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529>? = null,
  prefetch: List<InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64>? = null,
) {
  /**
   * The list of permissions to request. The `payment_method` permission must be included.
   */
  public val permissions: List<InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529>? =
      permissions?.let { collection0 -> collection0.toList() }

  /**
   * Data features requested to be retrieved upon account creation.
   */
  public val prefetch: List<InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var filters: InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters? = null

    private var permissionsValue: List<InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529>? =
        null

    /**
     * The list of permissions to request. The `payment_method` permission must be included.
     */
    public var permissions: List<InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var prefetchValue: List<InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64>? = null

    /**
     * Data features requested to be retrieved upon account creation.
     */
    public var prefetch: List<InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions = InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions(
      filters = filters,
      permissions = permissions,
      prefetch = prefetch,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions {
      val jsonDecoder = decoder.requireJsonDecoder("InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions must be a JSON object")
      return InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions(
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptionsFilters>(it) },
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<List<InlineInvoicePaymentMethodbf0aPermissionsItemXf62ad529>>(it) },
        prefetch = rawObject["prefetch"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions(block: InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions.Builder.() -> Unit): InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions = InvoicePaymentMethodOptionsUsBankAccountLinkedAccountOptions.build(block)
