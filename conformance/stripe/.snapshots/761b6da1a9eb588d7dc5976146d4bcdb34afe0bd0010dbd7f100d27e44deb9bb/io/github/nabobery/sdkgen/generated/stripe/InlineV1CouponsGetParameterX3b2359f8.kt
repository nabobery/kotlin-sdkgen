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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CouponsGetParameterX3b2359f8Branch {
  InlineV1CouponsGetParameterAnyOf1Xcc33bef0,
  Branch2,
}

public sealed class InlineV1CouponsGetParameterX3b2359f8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CouponsGetParameterX3b2359f8NoMatchException(
  message: String,
) : InlineV1CouponsGetParameterX3b2359f8DecodingException(message)

internal data class InlineV1CouponsGetParameterX3b2359f8Inspection(
  public val matchesInlineV1CouponsGetParameterAnyOf1Xcc33bef0: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CouponsGetParameterAnyOf1Xcc33bef0, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1coupons/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1coupons/get/parameters/0/schema
 */
@Serializable(with = InlineV1CouponsGetParameterX3b2359f8.Serializer::class)
public class InlineV1CouponsGetParameterX3b2359f8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CouponsGetParameterX3b2359f8Inspection,
) {
  public val inlineV1CouponsGetParameterAnyOf1Xcc33bef0: InlineV1CouponsGetParameterAnyOf1Xcc33bef0?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CouponsGetParameterAnyOf1Xcc33bef0) json.decodeFromJsonElement<InlineV1CouponsGetParameterAnyOf1Xcc33bef0>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1CouponsGetParameterX3b2359f8Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CouponsGetParameterAnyOf1Xcc33bef0) add(InlineV1CouponsGetParameterX3b2359f8Branch.InlineV1CouponsGetParameterAnyOf1Xcc33bef0)
      if (inspection.matchesBranch2) add(InlineV1CouponsGetParameterX3b2359f8Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CouponsGetParameterX3b2359f8 {
      val inspection = inspectInlineV1CouponsGetParameterX3b2359f8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CouponsGetParameterX3b2359f8NoMatchException("InlineV1CouponsGetParameterX3b2359f8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CouponsGetParameterX3b2359f8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CouponsGetParameterX3b2359f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CouponsGetParameterX3b2359f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CouponsGetParameterX3b2359f8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsGetParameterX3b2359f8) {
      encoder.requireJsonEncoder("InlineV1CouponsGetParameterX3b2359f8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CouponsGetParameterX3b2359f8(element: JsonElement): InlineV1CouponsGetParameterX3b2359f8Inspection {
  val matchesInlineV1CouponsGetParameterAnyOf1Xcc33bef0 = element.isJsonDecodable<InlineV1CouponsGetParameterAnyOf1Xcc33bef0>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1CouponsGetParameterX3b2359f8Inspection(
    matchesInlineV1CouponsGetParameterAnyOf1Xcc33bef0 = matchesInlineV1CouponsGetParameterAnyOf1Xcc33bef0,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CouponsGetParameterAnyOf1Xcc33bef0) add("InlineV1CouponsGetParameterAnyOf1Xcc33bef0: value does not match InlineV1CouponsGetParameterAnyOf1Xcc33bef0")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
