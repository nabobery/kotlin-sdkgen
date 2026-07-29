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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sofort.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sofort
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xb8bd790d")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xcc445370")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
