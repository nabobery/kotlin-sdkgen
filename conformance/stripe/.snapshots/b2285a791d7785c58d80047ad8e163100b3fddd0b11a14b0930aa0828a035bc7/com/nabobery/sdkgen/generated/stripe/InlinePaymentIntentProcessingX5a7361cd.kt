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

public enum class InlinePaymentIntentProcessingX5a7361cdBranch {
  PaymentIntentProcessing,
}

public sealed class InlinePaymentIntentProcessingX5a7361cdDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentProcessingX5a7361cdNoMatchException(
  message: String,
) : InlinePaymentIntentProcessingX5a7361cdDecodingException(message)

internal data class InlinePaymentIntentProcessingX5a7361cdInspection(
  public val matchesPaymentIntentProcessing: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentProcessing).count { it }
}

/**
 * If present, this property tells you about the processing state of the payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/processing
 */
@Serializable(with = InlinePaymentIntentProcessingX5a7361cd.Serializer::class)
public class InlinePaymentIntentProcessingX5a7361cd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentProcessingX5a7361cdInspection,
) {
  public val paymentIntentProcessing: PaymentIntentProcessingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentProcessing) json.decodeFromJsonElement<PaymentIntentProcessingView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentProcessingX5a7361cdBranch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentProcessing) add(InlinePaymentIntentProcessingX5a7361cdBranch.PaymentIntentProcessing)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentProcessingX5a7361cd {
      val inspection = inspectInlinePaymentIntentProcessingX5a7361cd(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentProcessingX5a7361cdNoMatchException("InlinePaymentIntentProcessingX5a7361cd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentProcessingX5a7361cd(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentProcessingX5a7361cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentProcessingX5a7361cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentProcessingX5a7361cd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentProcessingX5a7361cd) {
      encoder.requireJsonEncoder("InlinePaymentIntentProcessingX5a7361cd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentProcessingX5a7361cd(element: JsonElement): InlinePaymentIntentProcessingX5a7361cdInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentProcessingX5a7361cdInspection(
    matchesPaymentIntentProcessing = false,
    failures = listOf("PaymentIntentProcessing: expected JSON object"),
  )
  val matchesPaymentIntentProcessing = raw["type"] != null
  return InlinePaymentIntentProcessingX5a7361cdInspection(
    matchesPaymentIntentProcessing = matchesPaymentIntentProcessing,
    failures = buildList {
      if (!matchesPaymentIntentProcessing) add("PaymentIntentProcessing: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
