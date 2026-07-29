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

public enum class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4Branch {
  Branch1,
  Charge,
}

public sealed class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4NoMatchException(
  message: String,
) : InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4DecodingException(message)

internal data class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCharge: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * ID of the successful charge for this payment when `type` is `charge`.Note: charge is only surfaced if the charge
 * object is not associated with a payment intent. If the charge object does have a payment intent, the Invoice Payment
 * surfaces the payment intent instead.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoices_payments_invoice_payment_associated_payment/properties/char
 * ge
 */
@Serializable(with = InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4.Serializer::class)
public class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val charge: Charge? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

  public val matchedBranches:
      Set<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4Branch.Branch1)
      if (inspection.matchesCharge) add(InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4Branch.Charge)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4 {
      val inspection = inspectInlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4NoMatchException("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4(element: JsonElement): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCharge = element.isJsonDecodable<Charge>()
  return InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentChargeX8b34a4f4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCharge = matchesCharge,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCharge) add("Charge: value does not match Charge")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
