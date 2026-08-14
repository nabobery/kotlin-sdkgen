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

public enum class InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6Branch {
  Branch1,
  InlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54,
}

public sealed class InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6NoMatchException(
  message: String,
) : InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6DecodingException(message)

internal data class InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1files/post/requestBody/content/multipart~1form-data/schema/properties/file_
 * link_data/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1files/post/requestBody/content/multipart~1form-data/schema/properties/file_
 * link_data/properties/metadata
 */
@Serializable(with = InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6.Serializer::class)
public class InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54:
      InlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54) json.decodeFromJsonElement<InlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54>(raw) else null }

  public val matchedBranches:
      Set<InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6Branch.Branch1)
      if (inspection.matchesInlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54) add(InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6Branch.InlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6 {
      val inspection = inspectInlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6NoMatchException("InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6) {
      encoder.requireJsonEncoder("InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6(element: JsonElement): InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54 = element.isJsonDecodable<InlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54>()
  return InlineV1FilesPostRequestMultipartFileLinkDataMetadataXf40108f6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54 = matchesInlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54) add("InlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54: value does not match InlineV1FilesPostRequestMultipartFileLinkDataMetadataAnyOf2X446d0d54")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
