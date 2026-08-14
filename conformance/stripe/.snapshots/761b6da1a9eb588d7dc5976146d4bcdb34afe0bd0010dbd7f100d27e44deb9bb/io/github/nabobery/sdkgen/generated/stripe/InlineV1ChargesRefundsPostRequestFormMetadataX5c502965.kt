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

public enum class InlineV1ChargesRefundsPostRequestFormMetadataX5c502965Branch {
  Branch1,
  InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10,
}

public sealed class InlineV1ChargesRefundsPostRequestFormMetadataX5c502965DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesRefundsPostRequestFormMetadataX5c502965NoMatchException(
  message: String,
) : InlineV1ChargesRefundsPostRequestFormMetadataX5c502965DecodingException(message)

internal data class InlineV1ChargesRefundsPostRequestFormMetadataX5c502965Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds~1{refund}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds~1{refund}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1ChargesRefundsPostRequestFormMetadataX5c502965.Serializer::class)
public class InlineV1ChargesRefundsPostRequestFormMetadataX5c502965 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ChargesRefundsPostRequestFormMetadataX5c502965Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10:
      InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10) json.decodeFromJsonElement<InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10>(raw) else null }

  public val matchedBranches: Set<InlineV1ChargesRefundsPostRequestFormMetadataX5c502965Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesRefundsPostRequestFormMetadataX5c502965Branch.Branch1)
      if (inspection.matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10) add(InlineV1ChargesRefundsPostRequestFormMetadataX5c502965Branch.InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesRefundsPostRequestFormMetadataX5c502965 {
      val inspection = inspectInlineV1ChargesRefundsPostRequestFormMetadataX5c502965(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesRefundsPostRequestFormMetadataX5c502965NoMatchException("InlineV1ChargesRefundsPostRequestFormMetadataX5c502965 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesRefundsPostRequestFormMetadataX5c502965(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesRefundsPostRequestFormMetadataX5c502965> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesRefundsPostRequestFormMetadataX5c502965 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesRefundsPostRequestFormMetadataX5c502965")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesRefundsPostRequestFormMetadataX5c502965) {
      encoder.requireJsonEncoder("InlineV1ChargesRefundsPostRequestFormMetadataX5c502965").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesRefundsPostRequestFormMetadataX5c502965(element: JsonElement): InlineV1ChargesRefundsPostRequestFormMetadataX5c502965Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10 = element.isJsonDecodable<InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10>()
  return InlineV1ChargesRefundsPostRequestFormMetadataX5c502965Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10 = matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10) add("InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10: value does not match InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
