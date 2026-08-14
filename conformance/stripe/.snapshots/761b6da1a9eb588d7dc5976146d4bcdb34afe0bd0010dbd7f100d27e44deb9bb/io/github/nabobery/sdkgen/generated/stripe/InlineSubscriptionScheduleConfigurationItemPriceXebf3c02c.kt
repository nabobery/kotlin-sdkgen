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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cBranch {
  Branch1,
  Price,
  DeletedPrice,
}

public sealed class InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cNoMatchException(
  message: String,
) : InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cDecodingException(message)

internal data class InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cInspection(
  public val matchesBranch1: Boolean,
  public val matchesPrice: Boolean,
  public val matchesDeletedPrice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPrice, matchesDeletedPrice).count { it }
}

/**
 * ID of the price to which the customer should be subscribed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule_configuration_item/properties/price
 */
@Serializable(with = InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c.Serializer::class)
public class InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val price: Price? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPrice) json.decodeFromJsonElement<Price>(raw) else null }

  public val deletedPrice: DeletedPrice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedPrice) json.decodeFromJsonElement<DeletedPrice>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cBranch.Branch1)
      if (inspection.matchesPrice) add(InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cBranch.Price)
      if (inspection.matchesDeletedPrice) add(InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cBranch.DeletedPrice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c {
      val inspection = inspectInlineSubscriptionScheduleConfigurationItemPriceXebf3c02c(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cNoMatchException("InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c) {
      encoder.requireJsonEncoder("InlineSubscriptionScheduleConfigurationItemPriceXebf3c02c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionScheduleConfigurationItemPriceXebf3c02c(element: JsonElement): InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPrice = element.isJsonDecodable<Price>()
  val matchesDeletedPrice = element.isJsonDecodable<DeletedPrice>()
  return InlineSubscriptionScheduleConfigurationItemPriceXebf3c02cInspection(
    matchesBranch1 = matchesBranch1,
    matchesPrice = matchesPrice,
    matchesDeletedPrice = matchesDeletedPrice,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPrice) add("Price: value does not match Price")
      if (!matchesDeletedPrice) add("DeletedPrice: value does not match DeletedPrice")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
