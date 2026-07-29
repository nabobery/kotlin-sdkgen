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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaBranch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaInspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_acc
 * ount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_acc
 * ount
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaInspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaBranch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaNoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39ea(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaInspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsUsBankAccountX3b5e39eaInspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c5c8a4")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2X404ef88b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
