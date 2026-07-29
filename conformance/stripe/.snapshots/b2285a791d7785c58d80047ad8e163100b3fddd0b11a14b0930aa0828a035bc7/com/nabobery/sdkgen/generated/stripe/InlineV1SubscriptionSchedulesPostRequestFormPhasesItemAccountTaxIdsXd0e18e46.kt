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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/invoice_settings/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/invoice_settings/properties/account_tax_ids
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXd0e18e46Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
