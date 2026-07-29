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

public enum class InlineV1InvoicesPostRequestFormDiscountsXf910c8f0Branch {
  Branch1,
  InlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b,
}

public sealed class InlineV1InvoicesPostRequestFormDiscountsXf910c8f0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormDiscountsXf910c8f0NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormDiscountsXf910c8f0DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormDiscountsXf910c8f0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b).count { it }
}

/**
 * The coupons and promotion codes to redeem into discounts for the invoice. If not specified, inherits the discount
 * from the invoice's customer. Pass an empty string to avoid inheriting any discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/discounts
 */
@Serializable(with = InlineV1InvoicesPostRequestFormDiscountsXf910c8f0.Serializer::class)
public class InlineV1InvoicesPostRequestFormDiscountsXf910c8f0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormDiscountsXf910c8f0Inspection,
) {
  public val branch1: List<InlineV1InvoicesPostRequestFormDiscountsAnyOf1ItemXa85f6adb>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormDiscountsAnyOf1ItemXa85f6adb>>(raw) else null }

  public val inlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b:
      InlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormDiscountsXf910c8f0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormDiscountsXf910c8f0Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b) add(InlineV1InvoicesPostRequestFormDiscountsXf910c8f0Branch.InlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormDiscountsXf910c8f0 {
      val inspection = inspectInlineV1InvoicesPostRequestFormDiscountsXf910c8f0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormDiscountsXf910c8f0NoMatchException("InlineV1InvoicesPostRequestFormDiscountsXf910c8f0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormDiscountsXf910c8f0(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormDiscountsXf910c8f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormDiscountsXf910c8f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormDiscountsXf910c8f0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormDiscountsXf910c8f0) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormDiscountsXf910c8f0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormDiscountsXf910c8f0(element: JsonElement): InlineV1InvoicesPostRequestFormDiscountsXf910c8f0Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesPostRequestFormDiscountsAnyOf1ItemXa85f6adb>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b = element.isJsonDecodable<InlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b>()
  return InlineV1InvoicesPostRequestFormDiscountsXf910c8f0Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b = matchesInlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b) add("InlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b: value does not match InlineV1InvoicesPostRequestFormDiscountsAnyOf2X934dc46b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
