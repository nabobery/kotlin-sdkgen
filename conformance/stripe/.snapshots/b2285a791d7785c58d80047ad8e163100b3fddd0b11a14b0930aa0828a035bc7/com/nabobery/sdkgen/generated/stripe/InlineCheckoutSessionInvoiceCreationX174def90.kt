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

public enum class InlineCheckoutSessionInvoiceCreationX174def90Branch {
  PaymentPagesCheckoutSessionInvoiceCreation,
}

public sealed class InlineCheckoutSessionInvoiceCreationX174def90DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionInvoiceCreationX174def90NoMatchException(
  message: String,
) : InlineCheckoutSessionInvoiceCreationX174def90DecodingException(message)

internal data class InlineCheckoutSessionInvoiceCreationX174def90Inspection(
  public val matchesPaymentPagesCheckoutSessionInvoiceCreation: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionInvoiceCreation).count { it }
}

/**
 * Details on the state of invoice creation for the Checkout Session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/invoice_creation
 */
@Serializable(with = InlineCheckoutSessionInvoiceCreationX174def90.Serializer::class)
public class InlineCheckoutSessionInvoiceCreationX174def90 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionInvoiceCreationX174def90Inspection,
) {
  public val paymentPagesCheckoutSessionInvoiceCreation:
      PaymentPagesCheckoutSessionInvoiceCreationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionInvoiceCreation) json.decodeFromJsonElement<PaymentPagesCheckoutSessionInvoiceCreationView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionInvoiceCreationX174def90Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionInvoiceCreation) add(InlineCheckoutSessionInvoiceCreationX174def90Branch.PaymentPagesCheckoutSessionInvoiceCreation)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionInvoiceCreationX174def90 {
      val inspection = inspectInlineCheckoutSessionInvoiceCreationX174def90(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionInvoiceCreationX174def90NoMatchException("InlineCheckoutSessionInvoiceCreationX174def90 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionInvoiceCreationX174def90(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionInvoiceCreationX174def90> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionInvoiceCreationX174def90 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionInvoiceCreationX174def90")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionInvoiceCreationX174def90) {
      encoder.requireJsonEncoder("InlineCheckoutSessionInvoiceCreationX174def90").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionInvoiceCreationX174def90(element: JsonElement): InlineCheckoutSessionInvoiceCreationX174def90Inspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionInvoiceCreationX174def90Inspection(
    matchesPaymentPagesCheckoutSessionInvoiceCreation = false,
    failures = listOf("PaymentPagesCheckoutSessionInvoiceCreation: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionInvoiceCreation = raw["enabled"] != null && raw["invoice_data"] != null
  return InlineCheckoutSessionInvoiceCreationX174def90Inspection(
    matchesPaymentPagesCheckoutSessionInvoiceCreation = matchesPaymentPagesCheckoutSessionInvoiceCreation,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionInvoiceCreation) add("PaymentPagesCheckoutSessionInvoiceCreation: required properties 'enabled', 'invoice_data' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
