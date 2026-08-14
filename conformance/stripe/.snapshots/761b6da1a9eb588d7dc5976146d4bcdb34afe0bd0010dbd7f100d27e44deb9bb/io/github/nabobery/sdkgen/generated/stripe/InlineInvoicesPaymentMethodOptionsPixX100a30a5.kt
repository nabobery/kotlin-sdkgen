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

public enum class InlineInvoicesPaymentMethodOptionsPixX100a30a5Branch {
  InvoicePaymentMethodOptionsPix,
}

public sealed class InlineInvoicesPaymentMethodOptionsPixX100a30a5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsPixX100a30a5NoMatchException(
  message: String,
) : InlineInvoicesPaymentMethodOptionsPixX100a30a5DecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsPixX100a30a5Inspection(
  public val matchesInvoicePaymentMethodOptionsPix: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsPix).count { it }
}

/**
 * If paying by `pix`, this sub-hash contains details about the Pix payment method options to pass to the invoice’s
 * PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/pix
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsPixX100a30a5.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsPixX100a30a5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesPaymentMethodOptionsPixX100a30a5Inspection,
) {
  public val invoicePaymentMethodOptionsPix: InvoicePaymentMethodOptionsPixView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsPix) json.decodeFromJsonElement<InvoicePaymentMethodOptionsPixView>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsPixX100a30a5Branch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsPix) add(InlineInvoicesPaymentMethodOptionsPixX100a30a5Branch.InvoicePaymentMethodOptionsPix)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentMethodOptionsPixX100a30a5 {
      val inspection = inspectInlineInvoicesPaymentMethodOptionsPixX100a30a5(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentMethodOptionsPixX100a30a5NoMatchException("InlineInvoicesPaymentMethodOptionsPixX100a30a5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentMethodOptionsPixX100a30a5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsPixX100a30a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsPixX100a30a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsPixX100a30a5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentMethodOptionsPixX100a30a5) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsPixX100a30a5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentMethodOptionsPixX100a30a5(element: JsonElement): InlineInvoicesPaymentMethodOptionsPixX100a30a5Inspection {
  val raw = element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsPixX100a30a5Inspection(
    matchesInvoicePaymentMethodOptionsPix = false,
    failures = listOf("InvoicePaymentMethodOptionsPix: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsPix = true
  return InlineInvoicesPaymentMethodOptionsPixX100a30a5Inspection(
    matchesInvoicePaymentMethodOptionsPix = matchesInvoicePaymentMethodOptionsPix,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsPix) add("InvoicePaymentMethodOptionsPix: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
