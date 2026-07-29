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

public enum class InlineCustomerTaxLocationXdb64c412Branch {
  CustomerTaxLocation,
}

public sealed class InlineCustomerTaxLocationXdb64c412DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerTaxLocationXdb64c412NoMatchException(
  message: String,
) : InlineCustomerTaxLocationXdb64c412DecodingException(message)

internal data class InlineCustomerTaxLocationXdb64c412Inspection(
  public val matchesCustomerTaxLocation: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCustomerTaxLocation).count { it }
}

/**
 * The identified tax location of the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_tax/properties/location
 */
@Serializable(with = InlineCustomerTaxLocationXdb64c412.Serializer::class)
public class InlineCustomerTaxLocationXdb64c412 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerTaxLocationXdb64c412Inspection,
) {
  public val customerTaxLocation: CustomerTaxLocationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomerTaxLocation) json.decodeFromJsonElement<CustomerTaxLocationView>(raw) else null }

  public val matchedBranches: Set<InlineCustomerTaxLocationXdb64c412Branch>
    get() = buildSet {
      if (inspection.matchesCustomerTaxLocation) add(InlineCustomerTaxLocationXdb64c412Branch.CustomerTaxLocation)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerTaxLocationXdb64c412 {
      val inspection = inspectInlineCustomerTaxLocationXdb64c412(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerTaxLocationXdb64c412NoMatchException("InlineCustomerTaxLocationXdb64c412 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerTaxLocationXdb64c412(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCustomerTaxLocationXdb64c412> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerTaxLocationXdb64c412 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerTaxLocationXdb64c412")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerTaxLocationXdb64c412) {
      encoder.requireJsonEncoder("InlineCustomerTaxLocationXdb64c412").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerTaxLocationXdb64c412(element: JsonElement): InlineCustomerTaxLocationXdb64c412Inspection {
  val raw = element as? JsonObject ?: return InlineCustomerTaxLocationXdb64c412Inspection(
    matchesCustomerTaxLocation = false,
    failures = listOf("CustomerTaxLocation: expected JSON object"),
  )
  val matchesCustomerTaxLocation = raw["country"].isString() && raw["source"] != null
  return InlineCustomerTaxLocationXdb64c412Inspection(
    matchesCustomerTaxLocation = matchesCustomerTaxLocation,
    failures = buildList {
      if (!matchesCustomerTaxLocation) add("CustomerTaxLocation: required properties 'country', 'source' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
