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

public enum class InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Branch {
  PaymentMethodOptionsGrabpay,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Inspection(
  public val matchesPaymentMethodOptionsGrabpay: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsGrabpay, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/grabpay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/grabpay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Inspection,
) {
  public val paymentMethodOptionsGrabpay: PaymentMethodOptionsGrabpayView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsGrabpay) json.decodeFromJsonElement<PaymentMethodOptionsGrabpayView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsGrabpay) add(InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Branch.PaymentMethodOptionsGrabpay)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6NoMatchException("InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Inspection(
    matchesPaymentMethodOptionsGrabpay = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsGrabpay: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsGrabpay = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6Inspection(
    matchesPaymentMethodOptionsGrabpay = matchesPaymentMethodOptionsGrabpay,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsGrabpay) add("PaymentMethodOptionsGrabpay: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
