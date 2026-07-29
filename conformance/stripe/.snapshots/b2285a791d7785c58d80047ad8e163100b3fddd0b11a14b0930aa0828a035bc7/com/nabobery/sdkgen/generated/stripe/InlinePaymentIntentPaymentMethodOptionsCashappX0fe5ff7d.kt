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

public enum class InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dBranch {
  PaymentMethodOptionsCashapp,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dNoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dInspection(
  public val matchesPaymentMethodOptionsCashapp: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsCashapp, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/cashapp.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/cashapp
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dInspection,
) {
  public val paymentMethodOptionsCashapp: PaymentMethodOptionsCashappView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsCashapp) json.decodeFromJsonElement<PaymentMethodOptionsCashappView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsCashapp) add(InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dBranch.PaymentMethodOptionsCashapp)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dNoMatchException("InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dInspection(
    matchesPaymentMethodOptionsCashapp = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsCashapp: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsCashapp = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7dInspection(
    matchesPaymentMethodOptionsCashapp = matchesPaymentMethodOptionsCashapp,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsCashapp) add("PaymentMethodOptionsCashapp: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
