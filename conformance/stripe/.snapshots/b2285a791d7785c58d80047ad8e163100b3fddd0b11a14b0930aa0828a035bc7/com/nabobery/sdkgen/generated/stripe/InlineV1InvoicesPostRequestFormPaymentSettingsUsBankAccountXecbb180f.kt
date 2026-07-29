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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fBranch {
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fNoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fInspection(
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fInspection,
) {
  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123) add(InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fBranch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082) add(InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fBranch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fNoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180f(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fInspection {
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsUsBankAccountXecbb180fInspection(
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X81ca6123")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X9d9c8082")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
