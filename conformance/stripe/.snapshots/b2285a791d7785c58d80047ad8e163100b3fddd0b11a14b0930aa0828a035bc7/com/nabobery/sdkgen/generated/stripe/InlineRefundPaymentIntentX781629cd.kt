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

public enum class InlineRefundPaymentIntentX781629cdBranch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineRefundPaymentIntentX781629cdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineRefundPaymentIntentX781629cdNoMatchException(
  message: String,
) : InlineRefundPaymentIntentX781629cdDecodingException(message)

internal data class InlineRefundPaymentIntentX781629cdInspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * ID of the PaymentIntent that's refunded.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund/properties/payment_intent
 */
@Serializable(with = InlineRefundPaymentIntentX781629cd.Serializer::class)
public class InlineRefundPaymentIntentX781629cd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineRefundPaymentIntentX781629cdInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches: Set<InlineRefundPaymentIntentX781629cdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineRefundPaymentIntentX781629cdBranch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineRefundPaymentIntentX781629cdBranch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineRefundPaymentIntentX781629cd {
      val inspection = inspectInlineRefundPaymentIntentX781629cd(raw)
      if (inspection.matchCount == 0) {
        throw InlineRefundPaymentIntentX781629cdNoMatchException("InlineRefundPaymentIntentX781629cd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineRefundPaymentIntentX781629cd(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineRefundPaymentIntentX781629cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRefundPaymentIntentX781629cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRefundPaymentIntentX781629cd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineRefundPaymentIntentX781629cd) {
      encoder.requireJsonEncoder("InlineRefundPaymentIntentX781629cd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineRefundPaymentIntentX781629cd(element: JsonElement): InlineRefundPaymentIntentX781629cdInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineRefundPaymentIntentX781629cdInspection(
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
