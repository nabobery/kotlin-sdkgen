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

public enum class InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Branch {
  PaymentMethodOptionsPromptpay,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Inspection(
  public val matchesPaymentMethodOptionsPromptpay: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsPromptpay, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/promptpay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/promptpay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Inspection,
) {
  public val paymentMethodOptionsPromptpay: PaymentMethodOptionsPromptpayView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsPromptpay) json.decodeFromJsonElement<PaymentMethodOptionsPromptpayView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsPromptpay) add(InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Branch.PaymentMethodOptionsPromptpay)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19NoMatchException("InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Inspection(
    matchesPaymentMethodOptionsPromptpay = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsPromptpay: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsPromptpay = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19Inspection(
    matchesPaymentMethodOptionsPromptpay = matchesPaymentMethodOptionsPromptpay,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsPromptpay) add("PaymentMethodOptionsPromptpay: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
