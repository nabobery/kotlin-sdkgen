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

public enum class InlineV1CheckoutSessionsGetParameterX224caacfBranch {
  InlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0,
  Branch2,
}

public sealed class InlineV1CheckoutSessionsGetParameterX224caacfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsGetParameterX224caacfNoMatchException(
  message: String,
) : InlineV1CheckoutSessionsGetParameterX224caacfDecodingException(message)

internal data class InlineV1CheckoutSessionsGetParameterX224caacfInspection(
  public val matchesInlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/get/parameters/0/schema
 */
@Serializable(with = InlineV1CheckoutSessionsGetParameterX224caacf.Serializer::class)
public class InlineV1CheckoutSessionsGetParameterX224caacf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CheckoutSessionsGetParameterX224caacfInspection,
) {
  public val inlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0:
      InlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0) json.decodeFromJsonElement<InlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1CheckoutSessionsGetParameterX224caacfBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0) add(InlineV1CheckoutSessionsGetParameterX224caacfBranch.InlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0)
      if (inspection.matchesBranch2) add(InlineV1CheckoutSessionsGetParameterX224caacfBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsGetParameterX224caacf {
      val inspection = inspectInlineV1CheckoutSessionsGetParameterX224caacf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsGetParameterX224caacfNoMatchException("InlineV1CheckoutSessionsGetParameterX224caacf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsGetParameterX224caacf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsGetParameterX224caacf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsGetParameterX224caacf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsGetParameterX224caacf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsGetParameterX224caacf) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsGetParameterX224caacf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsGetParameterX224caacf(element: JsonElement): InlineV1CheckoutSessionsGetParameterX224caacfInspection {
  val matchesInlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0 = element.isJsonDecodable<InlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1CheckoutSessionsGetParameterX224caacfInspection(
    matchesInlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0 = matchesInlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0) add("InlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0: value does not match InlineV1CheckoutSessionsGetParameterAnyOf1X5f6716b0")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
