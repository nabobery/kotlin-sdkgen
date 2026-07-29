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

public enum class InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Branch {
  PaymentMethodOptionsAffirm,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Inspection(
  public val matchesPaymentMethodOptionsAffirm: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsAffirm, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/affirm.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/affirm
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Inspection,
) {
  public val paymentMethodOptionsAffirm: PaymentMethodOptionsAffirmView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsAffirm) json.decodeFromJsonElement<PaymentMethodOptionsAffirmView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsAffirm) add(InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Branch.PaymentMethodOptionsAffirm)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5NoMatchException("InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Inspection(
    matchesPaymentMethodOptionsAffirm = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsAffirm: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsAffirm = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5Inspection(
    matchesPaymentMethodOptionsAffirm = matchesPaymentMethodOptionsAffirm,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsAffirm) add("PaymentMethodOptionsAffirm: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
