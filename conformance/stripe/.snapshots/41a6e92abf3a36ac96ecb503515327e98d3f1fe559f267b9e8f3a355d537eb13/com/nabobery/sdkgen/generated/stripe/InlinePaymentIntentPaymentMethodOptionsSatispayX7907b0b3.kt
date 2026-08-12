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

public enum class InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Branch {
  PaymentMethodOptionsSatispay,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Inspection(
  public val matchesPaymentMethodOptionsSatispay: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsSatispay, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/satispay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/satispay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Inspection,
) {
  public val paymentMethodOptionsSatispay: PaymentMethodOptionsSatispayView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsSatispay) json.decodeFromJsonElement<PaymentMethodOptionsSatispayView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsSatispay) add(InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Branch.PaymentMethodOptionsSatispay)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3NoMatchException("InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Inspection(
    matchesPaymentMethodOptionsSatispay = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsSatispay: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsSatispay = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3Inspection(
    matchesPaymentMethodOptionsSatispay = matchesPaymentMethodOptionsSatispay,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsSatispay) add("PaymentMethodOptionsSatispay: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
