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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768Branch {
  InvoiceSettingCheckoutRenderingOptions,
}

public sealed class InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768Inspection(
  public val matchesInvoiceSettingCheckoutRenderingOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoiceSettingCheckoutRenderingOptions).count { it }
}

/**
 * Options for invoice PDF rendering.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_invoice_settings/properties/rendering
 * _options
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768.Serializer::class)
public class InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768Inspection,
) {
  public val invoiceSettingCheckoutRenderingOptions: InvoiceSettingCheckoutRenderingOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoiceSettingCheckoutRenderingOptions) json.decodeFromJsonElement<InvoiceSettingCheckoutRenderingOptionsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768Branch>
    get() = buildSet {
      if (inspection.matchesInvoiceSettingCheckoutRenderingOptions) add(InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768Branch.InvoiceSettingCheckoutRenderingOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768NoMatchException("InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768(element: JsonElement): InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768Inspection(
    matchesInvoiceSettingCheckoutRenderingOptions = false,
    failures = listOf("InvoiceSettingCheckoutRenderingOptions: expected JSON object"),
  )
  val matchesInvoiceSettingCheckoutRenderingOptions = true
  return InlinePaymentPagesCheckoutSessionInvoiceSettingsRenderingOptionsX9e0cf768Inspection(
    matchesInvoiceSettingCheckoutRenderingOptions = matchesInvoiceSettingCheckoutRenderingOptions,
    failures = buildList {
      if (!matchesInvoiceSettingCheckoutRenderingOptions) add("InvoiceSettingCheckoutRenderingOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
