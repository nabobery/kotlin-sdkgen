package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3Branch {
  InvoicePaymentMethodOptionsCustomerBalance,
}

public sealed class InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3NoMatchException(
  message: String,
) : InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3DecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3Inspection(
  public val matchesInvoicePaymentMethodOptionsCustomerBalance: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsCustomerBalance).count { it }
}

/**
 * If paying by `customer_balance`, this sub-hash contains details about the Bank transfer payment method options to
 * pass to the invoice’s PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/customer_balance
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3Inspection,
) {
  public val invoicePaymentMethodOptionsCustomerBalance:
      InvoicePaymentMethodOptionsCustomerBalanceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsCustomerBalance) json.decodeFromJsonElement<InvoicePaymentMethodOptionsCustomerBalanceView>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3Branch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsCustomerBalance) add(InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3Branch.InvoicePaymentMethodOptionsCustomerBalance)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3 {
      val inspection = inspectInlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3NoMatchException("InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3(element: JsonElement): InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3Inspection {
  val raw = element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3Inspection(
    matchesInvoicePaymentMethodOptionsCustomerBalance = false,
    failures = listOf("InvoicePaymentMethodOptionsCustomerBalance: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsCustomerBalance = true
  return InlineInvoicesPaymentMethodOptionsCustomerBalanceXeb891be3Inspection(
    matchesInvoicePaymentMethodOptionsCustomerBalance = matchesInvoicePaymentMethodOptionsCustomerBalance,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsCustomerBalance) add("InvoicePaymentMethodOptionsCustomerBalance: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
