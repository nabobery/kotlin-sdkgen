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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08Branch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/discount_amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/discount_amount
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315) add(InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08Branch.InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315>()
  return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsDiscountAmountX56a79c08Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315 = matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315) add("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315: value does not match InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf2X83aa3315")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
