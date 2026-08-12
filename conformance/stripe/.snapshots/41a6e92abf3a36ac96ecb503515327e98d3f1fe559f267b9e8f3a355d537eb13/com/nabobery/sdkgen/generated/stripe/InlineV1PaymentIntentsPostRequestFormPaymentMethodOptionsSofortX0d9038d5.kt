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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sofort.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sofort
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf1Xbcbecea8")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortAnyOf2Xfc5d0dab")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
