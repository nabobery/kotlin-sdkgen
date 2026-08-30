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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/blik.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/blik
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1X8084fc3d")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xb40a99d6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
