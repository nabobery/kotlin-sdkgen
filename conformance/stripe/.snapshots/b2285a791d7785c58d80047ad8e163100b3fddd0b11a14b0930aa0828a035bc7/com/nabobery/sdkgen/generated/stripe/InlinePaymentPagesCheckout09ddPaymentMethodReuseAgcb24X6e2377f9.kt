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

public enum class InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9Branch {
  PaymentPagesCheckoutSessionPaymentMethodReuseAgreement,
}

public sealed class InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9NoMatchException(
  message: String,
) : InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9DecodingException(message)

internal data class InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9Inspection(
  public val matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement).count { it }
}

/**
 * If set to `hidden`, it will hide legal text related to the reuse of a payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_consent_collection/properties/payment
 * _method_reuse_agreement
 */
@Serializable(with = InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9.Serializer::class)
public class InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9Inspection,
) {
  public val paymentPagesCheckoutSessionPaymentMethodReuseAgreement:
      PaymentPagesCheckoutSessionPaymentMethodReuseAgreementView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement) json.decodeFromJsonElement<PaymentPagesCheckoutSessionPaymentMethodReuseAgreementView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement) add(InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9Branch.PaymentPagesCheckoutSessionPaymentMethodReuseAgreement)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9 {
      val inspection = inspectInlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9NoMatchException("InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9(element: JsonElement): InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9Inspection(
    matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement = false,
    failures = listOf("PaymentPagesCheckoutSessionPaymentMethodReuseAgreement: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement = raw["position"] != null
  return InlinePaymentPagesCheckout09ddPaymentMethodReuseAgcb24X6e2377f9Inspection(
    matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement = matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionPaymentMethodReuseAgreement) add("PaymentPagesCheckoutSessionPaymentMethodReuseAgreement: required properties 'position' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
