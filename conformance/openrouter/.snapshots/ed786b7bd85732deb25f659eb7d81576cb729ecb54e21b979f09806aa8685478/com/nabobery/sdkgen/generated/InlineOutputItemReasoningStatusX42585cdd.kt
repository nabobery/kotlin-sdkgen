package com.nabobery.sdkgen.generated

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

public enum class InlineOutputItemReasoningStatusX42585cddBranch {
  InlineOutputItemReasoningStatusAnyOf1X13b74de8,
  InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf,
  InlineOutputItemReasoningStatusAnyOf3Xd69a3468,
}

public sealed class InlineOutputItemReasoningStatusX42585cddDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOutputItemReasoningStatusX42585cddNoMatchException(
  message: String,
) : InlineOutputItemReasoningStatusX42585cddDecodingException(message)

internal data class InlineOutputItemReasoningStatusX42585cddInspection(
  public val matchesInlineOutputItemReasoningStatusAnyOf1X13b74de8: Boolean,
  public val matchesInlineOutputItemReasoningStatusAnyOf2Xf87bb7bf: Boolean,
  public val matchesInlineOutputItemReasoningStatusAnyOf3Xd69a3468: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineOutputItemReasoningStatusAnyOf1X13b74de8, matchesInlineOutputItemReasoningStatusAnyOf2Xf87bb7bf, matchesInlineOutputItemReasoningStatusAnyOf3Xd69a3468).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status
 */
@Serializable(with = InlineOutputItemReasoningStatusX42585cdd.Serializer::class)
public class InlineOutputItemReasoningStatusX42585cdd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOutputItemReasoningStatusX42585cddInspection,
) {
  public val inlineOutputItemReasoningStatusAnyOf1X13b74de8:
      InlineOutputItemReasoningStatusAnyOf1X13b74de8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputItemReasoningStatusAnyOf1X13b74de8) json.decodeFromJsonElement<InlineOutputItemReasoningStatusAnyOf1X13b74de8>(raw) else null }

  public val inlineOutputItemReasoningStatusAnyOf2Xf87bb7bf:
      InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputItemReasoningStatusAnyOf2Xf87bb7bf) json.decodeFromJsonElement<InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf>(raw) else null }

  public val inlineOutputItemReasoningStatusAnyOf3Xd69a3468:
      InlineOutputItemReasoningStatusAnyOf3Xd69a3468? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputItemReasoningStatusAnyOf3Xd69a3468) json.decodeFromJsonElement<InlineOutputItemReasoningStatusAnyOf3Xd69a3468>(raw) else null }

  public val matchedBranches: Set<InlineOutputItemReasoningStatusX42585cddBranch>
    get() = buildSet {
      if (inspection.matchesInlineOutputItemReasoningStatusAnyOf1X13b74de8) add(InlineOutputItemReasoningStatusX42585cddBranch.InlineOutputItemReasoningStatusAnyOf1X13b74de8)
      if (inspection.matchesInlineOutputItemReasoningStatusAnyOf2Xf87bb7bf) add(InlineOutputItemReasoningStatusX42585cddBranch.InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf)
      if (inspection.matchesInlineOutputItemReasoningStatusAnyOf3Xd69a3468) add(InlineOutputItemReasoningStatusX42585cddBranch.InlineOutputItemReasoningStatusAnyOf3Xd69a3468)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOutputItemReasoningStatusX42585cdd {
      val inspection = inspectInlineOutputItemReasoningStatusX42585cdd(raw)
      if (inspection.matchCount == 0) {
        throw InlineOutputItemReasoningStatusX42585cddNoMatchException("InlineOutputItemReasoningStatusX42585cdd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOutputItemReasoningStatusX42585cdd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemReasoningStatusX42585cdd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputItemReasoningStatusX42585cdd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputItemReasoningStatusX42585cdd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemReasoningStatusX42585cdd) {
      encoder.requireJsonEncoder("InlineOutputItemReasoningStatusX42585cdd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOutputItemReasoningStatusX42585cdd(element: JsonElement): InlineOutputItemReasoningStatusX42585cddInspection {
  val matchesInlineOutputItemReasoningStatusAnyOf1X13b74de8 = element.isJsonDecodable<InlineOutputItemReasoningStatusAnyOf1X13b74de8>()
  val matchesInlineOutputItemReasoningStatusAnyOf2Xf87bb7bf = element.isJsonDecodable<InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf>()
  val matchesInlineOutputItemReasoningStatusAnyOf3Xd69a3468 = element.isJsonDecodable<InlineOutputItemReasoningStatusAnyOf3Xd69a3468>()
  return InlineOutputItemReasoningStatusX42585cddInspection(
    matchesInlineOutputItemReasoningStatusAnyOf1X13b74de8 = matchesInlineOutputItemReasoningStatusAnyOf1X13b74de8,
    matchesInlineOutputItemReasoningStatusAnyOf2Xf87bb7bf = matchesInlineOutputItemReasoningStatusAnyOf2Xf87bb7bf,
    matchesInlineOutputItemReasoningStatusAnyOf3Xd69a3468 = matchesInlineOutputItemReasoningStatusAnyOf3Xd69a3468,
    failures = buildList {
      if (!matchesInlineOutputItemReasoningStatusAnyOf1X13b74de8) add("InlineOutputItemReasoningStatusAnyOf1X13b74de8: value does not match InlineOutputItemReasoningStatusAnyOf1X13b74de8")
      if (!matchesInlineOutputItemReasoningStatusAnyOf2Xf87bb7bf) add("InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf: value does not match InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf")
      if (!matchesInlineOutputItemReasoningStatusAnyOf3Xd69a3468) add("InlineOutputItemReasoningStatusAnyOf3Xd69a3468: value does not match InlineOutputItemReasoningStatusAnyOf3Xd69a3468")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
