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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/mb_way.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/mb_way
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X993a8df0")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf2X8d2b3519")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
