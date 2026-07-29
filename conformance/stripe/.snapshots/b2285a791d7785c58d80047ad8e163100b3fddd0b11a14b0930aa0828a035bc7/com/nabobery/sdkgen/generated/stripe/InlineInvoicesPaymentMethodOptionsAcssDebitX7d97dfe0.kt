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

public enum class InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0Branch {
  InvoicePaymentMethodOptionsAcssDebit,
}

public sealed class InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0NoMatchException(
  message: String,
) : InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0DecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0Inspection(
  public val matchesInvoicePaymentMethodOptionsAcssDebit: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsAcssDebit).count { it }
}

/**
 * If paying by `acss_debit`, this sub-hash contains details about the Canadian pre-authorized debit payment method
 * options to pass to the invoice’s PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0Inspection,
) {
  public val invoicePaymentMethodOptionsAcssDebit: InvoicePaymentMethodOptionsAcssDebitView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsAcssDebit) json.decodeFromJsonElement<InvoicePaymentMethodOptionsAcssDebitView>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0Branch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsAcssDebit) add(InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0Branch.InvoicePaymentMethodOptionsAcssDebit)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0 {
      val inspection = inspectInlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0NoMatchException("InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0(element: JsonElement): InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0Inspection {
  val raw = element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0Inspection(
    matchesInvoicePaymentMethodOptionsAcssDebit = false,
    failures = listOf("InvoicePaymentMethodOptionsAcssDebit: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsAcssDebit = true
  return InlineInvoicesPaymentMethodOptionsAcssDebitX7d97dfe0Inspection(
    matchesInvoicePaymentMethodOptionsAcssDebit = matchesInvoicePaymentMethodOptionsAcssDebit,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsAcssDebit) add("InvoicePaymentMethodOptionsAcssDebit: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
