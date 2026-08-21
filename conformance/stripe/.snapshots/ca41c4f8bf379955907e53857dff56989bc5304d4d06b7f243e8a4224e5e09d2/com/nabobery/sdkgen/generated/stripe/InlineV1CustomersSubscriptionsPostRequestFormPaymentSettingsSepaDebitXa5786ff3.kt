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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/sepa_debit
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsSepaDebitXa5786ff3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X320c5ad2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
