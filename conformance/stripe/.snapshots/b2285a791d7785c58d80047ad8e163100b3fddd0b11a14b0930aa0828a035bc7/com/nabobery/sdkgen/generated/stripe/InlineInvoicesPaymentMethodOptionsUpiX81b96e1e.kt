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

public enum class InlineInvoicesPaymentMethodOptionsUpiX81b96e1eBranch {
  InvoicePaymentMethodOptionsUpi,
}

public sealed class InlineInvoicesPaymentMethodOptionsUpiX81b96e1eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsUpiX81b96e1eNoMatchException(
  message: String,
) : InlineInvoicesPaymentMethodOptionsUpiX81b96e1eDecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsUpiX81b96e1eInspection(
  public val matchesInvoicePaymentMethodOptionsUpi: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsUpi).count { it }
}

/**
 * If paying by `upi`, this sub-hash contains details about the UPI payment method options to pass to the invoice’s
 * PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/upi
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsUpiX81b96e1e.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsUpiX81b96e1e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesPaymentMethodOptionsUpiX81b96e1eInspection,
) {
  public val invoicePaymentMethodOptionsUpi: InvoicePaymentMethodOptionsUpiView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsUpi) json.decodeFromJsonElement<InvoicePaymentMethodOptionsUpiView>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsUpiX81b96e1eBranch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsUpi) add(InlineInvoicesPaymentMethodOptionsUpiX81b96e1eBranch.InvoicePaymentMethodOptionsUpi)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentMethodOptionsUpiX81b96e1e {
      val inspection = inspectInlineInvoicesPaymentMethodOptionsUpiX81b96e1e(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentMethodOptionsUpiX81b96e1eNoMatchException("InlineInvoicesPaymentMethodOptionsUpiX81b96e1e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentMethodOptionsUpiX81b96e1e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsUpiX81b96e1e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsUpiX81b96e1e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsUpiX81b96e1e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentMethodOptionsUpiX81b96e1e) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsUpiX81b96e1e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentMethodOptionsUpiX81b96e1e(element: JsonElement): InlineInvoicesPaymentMethodOptionsUpiX81b96e1eInspection {
  val raw = element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsUpiX81b96e1eInspection(
    matchesInvoicePaymentMethodOptionsUpi = false,
    failures = listOf("InvoicePaymentMethodOptionsUpi: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsUpi = true
  return InlineInvoicesPaymentMethodOptionsUpiX81b96e1eInspection(
    matchesInvoicePaymentMethodOptionsUpi = matchesInvoicePaymentMethodOptionsUpi,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsUpi) add("InvoicePaymentMethodOptionsUpi: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
