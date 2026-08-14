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

public enum class InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6Branch {
  Branch1,
  InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e,
}

public sealed class InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6NoMatchException(
  message: String,
) : InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6DecodingException(message)

internal data class InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e:
      InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e) json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6Branch.Branch1)
      if (inspection.matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e) add(InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6Branch.InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6 {
      val inspection = inspectInlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6NoMatchException("InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6) {
      encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6(element: JsonElement): InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e = element.isJsonDecodable<InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e>()
  return InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e = matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e) add("InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e: value does not match InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X73255d4e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
