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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineChargePaymentIntentX8b049512Branch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineChargePaymentIntentX8b049512DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargePaymentIntentX8b049512NoMatchException(
  message: String,
) : InlineChargePaymentIntentX8b049512DecodingException(message)

internal data class InlineChargePaymentIntentX8b049512Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * ID of the PaymentIntent associated with this charge, if one exists.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/payment_intent
 */
@Serializable(with = InlineChargePaymentIntentX8b049512.Serializer::class)
public class InlineChargePaymentIntentX8b049512 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargePaymentIntentX8b049512Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches: Set<InlineChargePaymentIntentX8b049512Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargePaymentIntentX8b049512Branch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineChargePaymentIntentX8b049512Branch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargePaymentIntentX8b049512 {
      val inspection = inspectInlineChargePaymentIntentX8b049512(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargePaymentIntentX8b049512NoMatchException("InlineChargePaymentIntentX8b049512 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargePaymentIntentX8b049512(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChargePaymentIntentX8b049512> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargePaymentIntentX8b049512 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargePaymentIntentX8b049512")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargePaymentIntentX8b049512) {
      encoder.requireJsonEncoder("InlineChargePaymentIntentX8b049512").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargePaymentIntentX8b049512(element: JsonElement): InlineChargePaymentIntentX8b049512Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineChargePaymentIntentX8b049512Inspection(
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
