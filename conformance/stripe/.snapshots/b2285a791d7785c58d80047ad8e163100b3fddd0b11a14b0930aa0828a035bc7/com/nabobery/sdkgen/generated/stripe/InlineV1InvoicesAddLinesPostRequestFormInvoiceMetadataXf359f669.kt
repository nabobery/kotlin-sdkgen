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

public enum class InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669Branch {
  Branch1,
  InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b,
}

public sealed class InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669NoMatchException(
  message: String,
) : InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669DecodingException(message)

internal data class InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/invoice_metadata
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b:
      InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b) json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b) add(InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669Branch.InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669 {
      val inspection = inspectInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669NoMatchException("InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669) {
      encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669(element: JsonElement): InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b = element.isJsonDecodable<InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b>()
  return InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataXf359f669Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b = matchesInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b) add("InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b: value does not match InlineV1InvoicesAddLinesPostRequestFormInvoiceMetadataAnyOf2X3290de5b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
