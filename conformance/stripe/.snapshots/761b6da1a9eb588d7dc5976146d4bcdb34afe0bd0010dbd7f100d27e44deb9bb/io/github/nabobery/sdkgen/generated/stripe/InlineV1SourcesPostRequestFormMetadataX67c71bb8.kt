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

public enum class InlineV1SourcesPostRequestFormMetadataX67c71bb8Branch {
  Branch1,
  InlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9,
}

public sealed class InlineV1SourcesPostRequestFormMetadataX67c71bb8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SourcesPostRequestFormMetadataX67c71bb8NoMatchException(
  message: String,
) : InlineV1SourcesPostRequestFormMetadataX67c71bb8DecodingException(message)

internal data class InlineV1SourcesPostRequestFormMetadataX67c71bb8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata
 */
@Serializable(with = InlineV1SourcesPostRequestFormMetadataX67c71bb8.Serializer::class)
public class InlineV1SourcesPostRequestFormMetadataX67c71bb8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SourcesPostRequestFormMetadataX67c71bb8Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9:
      InlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9) json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9>(raw) else null }

  public val matchedBranches: Set<InlineV1SourcesPostRequestFormMetadataX67c71bb8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SourcesPostRequestFormMetadataX67c71bb8Branch.Branch1)
      if (inspection.matchesInlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9) add(InlineV1SourcesPostRequestFormMetadataX67c71bb8Branch.InlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SourcesPostRequestFormMetadataX67c71bb8 {
      val inspection = inspectInlineV1SourcesPostRequestFormMetadataX67c71bb8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SourcesPostRequestFormMetadataX67c71bb8NoMatchException("InlineV1SourcesPostRequestFormMetadataX67c71bb8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SourcesPostRequestFormMetadataX67c71bb8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormMetadataX67c71bb8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMetadataX67c71bb8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormMetadataX67c71bb8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormMetadataX67c71bb8) {
      encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormMetadataX67c71bb8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SourcesPostRequestFormMetadataX67c71bb8(element: JsonElement): InlineV1SourcesPostRequestFormMetadataX67c71bb8Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9 = element.isJsonDecodable<InlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9>()
  return InlineV1SourcesPostRequestFormMetadataX67c71bb8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9 = matchesInlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9) add("InlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9: value does not match InlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
