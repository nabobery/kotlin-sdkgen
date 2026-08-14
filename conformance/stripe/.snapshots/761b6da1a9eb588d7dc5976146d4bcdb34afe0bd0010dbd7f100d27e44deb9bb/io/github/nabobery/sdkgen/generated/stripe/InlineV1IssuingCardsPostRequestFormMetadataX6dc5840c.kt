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

public enum class InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cBranch {
  Branch1,
  InlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3,
}

public sealed class InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cNoMatchException(
  message: String,
) : InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cDecodingException(message)

internal data class InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/metadata
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3:
      InlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3) json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3>(raw) else null }

  public val matchedBranches: Set<InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cBranch.Branch1)
      if (inspection.matchesInlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3) add(InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cBranch.InlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c {
      val inspection = inspectInlineV1IssuingCardsPostRequestFormMetadataX6dc5840c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cNoMatchException("InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c) {
      encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingCardsPostRequestFormMetadataX6dc5840c(element: JsonElement): InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3 = element.isJsonDecodable<InlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3>()
  return InlineV1IssuingCardsPostRequestFormMetadataX6dc5840cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3 = matchesInlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3) add("InlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3: value does not match InlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
