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

public enum class InlineV1RadarValueListsGetParameterX26d080bdBranch {
  InlineV1RadarValueListsGetParameterAnyOf1X0c2edf91,
  Branch2,
}

public sealed class InlineV1RadarValueListsGetParameterX26d080bdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1RadarValueListsGetParameterX26d080bdNoMatchException(
  message: String,
) : InlineV1RadarValueListsGetParameterX26d080bdDecodingException(message)

internal data class InlineV1RadarValueListsGetParameterX26d080bdInspection(
  public val matchesInlineV1RadarValueListsGetParameterAnyOf1X0c2edf91: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1RadarValueListsGetParameterAnyOf1X0c2edf91, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_lists/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_lists/get/parameters/2/schema
 */
@Serializable(with = InlineV1RadarValueListsGetParameterX26d080bd.Serializer::class)
public class InlineV1RadarValueListsGetParameterX26d080bd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1RadarValueListsGetParameterX26d080bdInspection,
) {
  public val inlineV1RadarValueListsGetParameterAnyOf1X0c2edf91:
      InlineV1RadarValueListsGetParameterAnyOf1X0c2edf91? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1RadarValueListsGetParameterAnyOf1X0c2edf91) json.decodeFromJsonElement<InlineV1RadarValueListsGetParameterAnyOf1X0c2edf91>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1RadarValueListsGetParameterX26d080bdBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1RadarValueListsGetParameterAnyOf1X0c2edf91) add(InlineV1RadarValueListsGetParameterX26d080bdBranch.InlineV1RadarValueListsGetParameterAnyOf1X0c2edf91)
      if (inspection.matchesBranch2) add(InlineV1RadarValueListsGetParameterX26d080bdBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1RadarValueListsGetParameterX26d080bd {
      val inspection = inspectInlineV1RadarValueListsGetParameterX26d080bd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1RadarValueListsGetParameterX26d080bdNoMatchException("InlineV1RadarValueListsGetParameterX26d080bd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1RadarValueListsGetParameterX26d080bd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1RadarValueListsGetParameterX26d080bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarValueListsGetParameterX26d080bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarValueListsGetParameterX26d080bd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarValueListsGetParameterX26d080bd) {
      encoder.requireJsonEncoder("InlineV1RadarValueListsGetParameterX26d080bd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1RadarValueListsGetParameterX26d080bd(element: JsonElement): InlineV1RadarValueListsGetParameterX26d080bdInspection {
  val matchesInlineV1RadarValueListsGetParameterAnyOf1X0c2edf91 = element.isJsonDecodable<InlineV1RadarValueListsGetParameterAnyOf1X0c2edf91>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1RadarValueListsGetParameterX26d080bdInspection(
    matchesInlineV1RadarValueListsGetParameterAnyOf1X0c2edf91 = matchesInlineV1RadarValueListsGetParameterAnyOf1X0c2edf91,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1RadarValueListsGetParameterAnyOf1X0c2edf91) add("InlineV1RadarValueListsGetParameterAnyOf1X0c2edf91: value does not match InlineV1RadarValueListsGetParameterAnyOf1X0c2edf91")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
