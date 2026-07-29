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

public enum class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11Branch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11NoMatchException(
  message: String,
) : InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11DecodingException(message)

internal data class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * ID of the PaymentIntent associated with this payment when `type` is `payment_intent`. Note: This property is only
 * populated for invoices finalized on or after March 15th, 2019.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoices_payments_invoice_payment_associated_payment/properties/paym
 * ent_intent
 */
@Serializable(with = InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11.Serializer::class)
public class InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches:
      Set<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11Branch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11Branch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11 {
      val inspection = inspectInlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11NoMatchException("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11(element: JsonElement): InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineInvoicesPaymentsInvoicePaymentAssociatedPaymentPaymentIntentXd0d3cf11Inspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentIntent = matchesPaymentIntent,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPaymentIntent) add("PaymentIntent: value does not match PaymentIntent")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
