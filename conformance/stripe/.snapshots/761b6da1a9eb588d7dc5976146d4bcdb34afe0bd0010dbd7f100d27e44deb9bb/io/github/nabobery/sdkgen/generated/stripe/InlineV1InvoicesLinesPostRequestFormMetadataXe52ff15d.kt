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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dBranch {
  Branch1,
  InlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c,
}

public sealed class InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dNoMatchException(
  message: String,
) : InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dDecodingException(message)

internal data class InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`. For
 * [type=subscription](/api/invoices/line_item) line items, the incoming metadata specified on the request is directly
 * used to set this value, in contrast to [type=invoiceitem](/api/invoices/line_item) line items, where any existing
 * metadata on the invoice line is merged with the incoming data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c:
      InlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c) json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c) add(InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dBranch.InlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d {
      val inspection = inspectInlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dNoMatchException("InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d) {
      encoder.requireJsonEncoder("InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesLinesPostRequestFormMetadataXe52ff15d(element: JsonElement): InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c = element.isJsonDecodable<InlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c>()
  return InlineV1InvoicesLinesPostRequestFormMetadataXe52ff15dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c = matchesInlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c) add("InlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c: value does not match InlineV1InvoicesLinesPostRequestFormMetadataAnyOf2X524ea29c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
