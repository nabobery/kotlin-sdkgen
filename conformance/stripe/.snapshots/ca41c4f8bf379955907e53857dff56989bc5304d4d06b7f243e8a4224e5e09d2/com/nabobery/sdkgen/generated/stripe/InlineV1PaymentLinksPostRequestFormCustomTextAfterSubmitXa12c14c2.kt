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

public enum class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2Branch {
  InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f,
  InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207,
}

public sealed class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2Inspection(
  public val matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f:
      Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f, matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text/properties/after_submit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text/properties/after_submit
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2Inspection,
) {
  public val inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f:
      InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207:
      InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f) add(InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2Branch.InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207) add(InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2Branch.InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2NoMatchException("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2(element: JsonElement): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2Inspection {
  val matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f>()
  val matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207>()
  return InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2Inspection(
    matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f = matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f,
    matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207 = matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f) add("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f: value does not match InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f")
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207) add("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207: value does not match InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2Xa0326207")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
