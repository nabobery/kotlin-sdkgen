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

public enum class InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22Branch {
  Branch1,
  InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d,
}

public sealed class InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22NoMatchException(
  message: String,
) : InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22DecodingException(message)

internal data class InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refund/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22.Serializer::class)
public class InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d:
      InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d) json.decodeFromJsonElement<InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d>(raw) else null }

  public val matchedBranches: Set<InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22Branch.Branch1)
      if (inspection.matchesInlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d) add(InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22Branch.InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22 {
      val inspection = inspectInlineV1ChargesRefundPostRequestFormMetadataXa66ffa22(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22NoMatchException("InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22) {
      encoder.requireJsonEncoder("InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesRefundPostRequestFormMetadataXa66ffa22(element: JsonElement): InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d = element.isJsonDecodable<InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d>()
  return InlineV1ChargesRefundPostRequestFormMetadataXa66ffa22Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d = matchesInlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d) add("InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d: value does not match InlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
