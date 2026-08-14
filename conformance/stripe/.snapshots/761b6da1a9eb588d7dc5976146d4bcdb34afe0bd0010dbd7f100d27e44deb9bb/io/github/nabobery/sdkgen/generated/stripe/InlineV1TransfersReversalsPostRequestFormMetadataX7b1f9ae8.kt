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

public enum class InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8Branch {
  Branch1,
  InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2,
}

public sealed class InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8NoMatchException(
  message: String,
) : InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8DecodingException(message)

internal data class InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers~1{id}~1reversals/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8.Serializer::class)
public class InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2:
      InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2) json.decodeFromJsonElement<InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2>(raw) else null }

  public val matchedBranches: Set<InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8Branch.Branch1)
      if (inspection.matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2) add(InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8Branch.InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8 {
      val inspection = inspectInlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8NoMatchException("InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8) {
      encoder.requireJsonEncoder("InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8(element: JsonElement): InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2 = element.isJsonDecodable<InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2>()
  return InlineV1TransfersReversalsPostRequestFormMetadataX7b1f9ae8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2 = matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2) add("InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2: value does not match InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
