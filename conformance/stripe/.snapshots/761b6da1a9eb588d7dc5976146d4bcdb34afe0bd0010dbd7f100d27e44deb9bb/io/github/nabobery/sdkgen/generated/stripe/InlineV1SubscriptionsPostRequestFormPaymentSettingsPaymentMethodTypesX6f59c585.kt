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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_types.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_types
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585Inspection,
) {
  public val branch1: List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXbb6bbf17>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXbb6bbf17>>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SubscriptionsPostRequestFormPaymentSettingsItemXbb6bbf17>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentMethodTypesX6f59c585Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X63dd77d2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
