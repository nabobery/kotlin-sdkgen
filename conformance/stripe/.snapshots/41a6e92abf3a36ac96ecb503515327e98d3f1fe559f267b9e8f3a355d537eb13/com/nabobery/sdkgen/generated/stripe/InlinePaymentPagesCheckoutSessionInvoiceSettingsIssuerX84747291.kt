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

public enum class InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291Branch {
  ConnectAccountReference,
}

public sealed class InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291Inspection(
  public val matchesConnectAccountReference: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConnectAccountReference).count { it }
}

/**
 * The connected account that issues the invoice. The invoice is presented with the branding and support information of
 * the specified account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_invoice_settings/properties/issuer
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291.Serializer::class)
public class InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291Inspection,
) {
  public val connectAccountReference: ConnectAccountReferenceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConnectAccountReference) json.decodeFromJsonElement<ConnectAccountReferenceView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291Branch>
    get() = buildSet {
      if (inspection.matchesConnectAccountReference) add(InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291Branch.ConnectAccountReference)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291NoMatchException("InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291(element: JsonElement): InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291Inspection(
    matchesConnectAccountReference = false,
    failures = listOf("ConnectAccountReference: expected JSON object"),
  )
  val matchesConnectAccountReference = raw["type"] != null
  return InlinePaymentPagesCheckoutSessionInvoiceSettingsIssuerX84747291Inspection(
    matchesConnectAccountReference = matchesConnectAccountReference,
    failures = buildList {
      if (!matchesConnectAccountReference) add("ConnectAccountReference: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
