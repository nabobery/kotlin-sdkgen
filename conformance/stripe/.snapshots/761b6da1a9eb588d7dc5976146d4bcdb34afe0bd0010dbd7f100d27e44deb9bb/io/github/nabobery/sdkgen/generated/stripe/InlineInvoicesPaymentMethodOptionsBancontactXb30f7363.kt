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

public enum class InlineInvoicesPaymentMethodOptionsBancontactXb30f7363Branch {
  InvoicePaymentMethodOptionsBancontact,
}

public sealed class InlineInvoicesPaymentMethodOptionsBancontactXb30f7363DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoicesPaymentMethodOptionsBancontactXb30f7363NoMatchException(
  message: String,
) : InlineInvoicesPaymentMethodOptionsBancontactXb30f7363DecodingException(message)

internal data class InlineInvoicesPaymentMethodOptionsBancontactXb30f7363Inspection(
  public val matchesInvoicePaymentMethodOptionsBancontact: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsBancontact).count { it }
}

/**
 * If paying by `bancontact`, this sub-hash contains details about the Bancontact payment method options to pass to the
 * invoice’s PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_payment_method_options/properties/bancontact
 */
@Serializable(with = InlineInvoicesPaymentMethodOptionsBancontactXb30f7363.Serializer::class)
public class InlineInvoicesPaymentMethodOptionsBancontactXb30f7363 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoicesPaymentMethodOptionsBancontactXb30f7363Inspection,
) {
  public val invoicePaymentMethodOptionsBancontact: InvoicePaymentMethodOptionsBancontactView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsBancontact) json.decodeFromJsonElement<InvoicePaymentMethodOptionsBancontactView>(raw) else null }

  public val matchedBranches: Set<InlineInvoicesPaymentMethodOptionsBancontactXb30f7363Branch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsBancontact) add(InlineInvoicesPaymentMethodOptionsBancontactXb30f7363Branch.InvoicePaymentMethodOptionsBancontact)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoicesPaymentMethodOptionsBancontactXb30f7363 {
      val inspection = inspectInlineInvoicesPaymentMethodOptionsBancontactXb30f7363(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoicesPaymentMethodOptionsBancontactXb30f7363NoMatchException("InlineInvoicesPaymentMethodOptionsBancontactXb30f7363 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoicesPaymentMethodOptionsBancontactXb30f7363(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicesPaymentMethodOptionsBancontactXb30f7363> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentMethodOptionsBancontactXb30f7363 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesPaymentMethodOptionsBancontactXb30f7363")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentMethodOptionsBancontactXb30f7363) {
      encoder.requireJsonEncoder("InlineInvoicesPaymentMethodOptionsBancontactXb30f7363").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoicesPaymentMethodOptionsBancontactXb30f7363(element: JsonElement): InlineInvoicesPaymentMethodOptionsBancontactXb30f7363Inspection {
  val raw = element as? JsonObject ?: return InlineInvoicesPaymentMethodOptionsBancontactXb30f7363Inspection(
    matchesInvoicePaymentMethodOptionsBancontact = false,
    failures = listOf("InvoicePaymentMethodOptionsBancontact: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsBancontact = raw["preferred_language"] != null
  return InlineInvoicesPaymentMethodOptionsBancontactXb30f7363Inspection(
    matchesInvoicePaymentMethodOptionsBancontact = matchesInvoicePaymentMethodOptionsBancontact,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsBancontact) add("InvoicePaymentMethodOptionsBancontact: required properties 'preferred_language' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
