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

public enum class InlineInvoiceCustomerShippingX637aa4fdBranch {
  Shipping,
}

public sealed class InlineInvoiceCustomerShippingX637aa4fdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceCustomerShippingX637aa4fdNoMatchException(
  message: String,
) : InlineInvoiceCustomerShippingX637aa4fdDecodingException(message)

internal data class InlineInvoiceCustomerShippingX637aa4fdInspection(
  public val matchesShipping: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesShipping).count { it }
}

/**
 * The customer's shipping information. Until the invoice is finalized, this field will equal `customer.shipping`. Once
 * the invoice is finalized, this field will no longer be updated.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/customer_shipping
 */
@Serializable(with = InlineInvoiceCustomerShippingX637aa4fd.Serializer::class)
public class InlineInvoiceCustomerShippingX637aa4fd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceCustomerShippingX637aa4fdInspection,
) {
  public val shipping: ShippingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShipping) json.decodeFromJsonElement<ShippingView>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceCustomerShippingX637aa4fdBranch>
    get() = buildSet {
      if (inspection.matchesShipping) add(InlineInvoiceCustomerShippingX637aa4fdBranch.Shipping)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceCustomerShippingX637aa4fd {
      val inspection = inspectInlineInvoiceCustomerShippingX637aa4fd(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceCustomerShippingX637aa4fdNoMatchException("InlineInvoiceCustomerShippingX637aa4fd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceCustomerShippingX637aa4fd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceCustomerShippingX637aa4fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceCustomerShippingX637aa4fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceCustomerShippingX637aa4fd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceCustomerShippingX637aa4fd) {
      encoder.requireJsonEncoder("InlineInvoiceCustomerShippingX637aa4fd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceCustomerShippingX637aa4fd(element: JsonElement): InlineInvoiceCustomerShippingX637aa4fdInspection {
  val raw = element as? JsonObject ?: return InlineInvoiceCustomerShippingX637aa4fdInspection(
    matchesShipping = false,
    failures = listOf("Shipping: expected JSON object"),
  )
  val matchesShipping = true
  return InlineInvoiceCustomerShippingX637aa4fdInspection(
    matchesShipping = matchesShipping,
    failures = buildList {
      if (!matchesShipping) add("Shipping: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
