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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineRadarEarlyFraudWarningPaymentIntentX11715895Branch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineRadarEarlyFraudWarningPaymentIntentX11715895DecodingException(
  message: String,
) : SerializationException(message)

public class InlineRadarEarlyFraudWarningPaymentIntentX11715895NoMatchException(
  message: String,
) : InlineRadarEarlyFraudWarningPaymentIntentX11715895DecodingException(message)

internal data class InlineRadarEarlyFraudWarningPaymentIntentX11715895Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * ID of the Payment Intent this early fraud warning is for, optionally expanded.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.early_fraud_warning/properties/payment_intent
 */
@Serializable(with = InlineRadarEarlyFraudWarningPaymentIntentX11715895.Serializer::class)
public class InlineRadarEarlyFraudWarningPaymentIntentX11715895 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineRadarEarlyFraudWarningPaymentIntentX11715895Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches: Set<InlineRadarEarlyFraudWarningPaymentIntentX11715895Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineRadarEarlyFraudWarningPaymentIntentX11715895Branch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineRadarEarlyFraudWarningPaymentIntentX11715895Branch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineRadarEarlyFraudWarningPaymentIntentX11715895 {
      val inspection = inspectInlineRadarEarlyFraudWarningPaymentIntentX11715895(raw)
      if (inspection.matchCount == 0) {
        throw InlineRadarEarlyFraudWarningPaymentIntentX11715895NoMatchException("InlineRadarEarlyFraudWarningPaymentIntentX11715895 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineRadarEarlyFraudWarningPaymentIntentX11715895(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineRadarEarlyFraudWarningPaymentIntentX11715895> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRadarEarlyFraudWarningPaymentIntentX11715895 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRadarEarlyFraudWarningPaymentIntentX11715895")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineRadarEarlyFraudWarningPaymentIntentX11715895) {
      encoder.requireJsonEncoder("InlineRadarEarlyFraudWarningPaymentIntentX11715895").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineRadarEarlyFraudWarningPaymentIntentX11715895(element: JsonElement): InlineRadarEarlyFraudWarningPaymentIntentX11715895Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineRadarEarlyFraudWarningPaymentIntentX11715895Inspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentIntent = matchesPaymentIntent,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPaymentIntent) add("PaymentIntent: value does not match PaymentIntent")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
