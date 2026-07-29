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

public enum class InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Branch {
  PaymentMethodOptionsMultibanco,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Inspection(
  public val matchesPaymentMethodOptionsMultibanco: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsMultibanco, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/multibanco.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/multibanco
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Inspection,
) {
  public val paymentMethodOptionsMultibanco: PaymentMethodOptionsMultibancoView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsMultibanco) json.decodeFromJsonElement<PaymentMethodOptionsMultibancoView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsMultibanco) add(InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Branch.PaymentMethodOptionsMultibanco)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1NoMatchException("InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Inspection(
    matchesPaymentMethodOptionsMultibanco = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsMultibanco: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsMultibanco = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1Inspection(
    matchesPaymentMethodOptionsMultibanco = matchesPaymentMethodOptionsMultibanco,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsMultibanco) add("PaymentMethodOptionsMultibanco: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
