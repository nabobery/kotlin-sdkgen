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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_types.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_types
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535Inspection,
) {
  public val branch1:
      List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX6dfcae2b>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX6dfcae2b>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX6dfcae2b>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX678fe535Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2046084c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
