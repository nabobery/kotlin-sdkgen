package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineSourceOwnerVerifiedAddressXc1a5a209Branch {
  Address,
}

public sealed class InlineSourceOwnerVerifiedAddressXc1a5a209DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSourceOwnerVerifiedAddressXc1a5a209NoMatchException(
  message: String,
) : InlineSourceOwnerVerifiedAddressXc1a5a209DecodingException(message)

internal data class InlineSourceOwnerVerifiedAddressXc1a5a209Inspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * Verified owner's address. Verified values are verified or provided by the payment method directly (and if supported)
 * at the time of authorization or settlement. They cannot be set or mutated.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_owner/properties/verified_address
 */
@Serializable(with = InlineSourceOwnerVerifiedAddressXc1a5a209.Serializer::class)
public class InlineSourceOwnerVerifiedAddressXc1a5a209 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSourceOwnerVerifiedAddressXc1a5a209Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches: Set<InlineSourceOwnerVerifiedAddressXc1a5a209Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlineSourceOwnerVerifiedAddressXc1a5a209Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSourceOwnerVerifiedAddressXc1a5a209 {
      val inspection = inspectInlineSourceOwnerVerifiedAddressXc1a5a209(raw)
      if (inspection.matchCount == 0) {
        throw InlineSourceOwnerVerifiedAddressXc1a5a209NoMatchException("InlineSourceOwnerVerifiedAddressXc1a5a209 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSourceOwnerVerifiedAddressXc1a5a209(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSourceOwnerVerifiedAddressXc1a5a209> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSourceOwnerVerifiedAddressXc1a5a209 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSourceOwnerVerifiedAddressXc1a5a209")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSourceOwnerVerifiedAddressXc1a5a209) {
      encoder.requireJsonEncoder("InlineSourceOwnerVerifiedAddressXc1a5a209").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSourceOwnerVerifiedAddressXc1a5a209(element: JsonElement): InlineSourceOwnerVerifiedAddressXc1a5a209Inspection {
  val raw = element as? JsonObject ?: return InlineSourceOwnerVerifiedAddressXc1a5a209Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlineSourceOwnerVerifiedAddressXc1a5a209Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
