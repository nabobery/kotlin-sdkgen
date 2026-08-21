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

public enum class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733Branch {
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846,
  InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01,
}

public sealed class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733Inspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846, matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733Inspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01) add(InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733Branch.InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733NoMatchException("InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733(element: JsonElement): InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733Inspection {
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846>()
  val matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01>()
  return InlineV1SubscriptionsPostRequestFormPaymentSettingsAcssDebitXc76e6733Inspection(
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846,
    matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01 = matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf1X3c772846")
      if (!matchesInlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01) add("InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01: value does not match InlineV1SubscriptionsPostRequestFormPaymentSettingsAnyOf2Xba4b0c01")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
