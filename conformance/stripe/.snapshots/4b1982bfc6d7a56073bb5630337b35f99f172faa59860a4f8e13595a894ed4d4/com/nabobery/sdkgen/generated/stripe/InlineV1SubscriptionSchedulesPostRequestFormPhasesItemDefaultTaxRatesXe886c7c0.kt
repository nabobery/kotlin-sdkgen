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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/default_tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/default_tax_rates
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X09f3bb23")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
