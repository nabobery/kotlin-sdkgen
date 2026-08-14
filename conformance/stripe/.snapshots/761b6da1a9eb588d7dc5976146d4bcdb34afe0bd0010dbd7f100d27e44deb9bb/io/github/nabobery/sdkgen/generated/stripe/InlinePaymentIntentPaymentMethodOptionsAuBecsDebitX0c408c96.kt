package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Branch {
  PaymentIntentPaymentMethodOptionsAuBecsDebit,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Inspection(
  public val matchesPaymentIntentPaymentMethodOptionsAuBecsDebit: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentPaymentMethodOptionsAuBecsDebit, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/au_becs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/au_becs_debit
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Inspection,
) {
  public val paymentIntentPaymentMethodOptionsAuBecsDebit:
      PaymentIntentPaymentMethodOptionsAuBecsDebitView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentPaymentMethodOptionsAuBecsDebit) json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsAuBecsDebitView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Branch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentPaymentMethodOptionsAuBecsDebit) add(InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Branch.PaymentIntentPaymentMethodOptionsAuBecsDebit)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96NoMatchException("InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Inspection(
    matchesPaymentIntentPaymentMethodOptionsAuBecsDebit = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentIntentPaymentMethodOptionsAuBecsDebit: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentIntentPaymentMethodOptionsAuBecsDebit = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96Inspection(
    matchesPaymentIntentPaymentMethodOptionsAuBecsDebit = matchesPaymentIntentPaymentMethodOptionsAuBecsDebit,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentIntentPaymentMethodOptionsAuBecsDebit) add("PaymentIntentPaymentMethodOptionsAuBecsDebit: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
