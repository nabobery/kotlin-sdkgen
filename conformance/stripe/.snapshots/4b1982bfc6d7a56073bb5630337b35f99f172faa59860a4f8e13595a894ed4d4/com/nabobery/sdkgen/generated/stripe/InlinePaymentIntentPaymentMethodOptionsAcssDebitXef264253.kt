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

public enum class InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Branch {
  PaymentIntentPaymentMethodOptionsAcssDebit,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Inspection(
  public val matchesPaymentIntentPaymentMethodOptionsAcssDebit: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentPaymentMethodOptionsAcssDebit, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/acss_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/acss_debit
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Inspection,
) {
  public val paymentIntentPaymentMethodOptionsAcssDebit:
      PaymentIntentPaymentMethodOptionsAcssDebitView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentPaymentMethodOptionsAcssDebit) json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsAcssDebitView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Branch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentPaymentMethodOptionsAcssDebit) add(InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Branch.PaymentIntentPaymentMethodOptionsAcssDebit)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253NoMatchException("InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Inspection(
    matchesPaymentIntentPaymentMethodOptionsAcssDebit = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentIntentPaymentMethodOptionsAcssDebit: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentIntentPaymentMethodOptionsAcssDebit = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253Inspection(
    matchesPaymentIntentPaymentMethodOptionsAcssDebit = matchesPaymentIntentPaymentMethodOptionsAcssDebit,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentIntentPaymentMethodOptionsAcssDebit) add("PaymentIntentPaymentMethodOptionsAcssDebit: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
