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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/discounts
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09Inspection,
) {
  public val branch1:
      List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsAnyOf2X50cf4ad7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
