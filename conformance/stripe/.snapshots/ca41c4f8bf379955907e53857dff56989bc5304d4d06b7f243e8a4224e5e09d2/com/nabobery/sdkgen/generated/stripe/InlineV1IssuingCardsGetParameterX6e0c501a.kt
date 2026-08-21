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

public enum class InlineV1IssuingCardsGetParameterX6e0c501aBranch {
  InlineV1IssuingCardsGetParameterAnyOf1X591815e9,
  Branch2,
}

public sealed class InlineV1IssuingCardsGetParameterX6e0c501aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingCardsGetParameterX6e0c501aNoMatchException(
  message: String,
) : InlineV1IssuingCardsGetParameterX6e0c501aDecodingException(message)

internal data class InlineV1IssuingCardsGetParameterX6e0c501aInspection(
  public val matchesInlineV1IssuingCardsGetParameterAnyOf1X591815e9: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingCardsGetParameterAnyOf1X591815e9, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/get/parameters/1/schema
 */
@Serializable(with = InlineV1IssuingCardsGetParameterX6e0c501a.Serializer::class)
public class InlineV1IssuingCardsGetParameterX6e0c501a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingCardsGetParameterX6e0c501aInspection,
) {
  public val inlineV1IssuingCardsGetParameterAnyOf1X591815e9:
      InlineV1IssuingCardsGetParameterAnyOf1X591815e9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingCardsGetParameterAnyOf1X591815e9) json.decodeFromJsonElement<InlineV1IssuingCardsGetParameterAnyOf1X591815e9>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1IssuingCardsGetParameterX6e0c501aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingCardsGetParameterAnyOf1X591815e9) add(InlineV1IssuingCardsGetParameterX6e0c501aBranch.InlineV1IssuingCardsGetParameterAnyOf1X591815e9)
      if (inspection.matchesBranch2) add(InlineV1IssuingCardsGetParameterX6e0c501aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingCardsGetParameterX6e0c501a {
      val inspection = inspectInlineV1IssuingCardsGetParameterX6e0c501a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingCardsGetParameterX6e0c501aNoMatchException("InlineV1IssuingCardsGetParameterX6e0c501a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingCardsGetParameterX6e0c501a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsGetParameterX6e0c501a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsGetParameterX6e0c501a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsGetParameterX6e0c501a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsGetParameterX6e0c501a) {
      encoder.requireJsonEncoder("InlineV1IssuingCardsGetParameterX6e0c501a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingCardsGetParameterX6e0c501a(element: JsonElement): InlineV1IssuingCardsGetParameterX6e0c501aInspection {
  val matchesInlineV1IssuingCardsGetParameterAnyOf1X591815e9 = element.isJsonDecodable<InlineV1IssuingCardsGetParameterAnyOf1X591815e9>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1IssuingCardsGetParameterX6e0c501aInspection(
    matchesInlineV1IssuingCardsGetParameterAnyOf1X591815e9 = matchesInlineV1IssuingCardsGetParameterAnyOf1X591815e9,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1IssuingCardsGetParameterAnyOf1X591815e9) add("InlineV1IssuingCardsGetParameterAnyOf1X591815e9: value does not match InlineV1IssuingCardsGetParameterAnyOf1X591815e9")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
