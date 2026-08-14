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

public enum class InlineV1PayoutsPostRequestFormMetadataX1f23cef5Branch {
  Branch1,
  InlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142,
}

public sealed class InlineV1PayoutsPostRequestFormMetadataX1f23cef5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PayoutsPostRequestFormMetadataX1f23cef5NoMatchException(
  message: String,
) : InlineV1PayoutsPostRequestFormMetadataX1f23cef5DecodingException(message)

internal data class InlineV1PayoutsPostRequestFormMetadataX1f23cef5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payouts~1{payout}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata
 */
@Serializable(with = InlineV1PayoutsPostRequestFormMetadataX1f23cef5.Serializer::class)
public class InlineV1PayoutsPostRequestFormMetadataX1f23cef5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PayoutsPostRequestFormMetadataX1f23cef5Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142:
      InlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142) json.decodeFromJsonElement<InlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142>(raw) else null }

  public val matchedBranches: Set<InlineV1PayoutsPostRequestFormMetadataX1f23cef5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PayoutsPostRequestFormMetadataX1f23cef5Branch.Branch1)
      if (inspection.matchesInlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142) add(InlineV1PayoutsPostRequestFormMetadataX1f23cef5Branch.InlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PayoutsPostRequestFormMetadataX1f23cef5 {
      val inspection = inspectInlineV1PayoutsPostRequestFormMetadataX1f23cef5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PayoutsPostRequestFormMetadataX1f23cef5NoMatchException("InlineV1PayoutsPostRequestFormMetadataX1f23cef5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PayoutsPostRequestFormMetadataX1f23cef5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PayoutsPostRequestFormMetadataX1f23cef5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PayoutsPostRequestFormMetadataX1f23cef5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PayoutsPostRequestFormMetadataX1f23cef5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PayoutsPostRequestFormMetadataX1f23cef5) {
      encoder.requireJsonEncoder("InlineV1PayoutsPostRequestFormMetadataX1f23cef5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PayoutsPostRequestFormMetadataX1f23cef5(element: JsonElement): InlineV1PayoutsPostRequestFormMetadataX1f23cef5Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142 = element.isJsonDecodable<InlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142>()
  return InlineV1PayoutsPostRequestFormMetadataX1f23cef5Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142 = matchesInlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142) add("InlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142: value does not match InlineV1PayoutsPostRequestFormMetadataAnyOf2X8048c142")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
