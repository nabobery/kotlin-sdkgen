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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10Branch {
  Branch1,
  InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf,
}

public sealed class InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10NoMatchException(
  message: String,
) : InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10DecodingException(message)

internal data class InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/invoice_metadata
 */
@Serializable(with = InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10.Serializer::class)
public class InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf:
      InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf) json.decodeFromJsonElement<InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf) add(InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10Branch.InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10 {
      val inspection = inspectInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10NoMatchException("InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10) {
      encoder.requireJsonEncoder("InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10(element: JsonElement): InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf = element.isJsonDecodable<InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf>()
  return InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataXdbc0ce10Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf = matchesInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf) add("InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf: value does not match InlineV1InvoicesRemoveLinesPostRequestFormInvoiceMetadataAnyOf2X0a804ddf")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
