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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448Inspection,
) {
  public val branch1:
      List<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsItemX40536d61>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsItemX40536d61>>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsItemX40536d61>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsX07427448Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsAnyOf2Xd2fdcab9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
