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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08Branch {
  Branch1,
  InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4:
      InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4) add(InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08 {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08NoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsSepaDebitXc166de08Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4) add("InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4eace1f4")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
