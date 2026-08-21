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

public enum class InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aBranch {
  PaymentLinksResourceInvoiceSettings,
}

public sealed class InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aNoMatchException(
  message: String,
) : InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aDecodingException(message)

internal data class InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aInspection(
  public val matchesPaymentLinksResourceInvoiceSettings: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceInvoiceSettings).count { it }
}

/**
 * Configuration for the invoice. Default invoice values will be used if unspecified.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_invoice_creation/properties/invoice_data
 */
@Serializable(with = InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a.Serializer::class)
public class InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aInspection,
) {
  public val paymentLinksResourceInvoiceSettings: PaymentLinksResourceInvoiceSettingsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceInvoiceSettings) json.decodeFromJsonElement<PaymentLinksResourceInvoiceSettingsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aBranch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceInvoiceSettings) add(InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aBranch.PaymentLinksResourceInvoiceSettings)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a {
      val inspection = inspectInlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aNoMatchException("InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7a(element: JsonElement): InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aInspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aInspection(
    matchesPaymentLinksResourceInvoiceSettings = false,
    failures = listOf("PaymentLinksResourceInvoiceSettings: expected JSON object"),
  )
  val matchesPaymentLinksResourceInvoiceSettings = true
  return InlinePaymentLinksResourceInvoiceCreationInvoiceDataX2811de7aInspection(
    matchesPaymentLinksResourceInvoiceSettings = matchesPaymentLinksResourceInvoiceSettings,
    failures = buildList {
      if (!matchesPaymentLinksResourceInvoiceSettings) add("PaymentLinksResourceInvoiceSettings: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
