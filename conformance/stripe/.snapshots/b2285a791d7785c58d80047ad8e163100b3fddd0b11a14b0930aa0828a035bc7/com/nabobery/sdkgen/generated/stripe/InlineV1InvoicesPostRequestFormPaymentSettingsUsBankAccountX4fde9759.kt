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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759Branch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759Inspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759Inspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864) add(InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b) add(InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759Inspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountX4fde9759Inspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X6f639864")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xc9b70a1b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
