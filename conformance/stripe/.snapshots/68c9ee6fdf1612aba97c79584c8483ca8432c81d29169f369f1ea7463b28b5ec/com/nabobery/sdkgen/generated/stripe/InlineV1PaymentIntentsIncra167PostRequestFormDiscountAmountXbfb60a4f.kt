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

public enum class InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fBranch {
  Branch1,
  InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98,
}

public sealed class InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fNoMatchException(
  message: String,
) : InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fDecodingException(message)

internal data class InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/discount_amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/discount_amount
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98) json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98) add(InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fBranch.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f {
      val inspection = inspectInlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fNoMatchException("InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4f(element: JsonElement): InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98 = element.isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98>()
  return InlineV1PaymentIntentsIncra167PostRequestFormDiscountAmountXbfb60a4fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98 = matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98) add("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98: value does not match InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X019c1d98")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
