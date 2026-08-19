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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17Branch {
  Branch1,
  Branch2,
}

public sealed class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17NoMatchException(
  message: String,
) : InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17DecodingException(message)

internal data class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/c
 * lassifier_filters/properties/filters/items/properties/value/anyOf/2/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/c
 * lassifier_filters/properties/filters/items/properties/value/anyOf/2/items
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val matchedBranches:
      Set<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17 {
      val inspection = inspectInlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17(raw)
      if (inspection.matchCount == 0) {
        throw InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17NoMatchException("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17) {
      encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17(element: JsonElement): InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  return InlineAnalyticsQueryPostRequestJsonClassifierFiltersFiltersItemItemX8b30ef17Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
