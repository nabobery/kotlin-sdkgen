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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/discount_amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/discount_amount
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountXdefc41d6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsDiscountAmountAnyOf2Xb210ef97")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
