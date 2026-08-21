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

public enum class InlineCheckoutSessionPaymentIntentXd92b065bBranch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineCheckoutSessionPaymentIntentXd92b065bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionPaymentIntentXd92b065bNoMatchException(
  message: String,
) : InlineCheckoutSessionPaymentIntentXd92b065bDecodingException(message)

internal data class InlineCheckoutSessionPaymentIntentXd92b065bInspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * The ID of the PaymentIntent for Checkout Sessions in `payment` mode. You can't confirm or cancel the PaymentIntent
 * for a Checkout Session. To cancel, [expire the Checkout
 * Session](https://docs.stripe.com/api/checkout/sessions/expire) instead.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/payment_intent
 */
@Serializable(with = InlineCheckoutSessionPaymentIntentXd92b065b.Serializer::class)
public class InlineCheckoutSessionPaymentIntentXd92b065b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionPaymentIntentXd92b065bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionPaymentIntentXd92b065bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCheckoutSessionPaymentIntentXd92b065bBranch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineCheckoutSessionPaymentIntentXd92b065bBranch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionPaymentIntentXd92b065b {
      val inspection = inspectInlineCheckoutSessionPaymentIntentXd92b065b(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionPaymentIntentXd92b065bNoMatchException("InlineCheckoutSessionPaymentIntentXd92b065b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionPaymentIntentXd92b065b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionPaymentIntentXd92b065b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionPaymentIntentXd92b065b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionPaymentIntentXd92b065b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionPaymentIntentXd92b065b) {
      encoder.requireJsonEncoder("InlineCheckoutSessionPaymentIntentXd92b065b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionPaymentIntentXd92b065b(element: JsonElement): InlineCheckoutSessionPaymentIntentXd92b065bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineCheckoutSessionPaymentIntentXd92b065bInspection(
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
