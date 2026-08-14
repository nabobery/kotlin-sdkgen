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

public enum class InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459Branch {
  Branch1,
  InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6,
}

public sealed class InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459NoMatchException(
  message: String,
) : InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459DecodingException(message)

internal data class InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/metadata
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6) json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6) add(InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459Branch.InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459 {
      val inspection = inspectInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459NoMatchException("InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459) {
      encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459(element: JsonElement): InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6 = element.isJsonDecodable<InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6>()
  return InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataX5b202459Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6 = matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6) add("InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6: value does not match InlineV1InvoicesAddLinesPostRequestFormLinesItemMetadataAnyOf2X6e0c32a6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
