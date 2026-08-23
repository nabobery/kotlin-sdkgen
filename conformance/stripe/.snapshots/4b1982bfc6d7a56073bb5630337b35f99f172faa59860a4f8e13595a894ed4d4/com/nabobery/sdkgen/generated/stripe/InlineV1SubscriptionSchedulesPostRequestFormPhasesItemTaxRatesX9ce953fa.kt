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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faBranch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953fa(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesX9ce953faInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X97261116")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
