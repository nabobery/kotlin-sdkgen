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

public enum class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187NoMatchException(
  message: String,
) : InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187DecodingException(message)

internal data class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Filter value. Use a scalar (string or number) for eq/neq, or an array for in/not_in.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/c
 * lassifier_filters/properties/filters/items/properties/value
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3:
      List<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<List<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17>>(raw) else null }

  public val matchedBranches:
      Set<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187 {
      val inspection = inspectInlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187(raw)
      if (inspection.matchCount == 0) {
        throw InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187NoMatchException("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187) {
      encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187(element: JsonElement): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<List<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemValueXfbdae187Inspection(
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
