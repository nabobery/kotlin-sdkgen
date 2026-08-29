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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bBranch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6b(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX5aa95b6bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X257ff68a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
