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

public enum class InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807Branch {
  Branch1,
  InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252,
}

public sealed class InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807NoMatchException(
  message: String,
) : InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807DecodingException(message)

internal data class InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252).count { it }
}

/**
 * The file for the card logo, for use with physical bundles that support card logos. Must have a `purpose` value of
 * `issuing_logo`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/card_logo
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252:
      InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252) json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807Branch.Branch1)
      if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252) add(InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807Branch.InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807 {
      val inspection = inspectInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807NoMatchException("InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807) {
      encoder.requireJsonEncoder("InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807(element: JsonElement): InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252 = element.isJsonDecodable<InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252>()
  return InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252 = matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252) add("InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252: value does not match InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoAnyOf2Xf2fea252")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
