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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/discount_amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/discount_amount
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dBranch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dNoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022d(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1DiscountAmountX2f88022dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1AnyOf2Xc9258166")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
