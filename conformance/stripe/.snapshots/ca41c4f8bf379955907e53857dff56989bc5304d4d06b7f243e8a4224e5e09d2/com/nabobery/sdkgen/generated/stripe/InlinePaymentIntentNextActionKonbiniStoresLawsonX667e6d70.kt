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

public enum class InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70Branch {
  PaymentIntentNextActionKonbiniLawson,
}

public sealed class InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70NoMatchException(
  message: String,
) : InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70DecodingException(message)

internal data class InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70Inspection(
  public val matchesPaymentIntentNextActionKonbiniLawson: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentNextActionKonbiniLawson).count { it }
}

/**
 * Lawson instruction details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_konbini_stores/properties/lawson
 */
@Serializable(with = InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70.Serializer::class)
public class InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70Inspection,
) {
  public val paymentIntentNextActionKonbiniLawson: PaymentIntentNextActionKonbiniLawsonView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentNextActionKonbiniLawson) json.decodeFromJsonElement<PaymentIntentNextActionKonbiniLawsonView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70Branch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentNextActionKonbiniLawson) add(InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70Branch.PaymentIntentNextActionKonbiniLawson)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70 {
      val inspection = inspectInlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70NoMatchException("InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70) {
      encoder.requireJsonEncoder("InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70(element: JsonElement): InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70Inspection(
    matchesPaymentIntentNextActionKonbiniLawson = false,
    failures = listOf("PaymentIntentNextActionKonbiniLawson: expected JSON object"),
  )
  val matchesPaymentIntentNextActionKonbiniLawson = raw["payment_code"].isString()
  return InlinePaymentIntentNextActionKonbiniStoresLawsonX667e6d70Inspection(
    matchesPaymentIntentNextActionKonbiniLawson = matchesPaymentIntentNextActionKonbiniLawson,
    failures = buildList {
      if (!matchesPaymentIntentNextActionKonbiniLawson) add("PaymentIntentNextActionKonbiniLawson: required properties 'payment_code' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
