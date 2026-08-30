package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633NoMatchException(
  message: String,
) : InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633DecodingException(message)

internal data class InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Filter value (scalar or array depending on operator). Several dimensions are enriched in responses (returned as
 * human-readable labels), but filters must use the underlying ID: `api_key_id` — numeric ID (from generation metadata)
 * or key hash (64-char hex from GET /api/v1/keys, resolved server-side); `user` — Clerk user ID (e.g. "user_abc123"),
 * not the display name; `workspace` — workspace UUID, not the workspace name; `app` — numeric app ID, not the app
 * title; `model` — permaslug (e.g. "openai/gpt-4o"), not the display name. Other dimensions (provider, origin, country,
 * etc.) are not enriched and accept the value as returned.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/f
 * ilters/items/properties/value
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: List<InlineAnalyticsQueryPostRequestJsonFiltersItemValueAnyOf3ItemXbb7b7421>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<List<InlineAnalyticsQueryPostRequestJsonFiltersItemValueAnyOf3ItemXbb7b7421>>(raw) else null }

  public val matchedBranches:
      Set<InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633 {
      val inspection = inspectInlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633(raw)
      if (inspection.matchCount == 0) {
        throw InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633NoMatchException("InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633) {
      encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633(element: JsonElement): InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<List<InlineAnalyticsQueryPostRequestJsonFiltersItemValueAnyOf3ItemXbb7b7421>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineAnalyticsQueryPostRequestJsonFiltersItemValueX08e5e633Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
