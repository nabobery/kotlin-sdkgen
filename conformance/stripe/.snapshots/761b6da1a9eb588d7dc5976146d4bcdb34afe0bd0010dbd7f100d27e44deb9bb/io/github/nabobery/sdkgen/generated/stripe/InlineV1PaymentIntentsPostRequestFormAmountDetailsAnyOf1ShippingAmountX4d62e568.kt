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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0/properties/amount
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2Xc826f16d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
