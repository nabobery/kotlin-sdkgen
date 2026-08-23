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

public enum class InlineV1RefundsGetParameterX7638b41eBranch {
  InlineV1RefundsGetParameterAnyOf1X55aafa1a,
  Branch2,
}

public sealed class InlineV1RefundsGetParameterX7638b41eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1RefundsGetParameterX7638b41eNoMatchException(
  message: String,
) : InlineV1RefundsGetParameterX7638b41eDecodingException(message)

internal data class InlineV1RefundsGetParameterX7638b41eInspection(
  public val matchesInlineV1RefundsGetParameterAnyOf1X55aafa1a: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1RefundsGetParameterAnyOf1X55aafa1a, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1refunds/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1refunds/get/parameters/1/schema
 */
@Serializable(with = InlineV1RefundsGetParameterX7638b41e.Serializer::class)
public class InlineV1RefundsGetParameterX7638b41e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1RefundsGetParameterX7638b41eInspection,
) {
  public val inlineV1RefundsGetParameterAnyOf1X55aafa1a: InlineV1RefundsGetParameterAnyOf1X55aafa1a?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1RefundsGetParameterAnyOf1X55aafa1a) json.decodeFromJsonElement<InlineV1RefundsGetParameterAnyOf1X55aafa1a>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1RefundsGetParameterX7638b41eBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1RefundsGetParameterAnyOf1X55aafa1a) add(InlineV1RefundsGetParameterX7638b41eBranch.InlineV1RefundsGetParameterAnyOf1X55aafa1a)
      if (inspection.matchesBranch2) add(InlineV1RefundsGetParameterX7638b41eBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1RefundsGetParameterX7638b41e {
      val inspection = inspectInlineV1RefundsGetParameterX7638b41e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1RefundsGetParameterX7638b41eNoMatchException("InlineV1RefundsGetParameterX7638b41e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1RefundsGetParameterX7638b41e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1RefundsGetParameterX7638b41e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RefundsGetParameterX7638b41e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RefundsGetParameterX7638b41e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RefundsGetParameterX7638b41e) {
      encoder.requireJsonEncoder("InlineV1RefundsGetParameterX7638b41e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1RefundsGetParameterX7638b41e(element: JsonElement): InlineV1RefundsGetParameterX7638b41eInspection {
  val matchesInlineV1RefundsGetParameterAnyOf1X55aafa1a = element.isJsonDecodable<InlineV1RefundsGetParameterAnyOf1X55aafa1a>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1RefundsGetParameterX7638b41eInspection(
    matchesInlineV1RefundsGetParameterAnyOf1X55aafa1a = matchesInlineV1RefundsGetParameterAnyOf1X55aafa1a,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1RefundsGetParameterAnyOf1X55aafa1a) add("InlineV1RefundsGetParameterAnyOf1X55aafa1a: value does not match InlineV1RefundsGetParameterAnyOf1X55aafa1a")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
