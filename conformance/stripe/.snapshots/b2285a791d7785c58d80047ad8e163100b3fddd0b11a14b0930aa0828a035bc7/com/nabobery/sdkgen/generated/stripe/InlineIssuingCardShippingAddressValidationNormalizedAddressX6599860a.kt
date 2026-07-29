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

public enum class InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aBranch {
  Address,
}

public sealed class InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aNoMatchException(
  message: String,
) : InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aDecodingException(message)

internal data class InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aInspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * The normalized shipping address.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping_address_validation/properties/normalized_addre
 * ss
 */
@Serializable(with = InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a.Serializer::class)
public class InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aInspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aBranch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aBranch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a {
      val inspection = inspectInlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aNoMatchException("InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a) {
      encoder.requireJsonEncoder("InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardShippingAddressValidationNormalizedAddressX6599860a(element: JsonElement): InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aInspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aInspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlineIssuingCardShippingAddressValidationNormalizedAddressX6599860aInspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
