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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dBranch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dInspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/card
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dInspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1d(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dInspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsCardXc57a5c1dInspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xe4434636")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X2cc4dac8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
