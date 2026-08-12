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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f).count { it }
}

/**
 * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented
 * with the branding and support information of the specified account. See the [Invoices with
 * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/on_behalf_of
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f:
      InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f) add(InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86Branch.InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f>()
  return InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f = matchesInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f) add("InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f: value does not match InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfAnyOf2Xa7a31c0f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
