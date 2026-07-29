package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1SourcesPostRequestFormMandateAmountXabd4847dBranch {
  Branch1,
  InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257,
}

public sealed class InlineV1SourcesPostRequestFormMandateAmountXabd4847dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SourcesPostRequestFormMandateAmountXabd4847dNoMatchException(
  message: String,
) : InlineV1SourcesPostRequestFormMandateAmountXabd4847dDecodingException(message)

internal data class InlineV1SourcesPostRequestFormMandateAmountXabd4847dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/amount
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAmountXabd4847d.Serializer::class)
public class InlineV1SourcesPostRequestFormMandateAmountXabd4847d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SourcesPostRequestFormMandateAmountXabd4847dInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257:
      InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257) json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257>(raw) else null }

  public val matchedBranches: Set<InlineV1SourcesPostRequestFormMandateAmountXabd4847dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SourcesPostRequestFormMandateAmountXabd4847dBranch.Branch1)
      if (inspection.matchesInlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257) add(InlineV1SourcesPostRequestFormMandateAmountXabd4847dBranch.InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SourcesPostRequestFormMandateAmountXabd4847d {
      val inspection = inspectInlineV1SourcesPostRequestFormMandateAmountXabd4847d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SourcesPostRequestFormMandateAmountXabd4847dNoMatchException("InlineV1SourcesPostRequestFormMandateAmountXabd4847d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SourcesPostRequestFormMandateAmountXabd4847d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAmountXabd4847d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAmountXabd4847d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormMandateAmountXabd4847d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormMandateAmountXabd4847d) {
      encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormMandateAmountXabd4847d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SourcesPostRequestFormMandateAmountXabd4847d(element: JsonElement): InlineV1SourcesPostRequestFormMandateAmountXabd4847dInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257 = element.isJsonDecodable<InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257>()
  return InlineV1SourcesPostRequestFormMandateAmountXabd4847dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257 = matchesInlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257) add("InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257: value does not match InlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
