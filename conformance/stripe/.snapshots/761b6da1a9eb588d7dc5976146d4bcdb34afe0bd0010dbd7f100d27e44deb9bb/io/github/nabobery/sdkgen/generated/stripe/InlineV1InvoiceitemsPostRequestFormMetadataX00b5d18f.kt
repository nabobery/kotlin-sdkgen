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

public enum class InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fBranch {
  Branch1,
  InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6,
}

public sealed class InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fNoMatchException(
  message: String,
) : InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fDecodingException(message)

internal data class InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/metadata
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6:
      InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6) json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fBranch.Branch1)
      if (inspection.matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6) add(InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fBranch.InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f {
      val inspection = inspectInlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fNoMatchException("InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f) {
      encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoiceitemsPostRequestFormMetadataX00b5d18f(element: JsonElement): InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6 = element.isJsonDecodable<InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6>()
  return InlineV1InvoiceitemsPostRequestFormMetadataX00b5d18fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6 = matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6) add("InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6: value does not match InlineV1InvoiceitemsPostRequestFormMetadataAnyOf2X28e7aec6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
