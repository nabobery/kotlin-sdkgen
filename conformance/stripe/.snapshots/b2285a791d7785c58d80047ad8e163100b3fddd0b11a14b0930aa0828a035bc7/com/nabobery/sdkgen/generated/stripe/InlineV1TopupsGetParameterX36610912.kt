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

public enum class InlineV1TopupsGetParameterX36610912Branch {
  InlineV1TopupsGetParameterAnyOf1Xfd3d51f0,
  Branch2,
}

public sealed class InlineV1TopupsGetParameterX36610912DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TopupsGetParameterX36610912NoMatchException(
  message: String,
) : InlineV1TopupsGetParameterX36610912DecodingException(message)

internal data class InlineV1TopupsGetParameterX36610912Inspection(
  public val matchesInlineV1TopupsGetParameterAnyOf1Xfd3d51f0: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TopupsGetParameterAnyOf1Xfd3d51f0, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1topups/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1topups/get/parameters/1/schema
 */
@Serializable(with = InlineV1TopupsGetParameterX36610912.Serializer::class)
public class InlineV1TopupsGetParameterX36610912 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TopupsGetParameterX36610912Inspection,
) {
  public val inlineV1TopupsGetParameterAnyOf1Xfd3d51f0: InlineV1TopupsGetParameterAnyOf1Xfd3d51f0?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TopupsGetParameterAnyOf1Xfd3d51f0) json.decodeFromJsonElement<InlineV1TopupsGetParameterAnyOf1Xfd3d51f0>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TopupsGetParameterX36610912Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TopupsGetParameterAnyOf1Xfd3d51f0) add(InlineV1TopupsGetParameterX36610912Branch.InlineV1TopupsGetParameterAnyOf1Xfd3d51f0)
      if (inspection.matchesBranch2) add(InlineV1TopupsGetParameterX36610912Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TopupsGetParameterX36610912 {
      val inspection = inspectInlineV1TopupsGetParameterX36610912(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TopupsGetParameterX36610912NoMatchException("InlineV1TopupsGetParameterX36610912 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TopupsGetParameterX36610912(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TopupsGetParameterX36610912> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TopupsGetParameterX36610912 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TopupsGetParameterX36610912")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TopupsGetParameterX36610912) {
      encoder.requireJsonEncoder("InlineV1TopupsGetParameterX36610912").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TopupsGetParameterX36610912(element: JsonElement): InlineV1TopupsGetParameterX36610912Inspection {
  val matchesInlineV1TopupsGetParameterAnyOf1Xfd3d51f0 = element.isJsonDecodable<InlineV1TopupsGetParameterAnyOf1Xfd3d51f0>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TopupsGetParameterX36610912Inspection(
    matchesInlineV1TopupsGetParameterAnyOf1Xfd3d51f0 = matchesInlineV1TopupsGetParameterAnyOf1Xfd3d51f0,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TopupsGetParameterAnyOf1Xfd3d51f0) add("InlineV1TopupsGetParameterAnyOf1Xfd3d51f0: value does not match InlineV1TopupsGetParameterAnyOf1Xfd3d51f0")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
