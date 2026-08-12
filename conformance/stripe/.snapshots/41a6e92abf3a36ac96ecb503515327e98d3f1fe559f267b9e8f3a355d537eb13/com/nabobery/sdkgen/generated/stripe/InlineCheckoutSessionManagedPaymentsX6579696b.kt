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

public enum class InlineCheckoutSessionManagedPaymentsX6579696bBranch {
  PaymentPagesCheckoutSessionManagedPayments,
}

public sealed class InlineCheckoutSessionManagedPaymentsX6579696bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionManagedPaymentsX6579696bNoMatchException(
  message: String,
) : InlineCheckoutSessionManagedPaymentsX6579696bDecodingException(message)

internal data class InlineCheckoutSessionManagedPaymentsX6579696bInspection(
  public val matchesPaymentPagesCheckoutSessionManagedPayments: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionManagedPayments).count { it }
}

/**
 * Settings for Managed Payments for this Checkout Session and resulting [PaymentIntents](/api/payment_intents/object),
 * [Invoices](/api/invoices/object), and [Subscriptions](/api/subscriptions/object).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/managed_payments
 */
@Serializable(with = InlineCheckoutSessionManagedPaymentsX6579696b.Serializer::class)
public class InlineCheckoutSessionManagedPaymentsX6579696b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionManagedPaymentsX6579696bInspection,
) {
  public val paymentPagesCheckoutSessionManagedPayments:
      PaymentPagesCheckoutSessionManagedPaymentsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionManagedPayments) json.decodeFromJsonElement<PaymentPagesCheckoutSessionManagedPaymentsView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionManagedPaymentsX6579696bBranch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionManagedPayments) add(InlineCheckoutSessionManagedPaymentsX6579696bBranch.PaymentPagesCheckoutSessionManagedPayments)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionManagedPaymentsX6579696b {
      val inspection = inspectInlineCheckoutSessionManagedPaymentsX6579696b(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionManagedPaymentsX6579696bNoMatchException("InlineCheckoutSessionManagedPaymentsX6579696b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionManagedPaymentsX6579696b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionManagedPaymentsX6579696b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionManagedPaymentsX6579696b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionManagedPaymentsX6579696b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionManagedPaymentsX6579696b) {
      encoder.requireJsonEncoder("InlineCheckoutSessionManagedPaymentsX6579696b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionManagedPaymentsX6579696b(element: JsonElement): InlineCheckoutSessionManagedPaymentsX6579696bInspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionManagedPaymentsX6579696bInspection(
    matchesPaymentPagesCheckoutSessionManagedPayments = false,
    failures = listOf("PaymentPagesCheckoutSessionManagedPayments: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionManagedPayments = raw["enabled"] != null
  return InlineCheckoutSessionManagedPaymentsX6579696bInspection(
    matchesPaymentPagesCheckoutSessionManagedPayments = matchesPaymentPagesCheckoutSessionManagedPayments,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionManagedPayments) add("PaymentPagesCheckoutSessionManagedPayments: required properties 'enabled' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
