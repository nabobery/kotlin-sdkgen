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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aBranch {
  Branch1,
  PaymentRecord,
}

public sealed class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aNoMatchException(
  message: String,
) : InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aDecodingException(message)

internal data class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aInspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentRecord: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentRecord).count { it }
}

/**
 * ID of the PaymentRecord associated with this payment when `type` is `payment_record`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoices_payments_invoice_payment_associated_payment/properties/paym
 * ent_record
 */
@Serializable(with = InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a.Serializer::class)
public class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentRecord: PaymentRecord? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentRecord) json.decodeFromJsonElement<PaymentRecord>(raw) else null }

  public val matchedBranches:
      Set<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aBranch.Branch1)
      if (inspection.matchesPaymentRecord) add(InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aBranch.PaymentRecord)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a {
      val inspection = inspectInlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aNoMatchException("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0a(element: JsonElement): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentRecord = element.isJsonDecodable<PaymentRecord>()
  return InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentRecordX9cc47f0aInspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentRecord = matchesPaymentRecord,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPaymentRecord) add("PaymentRecord: value does not match PaymentRecord")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
