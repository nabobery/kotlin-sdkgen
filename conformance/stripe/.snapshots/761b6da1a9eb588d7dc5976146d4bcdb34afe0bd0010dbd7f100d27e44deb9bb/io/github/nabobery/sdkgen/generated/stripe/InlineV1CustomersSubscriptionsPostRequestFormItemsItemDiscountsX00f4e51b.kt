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

public enum class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bBranch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/discounts
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bInspection,
) {
  public val branch1:
      List<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsItemX39ea1d60>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsItemX39ea1d60>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bBranch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bBranch.InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsItemX39ea1d60>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055>()
  return InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055 = matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055) add("InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055: value does not match InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X59d4d055")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
