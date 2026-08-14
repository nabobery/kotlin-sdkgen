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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fBranch {
  Branch1,
  InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961,
}

public sealed class InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fNoMatchException(
  message: String,
) : InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fDecodingException(message)

internal data class InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/discounts
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fInspection,
) {
  public val branch1:
      List<InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf1ItemX9df2cc4d>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf1ItemX9df2cc4d>>(raw) else null }

  public val inlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961) json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961) add(InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fBranch.InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f {
      val inspection = inspectInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fNoMatchException("InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f) {
      encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38f(element: JsonElement): InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf1ItemX9df2cc4d>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961 = element.isJsonDecodable<InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961>()
  return InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsX10cfc38fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961 = matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961) add("InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961: value does not match InlineV1InvoicesAddLinesPostRequestFormLinesItemDiscountsAnyOf2X5d080961")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
