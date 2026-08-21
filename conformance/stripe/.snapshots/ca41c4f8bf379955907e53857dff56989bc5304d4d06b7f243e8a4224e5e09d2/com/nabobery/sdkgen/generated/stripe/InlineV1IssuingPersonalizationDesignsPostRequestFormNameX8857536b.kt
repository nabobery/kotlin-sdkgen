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

public enum class InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bBranch {
  Branch1,
  InlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84,
}

public sealed class InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bNoMatchException(
  message: String,
) : InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bDecodingException(message)

internal data class InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84).count { it }
}

/**
 * Friendly display name. Providing an empty string will set the field to null.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/name
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84:
      InlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84) json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bBranch.Branch1)
      if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84) add(InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bBranch.InlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b {
      val inspection = inspectInlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bNoMatchException("InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b) {
      encoder.requireJsonEncoder("InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b(element: JsonElement): InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84 = element.isJsonDecodable<InlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84>()
  return InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84 = matchesInlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84) add("InlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84: value does not match InlineV1IssuingPersonalizationDesignsPostRequestFormNameAnyOf2Xcf754b84")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
