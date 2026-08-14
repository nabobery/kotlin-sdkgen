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

public enum class InlineV1PayoutsGetParameterX00f01c31Branch {
  InlineV1PayoutsGetParameterAnyOf1Xe34a804d,
  Branch2,
}

public sealed class InlineV1PayoutsGetParameterX00f01c31DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PayoutsGetParameterX00f01c31NoMatchException(
  message: String,
) : InlineV1PayoutsGetParameterX00f01c31DecodingException(message)

internal data class InlineV1PayoutsGetParameterX00f01c31Inspection(
  public val matchesInlineV1PayoutsGetParameterAnyOf1Xe34a804d: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PayoutsGetParameterAnyOf1Xe34a804d, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1payouts/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1payouts/get/parameters/0/schema
 */
@Serializable(with = InlineV1PayoutsGetParameterX00f01c31.Serializer::class)
public class InlineV1PayoutsGetParameterX00f01c31 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PayoutsGetParameterX00f01c31Inspection,
) {
  public val inlineV1PayoutsGetParameterAnyOf1Xe34a804d: InlineV1PayoutsGetParameterAnyOf1Xe34a804d?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PayoutsGetParameterAnyOf1Xe34a804d) json.decodeFromJsonElement<InlineV1PayoutsGetParameterAnyOf1Xe34a804d>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1PayoutsGetParameterX00f01c31Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PayoutsGetParameterAnyOf1Xe34a804d) add(InlineV1PayoutsGetParameterX00f01c31Branch.InlineV1PayoutsGetParameterAnyOf1Xe34a804d)
      if (inspection.matchesBranch2) add(InlineV1PayoutsGetParameterX00f01c31Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PayoutsGetParameterX00f01c31 {
      val inspection = inspectInlineV1PayoutsGetParameterX00f01c31(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PayoutsGetParameterX00f01c31NoMatchException("InlineV1PayoutsGetParameterX00f01c31 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PayoutsGetParameterX00f01c31(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PayoutsGetParameterX00f01c31> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PayoutsGetParameterX00f01c31 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PayoutsGetParameterX00f01c31")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PayoutsGetParameterX00f01c31) {
      encoder.requireJsonEncoder("InlineV1PayoutsGetParameterX00f01c31").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PayoutsGetParameterX00f01c31(element: JsonElement): InlineV1PayoutsGetParameterX00f01c31Inspection {
  val matchesInlineV1PayoutsGetParameterAnyOf1Xe34a804d = element.isJsonDecodable<InlineV1PayoutsGetParameterAnyOf1Xe34a804d>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1PayoutsGetParameterX00f01c31Inspection(
    matchesInlineV1PayoutsGetParameterAnyOf1Xe34a804d = matchesInlineV1PayoutsGetParameterAnyOf1Xe34a804d,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1PayoutsGetParameterAnyOf1Xe34a804d) add("InlineV1PayoutsGetParameterAnyOf1Xe34a804d: value does not match InlineV1PayoutsGetParameterAnyOf1Xe34a804d")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
