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

public enum class InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8Branch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8NoMatchException(
  message: String,
) : InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8DecodingException(message)

internal data class InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * The [Payment Intent](https://docs.stripe.com/api/payment_intents/object) that funds were applied to.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_applied_
 * to_payment_transaction/properties/payment_intent
 */
@Serializable(with = InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8.Serializer::class)
public class InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches: Set<InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8Branch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8Branch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8 {
      val inspection = inspectInlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8NoMatchException("InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8) {
      encoder.requireJsonEncoder("InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8(element: JsonElement): InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineCustomerBalanceResou9e8cPaymentIntentX4b2cc7d8Inspection(
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
