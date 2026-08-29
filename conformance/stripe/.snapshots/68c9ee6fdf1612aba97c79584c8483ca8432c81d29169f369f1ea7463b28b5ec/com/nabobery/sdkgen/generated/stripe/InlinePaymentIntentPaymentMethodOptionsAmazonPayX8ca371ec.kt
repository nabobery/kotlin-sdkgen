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

public enum class InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecBranch {
  PaymentMethodOptionsAmazonPay,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecNoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecInspection(
  public val matchesPaymentMethodOptionsAmazonPay: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsAmazonPay, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/amazon_pay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/amazon_pay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecInspection,
) {
  public val paymentMethodOptionsAmazonPay: PaymentMethodOptionsAmazonPayView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsAmazonPay) json.decodeFromJsonElement<PaymentMethodOptionsAmazonPayView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsAmazonPay) add(InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecBranch.PaymentMethodOptionsAmazonPay)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecNoMatchException("InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecInspection(
    matchesPaymentMethodOptionsAmazonPay = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsAmazonPay: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsAmazonPay = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ecInspection(
    matchesPaymentMethodOptionsAmazonPay = matchesPaymentMethodOptionsAmazonPay,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsAmazonPay) add("PaymentMethodOptionsAmazonPay: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
