package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/items/items/properties/discounts
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7Inspection,
) {
  public val branch1:
      List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemItemX0583f177>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemItemX0583f177>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemItemX0583f177>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsX43b055a7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2Xd041b0b5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
