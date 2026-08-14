package io.github.nabobery.sdkgen.generated

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

public enum class InlineRerankPostRequestJsonDocumentsItemX394b73e2Branch {
  Branch1,
  InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d,
}

public sealed class InlineRerankPostRequestJsonDocumentsItemX394b73e2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineRerankPostRequestJsonDocumentsItemX394b73e2NoMatchException(
  message: String,
) : InlineRerankPostRequestJsonDocumentsItemX394b73e2DecodingException(message)

internal data class InlineRerankPostRequestJsonDocumentsItemX394b73e2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d).count { it }
}

/**
 * A document to rerank. Either a plain string, or a structured object with optional `text` and/or `image`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1rerank/post/requestBody/content/application~1json/schema/properties/documents/i
 * tems
 */
@Serializable(with = InlineRerankPostRequestJsonDocumentsItemX394b73e2.Serializer::class)
public class InlineRerankPostRequestJsonDocumentsItemX394b73e2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineRerankPostRequestJsonDocumentsItemX394b73e2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d:
      InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d) json.decodeFromJsonElement<InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d>(raw) else null }

  public val matchedBranches: Set<InlineRerankPostRequestJsonDocumentsItemX394b73e2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineRerankPostRequestJsonDocumentsItemX394b73e2Branch.Branch1)
      if (inspection.matchesInlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d) add(InlineRerankPostRequestJsonDocumentsItemX394b73e2Branch.InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineRerankPostRequestJsonDocumentsItemX394b73e2 {
      val inspection = inspectInlineRerankPostRequestJsonDocumentsItemX394b73e2(raw)
      if (inspection.matchCount == 0) {
        throw InlineRerankPostRequestJsonDocumentsItemX394b73e2NoMatchException("InlineRerankPostRequestJsonDocumentsItemX394b73e2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineRerankPostRequestJsonDocumentsItemX394b73e2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineRerankPostRequestJsonDocumentsItemX394b73e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRerankPostRequestJsonDocumentsItemX394b73e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRerankPostRequestJsonDocumentsItemX394b73e2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineRerankPostRequestJsonDocumentsItemX394b73e2) {
      encoder.requireJsonEncoder("InlineRerankPostRequestJsonDocumentsItemX394b73e2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineRerankPostRequestJsonDocumentsItemX394b73e2(element: JsonElement): InlineRerankPostRequestJsonDocumentsItemX394b73e2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d = element.isJsonDecodable<InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d>()
  return InlineRerankPostRequestJsonDocumentsItemX394b73e2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d = matchesInlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d) add("InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d: value does not match InlineRerankPostRequestJsonDocumentsItemAnyOf2Xff30bf4d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
