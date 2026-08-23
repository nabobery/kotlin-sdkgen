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

public enum class InlineIssuingCardShippingAddressValidationX88177330Branch {
  IssuingCardShippingAddressValidation,
}

public sealed class InlineIssuingCardShippingAddressValidationX88177330DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardShippingAddressValidationX88177330NoMatchException(
  message: String,
) : InlineIssuingCardShippingAddressValidationX88177330DecodingException(message)

internal data class InlineIssuingCardShippingAddressValidationX88177330Inspection(
  public val matchesIssuingCardShippingAddressValidation: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardShippingAddressValidation).count { it }
}

/**
 * Address validation details for the shipment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping/properties/address_validation
 */
@Serializable(with = InlineIssuingCardShippingAddressValidationX88177330.Serializer::class)
public class InlineIssuingCardShippingAddressValidationX88177330 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardShippingAddressValidationX88177330Inspection,
) {
  public val issuingCardShippingAddressValidation: IssuingCardShippingAddressValidationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardShippingAddressValidation) json.decodeFromJsonElement<IssuingCardShippingAddressValidationView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardShippingAddressValidationX88177330Branch>
    get() = buildSet {
      if (inspection.matchesIssuingCardShippingAddressValidation) add(InlineIssuingCardShippingAddressValidationX88177330Branch.IssuingCardShippingAddressValidation)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardShippingAddressValidationX88177330 {
      val inspection = inspectInlineIssuingCardShippingAddressValidationX88177330(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardShippingAddressValidationX88177330NoMatchException("InlineIssuingCardShippingAddressValidationX88177330 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardShippingAddressValidationX88177330(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardShippingAddressValidationX88177330> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingAddressValidationX88177330 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardShippingAddressValidationX88177330")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingAddressValidationX88177330) {
      encoder.requireJsonEncoder("InlineIssuingCardShippingAddressValidationX88177330").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardShippingAddressValidationX88177330(element: JsonElement): InlineIssuingCardShippingAddressValidationX88177330Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardShippingAddressValidationX88177330Inspection(
    matchesIssuingCardShippingAddressValidation = false,
    failures = listOf("IssuingCardShippingAddressValidation: expected JSON object"),
  )
  val matchesIssuingCardShippingAddressValidation = raw["mode"] != null
  return InlineIssuingCardShippingAddressValidationX88177330Inspection(
    matchesIssuingCardShippingAddressValidation = matchesIssuingCardShippingAddressValidation,
    failures = buildList {
      if (!matchesIssuingCardShippingAddressValidation) add("IssuingCardShippingAddressValidation: required properties 'mode' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
