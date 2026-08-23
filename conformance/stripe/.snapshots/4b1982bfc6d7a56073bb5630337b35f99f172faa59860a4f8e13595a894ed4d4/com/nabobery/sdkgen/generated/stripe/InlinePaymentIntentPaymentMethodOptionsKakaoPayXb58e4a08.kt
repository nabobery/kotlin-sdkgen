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

public enum class InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Branch {
  PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Inspection(
  public val matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/kakao_pay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/kakao_pay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Inspection,
) {
  public val paymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions:
      PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions) json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptionsView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Branch>
    get() = buildSet {
      if (inspection.matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions) add(InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Branch.PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08NoMatchException("InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Inspection(
    matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08Inspection(
    matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions = matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions) add("PaymentFlowsPrivatePaymentMethodsKakaoPayPaymentMethodOptions: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
