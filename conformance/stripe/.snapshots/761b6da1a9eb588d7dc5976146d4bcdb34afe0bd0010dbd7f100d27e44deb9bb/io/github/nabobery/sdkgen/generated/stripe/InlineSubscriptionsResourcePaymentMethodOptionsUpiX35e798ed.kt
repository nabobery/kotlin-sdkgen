package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edBranch {
  InvoicePaymentMethodOptionsUpi,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edNoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edDecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edInspection(
  public val matchesInvoicePaymentMethodOptionsUpi: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsUpi).count { it }
}

/**
 * This sub-hash contains details about the UPI payment method options to pass to invoices created by the subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/upi
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edInspection,
) {
  public val invoicePaymentMethodOptionsUpi: InvoicePaymentMethodOptionsUpiView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsUpi) json.decodeFromJsonElement<InvoicePaymentMethodOptionsUpiView>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edBranch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsUpi) add(InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edBranch.InvoicePaymentMethodOptionsUpi)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edNoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798ed(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edInspection(
    matchesInvoicePaymentMethodOptionsUpi = false,
    failures = listOf("InvoicePaymentMethodOptionsUpi: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsUpi = true
  return InlineSubscriptionsResourcePaymentMethodOptionsUpiX35e798edInspection(
    matchesInvoicePaymentMethodOptionsUpi = matchesInvoicePaymentMethodOptionsUpi,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsUpi) add("InvoicePaymentMethodOptionsUpi: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
