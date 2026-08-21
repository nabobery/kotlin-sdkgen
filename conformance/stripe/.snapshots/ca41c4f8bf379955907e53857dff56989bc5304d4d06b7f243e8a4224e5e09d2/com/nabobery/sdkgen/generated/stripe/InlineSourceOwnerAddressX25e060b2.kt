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

public enum class InlineSourceOwnerAddressX25e060b2Branch {
  Address,
}

public sealed class InlineSourceOwnerAddressX25e060b2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSourceOwnerAddressX25e060b2NoMatchException(
  message: String,
) : InlineSourceOwnerAddressX25e060b2DecodingException(message)

internal data class InlineSourceOwnerAddressX25e060b2Inspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * Owner's address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_owner/properties/address
 */
@Serializable(with = InlineSourceOwnerAddressX25e060b2.Serializer::class)
public class InlineSourceOwnerAddressX25e060b2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSourceOwnerAddressX25e060b2Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches: Set<InlineSourceOwnerAddressX25e060b2Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlineSourceOwnerAddressX25e060b2Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSourceOwnerAddressX25e060b2 {
      val inspection = inspectInlineSourceOwnerAddressX25e060b2(raw)
      if (inspection.matchCount == 0) {
        throw InlineSourceOwnerAddressX25e060b2NoMatchException("InlineSourceOwnerAddressX25e060b2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSourceOwnerAddressX25e060b2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSourceOwnerAddressX25e060b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSourceOwnerAddressX25e060b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSourceOwnerAddressX25e060b2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSourceOwnerAddressX25e060b2) {
      encoder.requireJsonEncoder("InlineSourceOwnerAddressX25e060b2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSourceOwnerAddressX25e060b2(element: JsonElement): InlineSourceOwnerAddressX25e060b2Inspection {
  val raw = element as? JsonObject ?: return InlineSourceOwnerAddressX25e060b2Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlineSourceOwnerAddressX25e060b2Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
