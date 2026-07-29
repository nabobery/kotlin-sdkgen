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

public enum class InlinePaymentIntentNextActionXf46d948fBranch {
  PaymentIntentNextAction,
}

public sealed class InlinePaymentIntentNextActionXf46d948fDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentNextActionXf46d948fNoMatchException(
  message: String,
) : InlinePaymentIntentNextActionXf46d948fDecodingException(message)

internal data class InlinePaymentIntentNextActionXf46d948fInspection(
  public val matchesPaymentIntentNextAction: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentNextAction).count { it }
}

/**
 * If present, this property tells you what actions you need to take in order for your customer to fulfill a payment
 * using the provided source.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/next_action
 */
@Serializable(with = InlinePaymentIntentNextActionXf46d948f.Serializer::class)
public class InlinePaymentIntentNextActionXf46d948f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentNextActionXf46d948fInspection,
) {
  public val paymentIntentNextAction: PaymentIntentNextActionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentNextAction) json.decodeFromJsonElement<PaymentIntentNextActionView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentNextActionXf46d948fBranch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentNextAction) add(InlinePaymentIntentNextActionXf46d948fBranch.PaymentIntentNextAction)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentNextActionXf46d948f {
      val inspection = inspectInlinePaymentIntentNextActionXf46d948f(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentNextActionXf46d948fNoMatchException("InlinePaymentIntentNextActionXf46d948f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentNextActionXf46d948f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentNextActionXf46d948f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentNextActionXf46d948f {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentNextActionXf46d948f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentNextActionXf46d948f) {
      encoder.requireJsonEncoder("InlinePaymentIntentNextActionXf46d948f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentNextActionXf46d948f(element: JsonElement): InlinePaymentIntentNextActionXf46d948fInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentNextActionXf46d948fInspection(
    matchesPaymentIntentNextAction = false,
    failures = listOf("PaymentIntentNextAction: expected JSON object"),
  )
  val matchesPaymentIntentNextAction = raw["type"].isString()
  return InlinePaymentIntentNextActionXf46d948fInspection(
    matchesPaymentIntentNextAction = matchesPaymentIntentNextAction,
    failures = buildList {
      if (!matchesPaymentIntentNextAction) add("PaymentIntentNextAction: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
