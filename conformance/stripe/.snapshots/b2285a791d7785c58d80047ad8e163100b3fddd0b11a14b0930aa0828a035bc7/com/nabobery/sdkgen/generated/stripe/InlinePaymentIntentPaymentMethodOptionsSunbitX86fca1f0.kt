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

public enum class InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Branch {
  PaymentMethodOptionsSunbit,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Inspection(
  public val matchesPaymentMethodOptionsSunbit: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsSunbit, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/sunbit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/sunbit
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Inspection,
) {
  public val paymentMethodOptionsSunbit: PaymentMethodOptionsSunbitView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsSunbit) json.decodeFromJsonElement<PaymentMethodOptionsSunbitView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsSunbit) add(InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Branch.PaymentMethodOptionsSunbit)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0NoMatchException("InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Inspection(
    matchesPaymentMethodOptionsSunbit = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsSunbit: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsSunbit = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0Inspection(
    matchesPaymentMethodOptionsSunbit = matchesPaymentMethodOptionsSunbit,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsSunbit) add("PaymentMethodOptionsSunbit: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
