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

public enum class InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdBranch {
  InvoicePaymentMethodOptionsUsBankAccount,
}

public sealed class InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdNoMatchException(
  message: String,
) : InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdDecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdInspection(
  public val matchesInvoicePaymentMethodOptionsUsBankAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsUsBankAccount).count { it }
}

/**
 * If paying by `us_bank_account`, this sub-hash contains details about the ACH direct debit payment method options to
 * pass to the invoice’s PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdInspection,
) {
  public val invoicePaymentMethodOptionsUsBankAccount: InvoicePaymentMethodOptionsUsBankAccountView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsUsBankAccount) json.decodeFromJsonElement<InvoicePaymentMethodOptionsUsBankAccountView>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdBranch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsUsBankAccount) add(InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdBranch.InvoicePaymentMethodOptionsUsBankAccount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd {
      val inspection = inspectInlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdNoMatchException("InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bd(element: JsonElement): InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdInspection {
  val raw = element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdInspection(
    matchesInvoicePaymentMethodOptionsUsBankAccount = false,
    failures = listOf("InvoicePaymentMethodOptionsUsBankAccount: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsUsBankAccount = true
  return InlineInvoicesPaymentMethodOptionsUsBankAccountX1db9b4bdInspection(
    matchesInvoicePaymentMethodOptionsUsBankAccount = matchesInvoicePaymentMethodOptionsUsBankAccount,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsUsBankAccount) add("InvoicePaymentMethodOptionsUsBankAccount: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
