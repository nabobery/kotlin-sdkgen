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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/metadata
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6) add(InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796Branch.InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6>()
  return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemMetadataXaa288796Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6 = matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6) add("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6: value does not match InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemAnyOf2X5c6068e6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
