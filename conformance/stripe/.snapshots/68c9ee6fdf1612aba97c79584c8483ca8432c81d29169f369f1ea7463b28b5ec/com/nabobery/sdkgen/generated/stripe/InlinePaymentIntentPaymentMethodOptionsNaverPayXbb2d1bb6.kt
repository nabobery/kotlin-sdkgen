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

public enum class InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Branch {
  PaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Inspection(
  public val matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/naver_pay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/naver_pay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Inspection,
) {
  public val paymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions:
      PaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions) json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptionsView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Branch>
    get() = buildSet {
      if (inspection.matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions) add(InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Branch.PaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6NoMatchException("InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Inspection(
    matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6Inspection(
    matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions = matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions) add("PaymentFlowsPrivatePaymentMethodsNaverPayPaymentMethodOptions: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
