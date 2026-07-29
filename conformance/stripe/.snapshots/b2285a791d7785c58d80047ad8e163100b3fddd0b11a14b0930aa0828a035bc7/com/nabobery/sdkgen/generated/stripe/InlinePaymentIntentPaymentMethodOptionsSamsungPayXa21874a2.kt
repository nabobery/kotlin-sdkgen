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

public enum class InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Branch {
  PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Inspection(
  public val matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/samsung_pay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/samsung_pay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Inspection,
) {
  public val paymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions:
      PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions) json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptionsView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Branch>
    get() = buildSet {
      if (inspection.matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions) add(InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Branch.PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2NoMatchException("InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Inspection(
    matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2Inspection(
    matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions = matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions) add("PaymentFlowsPrivatePaymentMethodsSamsungPayPaymentMethodOptions: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
