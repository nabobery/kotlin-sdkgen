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

public enum class InlineV1EventsGetParameterX0238b28fBranch {
  InlineV1EventsGetParameterAnyOf1X806f5237,
  Branch2,
}

public sealed class InlineV1EventsGetParameterX0238b28fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1EventsGetParameterX0238b28fNoMatchException(
  message: String,
) : InlineV1EventsGetParameterX0238b28fDecodingException(message)

internal data class InlineV1EventsGetParameterX0238b28fInspection(
  public val matchesInlineV1EventsGetParameterAnyOf1X806f5237: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1EventsGetParameterAnyOf1X806f5237, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1events/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1events/get/parameters/0/schema
 */
@Serializable(with = InlineV1EventsGetParameterX0238b28f.Serializer::class)
public class InlineV1EventsGetParameterX0238b28f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1EventsGetParameterX0238b28fInspection,
) {
  public val inlineV1EventsGetParameterAnyOf1X806f5237: InlineV1EventsGetParameterAnyOf1X806f5237?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1EventsGetParameterAnyOf1X806f5237) json.decodeFromJsonElement<InlineV1EventsGetParameterAnyOf1X806f5237>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1EventsGetParameterX0238b28fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1EventsGetParameterAnyOf1X806f5237) add(InlineV1EventsGetParameterX0238b28fBranch.InlineV1EventsGetParameterAnyOf1X806f5237)
      if (inspection.matchesBranch2) add(InlineV1EventsGetParameterX0238b28fBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1EventsGetParameterX0238b28f {
      val inspection = inspectInlineV1EventsGetParameterX0238b28f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1EventsGetParameterX0238b28fNoMatchException("InlineV1EventsGetParameterX0238b28f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1EventsGetParameterX0238b28f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1EventsGetParameterX0238b28f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1EventsGetParameterX0238b28f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1EventsGetParameterX0238b28f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1EventsGetParameterX0238b28f) {
      encoder.requireJsonEncoder("InlineV1EventsGetParameterX0238b28f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1EventsGetParameterX0238b28f(element: JsonElement): InlineV1EventsGetParameterX0238b28fInspection {
  val matchesInlineV1EventsGetParameterAnyOf1X806f5237 = element.isJsonDecodable<InlineV1EventsGetParameterAnyOf1X806f5237>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1EventsGetParameterX0238b28fInspection(
    matchesInlineV1EventsGetParameterAnyOf1X806f5237 = matchesInlineV1EventsGetParameterAnyOf1X806f5237,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1EventsGetParameterAnyOf1X806f5237) add("InlineV1EventsGetParameterAnyOf1X806f5237: value does not match InlineV1EventsGetParameterAnyOf1X806f5237")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
