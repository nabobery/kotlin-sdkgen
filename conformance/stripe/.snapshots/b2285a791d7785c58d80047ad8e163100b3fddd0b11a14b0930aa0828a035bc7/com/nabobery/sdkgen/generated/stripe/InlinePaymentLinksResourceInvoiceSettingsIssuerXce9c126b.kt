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

public enum class InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bBranch {
  ConnectAccountReference,
}

public sealed class InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bNoMatchException(
  message: String,
) : InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bDecodingException(message)

internal data class InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bInspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_invoice_settings/properties/issuer
 */
@Serializable(with = InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b.Serializer::class)
public class InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bInspection,
) {
  public val connectAccountReference: ConnectAccountReferenceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConnectAccountReference) json.decodeFromJsonElement<ConnectAccountReferenceView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bBranch>
    get() = buildSet {
      if (inspection.matchesConnectAccountReference) add(InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bBranch.ConnectAccountReference)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b {
      val inspection = inspectInlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bNoMatchException("InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126b(element: JsonElement): InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bInspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bInspection(
    matchesConnectAccountReference = false,
    failures = listOf("ConnectAccountReference: expected JSON object"),
  )
  val matchesConnectAccountReference = raw["type"] != null
  return InlinePaymentLinksResourceInvoiceSettingsIssuerXce9c126bInspection(
    matchesConnectAccountReference = matchesConnectAccountReference,
    failures = buildList {
      if (!matchesConnectAccountReference) add("ConnectAccountReference: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
