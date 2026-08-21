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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccBranch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccInspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/bancontact
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccInspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744ecc(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccInspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactXb1744eccInspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7a611a06")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf30583bc")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
