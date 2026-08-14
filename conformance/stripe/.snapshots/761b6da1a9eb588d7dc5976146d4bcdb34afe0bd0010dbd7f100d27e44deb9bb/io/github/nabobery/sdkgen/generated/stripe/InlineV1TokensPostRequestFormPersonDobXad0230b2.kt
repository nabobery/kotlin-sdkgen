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

public enum class InlineV1TokensPostRequestFormPersonDobXad0230b2Branch {
  InlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961,
  InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6,
}

public sealed class InlineV1TokensPostRequestFormPersonDobXad0230b2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormPersonDobXad0230b2NoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormPersonDobXad0230b2DecodingException(message)

internal data class InlineV1TokensPostRequestFormPersonDobXad0230b2Inspection(
  public val matchesInlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961: Boolean,
  public val matchesInlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961, matchesInlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/dob.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/dob
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonDobXad0230b2.Serializer::class)
public class InlineV1TokensPostRequestFormPersonDobXad0230b2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TokensPostRequestFormPersonDobXad0230b2Inspection,
) {
  public val inlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961:
      InlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961) json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961>(raw) else null }

  public val inlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6:
      InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6) json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6>(raw) else null }

  public val matchedBranches: Set<InlineV1TokensPostRequestFormPersonDobXad0230b2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961) add(InlineV1TokensPostRequestFormPersonDobXad0230b2Branch.InlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961)
      if (inspection.matchesInlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6) add(InlineV1TokensPostRequestFormPersonDobXad0230b2Branch.InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormPersonDobXad0230b2 {
      val inspection = inspectInlineV1TokensPostRequestFormPersonDobXad0230b2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormPersonDobXad0230b2NoMatchException("InlineV1TokensPostRequestFormPersonDobXad0230b2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormPersonDobXad0230b2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonDobXad0230b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonDobXad0230b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonDobXad0230b2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonDobXad0230b2) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonDobXad0230b2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormPersonDobXad0230b2(element: JsonElement): InlineV1TokensPostRequestFormPersonDobXad0230b2Inspection {
  val matchesInlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961 = element.isJsonDecodable<InlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961>()
  val matchesInlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6 = element.isJsonDecodable<InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6>()
  return InlineV1TokensPostRequestFormPersonDobXad0230b2Inspection(
    matchesInlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961 = matchesInlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961,
    matchesInlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6 = matchesInlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6,
    failures = buildList {
      if (!matchesInlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961) add("InlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961: value does not match InlineV1TokensPostRequestFormPersonDobAnyOf1X0f55a961")
      if (!matchesInlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6) add("InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6: value does not match InlineV1TokensPostRequestFormPersonDobAnyOf2Xa57d37e6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
