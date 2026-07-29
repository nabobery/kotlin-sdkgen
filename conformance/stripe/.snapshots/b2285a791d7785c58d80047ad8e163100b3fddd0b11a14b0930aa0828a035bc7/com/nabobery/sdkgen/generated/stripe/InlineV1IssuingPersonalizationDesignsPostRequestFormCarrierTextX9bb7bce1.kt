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

public enum class InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1Branch {
  InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041,
  InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10,
}

public sealed class InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1NoMatchException(
  message: String,
) : InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1DecodingException(message)

internal data class InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1Inspection(
  public val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041:
      Boolean,
  public val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041, matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10).count { it }
}

/**
 * Hash containing carrier text, for use with physical bundles that support carrier text.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/carrier_text
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1Inspection,
) {
  public val inlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041:
      InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041) json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041>(raw) else null }

  public val inlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10:
      InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10) json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041) add(InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1Branch.InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041)
      if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10) add(InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1Branch.InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1 {
      val inspection = inspectInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1NoMatchException("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1) {
      encoder.requireJsonEncoder("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1(element: JsonElement): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1Inspection {
  val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041 = element.isJsonDecodable<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041>()
  val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10 = element.isJsonDecodable<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10>()
  return InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1Inspection(
    matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041 = matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041,
    matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10 = matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10,
    failures = buildList {
      if (!matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041) add("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041: value does not match InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041")
      if (!matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10) add("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10: value does not match InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf2Xce559d10")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
