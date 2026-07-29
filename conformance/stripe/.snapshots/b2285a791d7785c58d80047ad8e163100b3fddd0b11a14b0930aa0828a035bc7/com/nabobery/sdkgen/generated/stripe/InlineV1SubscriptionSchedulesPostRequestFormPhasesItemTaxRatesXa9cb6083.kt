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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTaxRatesXa9cb6083Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
