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

public enum class InlineGelatoVerifiedOutputsAddressXfcb1d786Branch {
  Address,
}

public sealed class InlineGelatoVerifiedOutputsAddressXfcb1d786DecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoVerifiedOutputsAddressXfcb1d786NoMatchException(
  message: String,
) : InlineGelatoVerifiedOutputsAddressXfcb1d786DecodingException(message)

internal data class InlineGelatoVerifiedOutputsAddressXfcb1d786Inspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * The user's verified address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_verified_outputs/properties/address
 */
@Serializable(with = InlineGelatoVerifiedOutputsAddressXfcb1d786.Serializer::class)
public class InlineGelatoVerifiedOutputsAddressXfcb1d786 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoVerifiedOutputsAddressXfcb1d786Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoVerifiedOutputsAddressXfcb1d786Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlineGelatoVerifiedOutputsAddressXfcb1d786Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoVerifiedOutputsAddressXfcb1d786 {
      val inspection = inspectInlineGelatoVerifiedOutputsAddressXfcb1d786(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoVerifiedOutputsAddressXfcb1d786NoMatchException("InlineGelatoVerifiedOutputsAddressXfcb1d786 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoVerifiedOutputsAddressXfcb1d786(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineGelatoVerifiedOutputsAddressXfcb1d786> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoVerifiedOutputsAddressXfcb1d786 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoVerifiedOutputsAddressXfcb1d786")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoVerifiedOutputsAddressXfcb1d786) {
      encoder.requireJsonEncoder("InlineGelatoVerifiedOutputsAddressXfcb1d786").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoVerifiedOutputsAddressXfcb1d786(element: JsonElement): InlineGelatoVerifiedOutputsAddressXfcb1d786Inspection {
  val raw = element as? JsonObject ?: return InlineGelatoVerifiedOutputsAddressXfcb1d786Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlineGelatoVerifiedOutputsAddressXfcb1d786Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
