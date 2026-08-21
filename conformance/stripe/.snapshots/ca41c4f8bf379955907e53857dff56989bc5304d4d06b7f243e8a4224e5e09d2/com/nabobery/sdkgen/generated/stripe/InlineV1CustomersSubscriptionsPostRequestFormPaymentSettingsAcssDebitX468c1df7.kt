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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7Branch {
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7Inspection(
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160:
      Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7Inspection,
) {
  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7Inspection {
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX468c1df7Inspection(
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565,
    failures = buildList {
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X51760160")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xf3e51565")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
