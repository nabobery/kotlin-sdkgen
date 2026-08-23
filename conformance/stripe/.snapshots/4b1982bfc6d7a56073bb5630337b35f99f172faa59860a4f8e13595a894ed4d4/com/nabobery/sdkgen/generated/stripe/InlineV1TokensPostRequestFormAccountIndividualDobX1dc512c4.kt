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

public enum class InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4Branch {
  InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223,
  InlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24,
}

public sealed class InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4NoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4DecodingException(message)

internal data class InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4Inspection(
  public val matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223: Boolean,
  public val matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223, matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/dob.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/dob
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4.Serializer::class)
public class InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4Inspection,
) {
  public val inlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223:
      InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223) json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223>(raw) else null }

  public val inlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24:
      InlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24) json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24>(raw) else null }

  public val matchedBranches: Set<InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223) add(InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4Branch.InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223)
      if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24) add(InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4Branch.InlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4 {
      val inspection = inspectInlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4NoMatchException("InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4(element: JsonElement): InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4Inspection {
  val matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223 = element.isJsonDecodable<InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223>()
  val matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24 = element.isJsonDecodable<InlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24>()
  return InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4Inspection(
    matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223 = matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223,
    matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24 = matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24,
    failures = buildList {
      if (!matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223) add("InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223: value does not match InlineV1TokensPostRequestFormAccountIndividualDobAnyOf1Xb9f24223")
      if (!matchesInlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24) add("InlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24: value does not match InlineV1TokensPostRequestFormAccountIndividualDobAnyOf2X7f409b24")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
