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

public enum class InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Branch {
  PaymentMethodOptionsPaynow,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Inspection(
  public val matchesPaymentMethodOptionsPaynow: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsPaynow, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/paynow.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/paynow
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Inspection,
) {
  public val paymentMethodOptionsPaynow: PaymentMethodOptionsPaynowView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsPaynow) json.decodeFromJsonElement<PaymentMethodOptionsPaynowView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsPaynow) add(InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Branch.PaymentMethodOptionsPaynow)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32NoMatchException("InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Inspection(
    matchesPaymentMethodOptionsPaynow = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsPaynow: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsPaynow = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32Inspection(
    matchesPaymentMethodOptionsPaynow = matchesPaymentMethodOptionsPaynow,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsPaynow) add("PaymentMethodOptionsPaynow: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
