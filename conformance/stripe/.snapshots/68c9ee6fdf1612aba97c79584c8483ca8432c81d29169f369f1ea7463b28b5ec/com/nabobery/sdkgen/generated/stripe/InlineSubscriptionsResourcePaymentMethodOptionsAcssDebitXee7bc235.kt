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

public enum class InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235Branch {
  InvoicePaymentMethodOptionsAcssDebit,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235NoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235DecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235Inspection(
  public val matchesInvoicePaymentMethodOptionsAcssDebit: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsAcssDebit).count { it }
}

/**
 * This sub-hash contains details about the Canadian pre-authorized debit payment method options to pass to invoices
 * created by the subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235Inspection,
) {
  public val invoicePaymentMethodOptionsAcssDebit: InvoicePaymentMethodOptionsAcssDebitView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsAcssDebit) json.decodeFromJsonElement<InvoicePaymentMethodOptionsAcssDebitView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235Branch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsAcssDebit) add(InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235Branch.InvoicePaymentMethodOptionsAcssDebit)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235 {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235NoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235Inspection(
    matchesInvoicePaymentMethodOptionsAcssDebit = false,
    failures = listOf("InvoicePaymentMethodOptionsAcssDebit: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsAcssDebit = true
  return InlineSubscriptionsResourcePaymentMethodOptionsAcssDebitXee7bc235Inspection(
    matchesInvoicePaymentMethodOptionsAcssDebit = matchesInvoicePaymentMethodOptionsAcssDebit,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsAcssDebit) add("InvoicePaymentMethodOptionsAcssDebit: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
