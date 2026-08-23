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

public enum class InlineCustomerAddressX3f7817b0Branch {
  Address,
}

public sealed class InlineCustomerAddressX3f7817b0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerAddressX3f7817b0NoMatchException(
  message: String,
) : InlineCustomerAddressX3f7817b0DecodingException(message)

internal data class InlineCustomerAddressX3f7817b0Inspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * The customer's address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/address
 */
@Serializable(with = InlineCustomerAddressX3f7817b0.Serializer::class)
public class InlineCustomerAddressX3f7817b0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerAddressX3f7817b0Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches: Set<InlineCustomerAddressX3f7817b0Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlineCustomerAddressX3f7817b0Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerAddressX3f7817b0 {
      val inspection = inspectInlineCustomerAddressX3f7817b0(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerAddressX3f7817b0NoMatchException("InlineCustomerAddressX3f7817b0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerAddressX3f7817b0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerAddressX3f7817b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerAddressX3f7817b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerAddressX3f7817b0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerAddressX3f7817b0) {
      encoder.requireJsonEncoder("InlineCustomerAddressX3f7817b0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerAddressX3f7817b0(element: JsonElement): InlineCustomerAddressX3f7817b0Inspection {
  val raw = element as? JsonObject ?: return InlineCustomerAddressX3f7817b0Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlineCustomerAddressX3f7817b0Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
