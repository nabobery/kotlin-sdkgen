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

public enum class InlineInvoicesPaymentMethodOptionsCardX7732c642Branch {
  InvoicePaymentMethodOptionsCard,
}

public sealed class InlineInvoicesPaymentMethodOptionsCardX7732c642DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsCardX7732c642NoMatchException(
  message: String,
) : InlineInvoicesPaymentMethodOptionsCardX7732c642DecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsCardX7732c642Inspection(
  public val matchesInvoicePaymentMethodOptionsCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsCard).count { it }
}

/**
 * If paying by `card`, this sub-hash contains details about the Card payment method options to pass to the invoice’s
 * PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/card
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsCardX7732c642.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsCardX7732c642 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesPaymentMethodOptionsCardX7732c642Inspection,
) {
  public val invoicePaymentMethodOptionsCard: InvoicePaymentMethodOptionsCardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsCard) json.decodeFromJsonElement<InvoicePaymentMethodOptionsCardView>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsCardX7732c642Branch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsCard) add(InlineInvoicesPaymentMethodOptionsCardX7732c642Branch.InvoicePaymentMethodOptionsCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentMethodOptionsCardX7732c642 {
      val inspection = inspectInlineInvoicesPaymentMethodOptionsCardX7732c642(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentMethodOptionsCardX7732c642NoMatchException("InlineInvoicesPaymentMethodOptionsCardX7732c642 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentMethodOptionsCardX7732c642(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsCardX7732c642> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsCardX7732c642 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsCardX7732c642")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentMethodOptionsCardX7732c642) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsCardX7732c642").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentMethodOptionsCardX7732c642(element: JsonElement): InlineInvoicesPaymentMethodOptionsCardX7732c642Inspection {
  val raw = element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsCardX7732c642Inspection(
    matchesInvoicePaymentMethodOptionsCard = false,
    failures = listOf("InvoicePaymentMethodOptionsCard: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsCard = true
  return InlineInvoicesPaymentMethodOptionsCardX7732c642Inspection(
    matchesInvoicePaymentMethodOptionsCard = matchesInvoicePaymentMethodOptionsCard,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsCard) add("InvoicePaymentMethodOptionsCard: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
