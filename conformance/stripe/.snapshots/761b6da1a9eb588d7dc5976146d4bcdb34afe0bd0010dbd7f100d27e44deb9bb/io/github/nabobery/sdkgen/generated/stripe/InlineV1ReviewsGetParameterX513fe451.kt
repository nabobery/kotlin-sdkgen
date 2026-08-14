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

public enum class InlineV1ReviewsGetParameterX513fe451Branch {
  InlineV1ReviewsGetParameterAnyOf1Xa8794d1a,
  Branch2,
}

public sealed class InlineV1ReviewsGetParameterX513fe451DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ReviewsGetParameterX513fe451NoMatchException(
  message: String,
) : InlineV1ReviewsGetParameterX513fe451DecodingException(message)

internal data class InlineV1ReviewsGetParameterX513fe451Inspection(
  public val matchesInlineV1ReviewsGetParameterAnyOf1Xa8794d1a: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1ReviewsGetParameterAnyOf1Xa8794d1a, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1reviews/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1reviews/get/parameters/0/schema
 */
@Serializable(with = InlineV1ReviewsGetParameterX513fe451.Serializer::class)
public class InlineV1ReviewsGetParameterX513fe451 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ReviewsGetParameterX513fe451Inspection,
) {
  public val inlineV1ReviewsGetParameterAnyOf1Xa8794d1a: InlineV1ReviewsGetParameterAnyOf1Xa8794d1a?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ReviewsGetParameterAnyOf1Xa8794d1a) json.decodeFromJsonElement<InlineV1ReviewsGetParameterAnyOf1Xa8794d1a>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1ReviewsGetParameterX513fe451Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1ReviewsGetParameterAnyOf1Xa8794d1a) add(InlineV1ReviewsGetParameterX513fe451Branch.InlineV1ReviewsGetParameterAnyOf1Xa8794d1a)
      if (inspection.matchesBranch2) add(InlineV1ReviewsGetParameterX513fe451Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ReviewsGetParameterX513fe451 {
      val inspection = inspectInlineV1ReviewsGetParameterX513fe451(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ReviewsGetParameterX513fe451NoMatchException("InlineV1ReviewsGetParameterX513fe451 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ReviewsGetParameterX513fe451(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ReviewsGetParameterX513fe451> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ReviewsGetParameterX513fe451 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ReviewsGetParameterX513fe451")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ReviewsGetParameterX513fe451) {
      encoder.requireJsonEncoder("InlineV1ReviewsGetParameterX513fe451").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ReviewsGetParameterX513fe451(element: JsonElement): InlineV1ReviewsGetParameterX513fe451Inspection {
  val matchesInlineV1ReviewsGetParameterAnyOf1Xa8794d1a = element.isJsonDecodable<InlineV1ReviewsGetParameterAnyOf1Xa8794d1a>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1ReviewsGetParameterX513fe451Inspection(
    matchesInlineV1ReviewsGetParameterAnyOf1Xa8794d1a = matchesInlineV1ReviewsGetParameterAnyOf1Xa8794d1a,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1ReviewsGetParameterAnyOf1Xa8794d1a) add("InlineV1ReviewsGetParameterAnyOf1Xa8794d1a: value does not match InlineV1ReviewsGetParameterAnyOf1Xa8794d1a")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
