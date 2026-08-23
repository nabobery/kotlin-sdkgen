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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beBranch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beInspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beInspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beNoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4be(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beInspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsPaytoX3b4ac4beInspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X7c7c6893")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X42589e8c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
