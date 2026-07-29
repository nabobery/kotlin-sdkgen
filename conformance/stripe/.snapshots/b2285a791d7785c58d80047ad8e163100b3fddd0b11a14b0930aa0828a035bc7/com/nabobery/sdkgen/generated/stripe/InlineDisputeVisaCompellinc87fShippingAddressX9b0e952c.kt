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

public enum class InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cBranch {
  DisputeTransactionShippingAddress,
}

public sealed class InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cNoMatchException(
  message: String,
) : InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cDecodingException(message)

internal data class InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cInspection(
  public val matchesDisputeTransactionShippingAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesDisputeTransactionShippingAddress).count { it }
}

/**
 * The address to which a physical product was shipped. All fields are required for Visa Compelling Evidence 3.0
 * evidence submission.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/dispute_visa_compelling_evidence3_prior_undisputed_transaction/prope
 * rties/shipping_address
 */
@Serializable(with = InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c.Serializer::class)
public class InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cInspection,
) {
  public val disputeTransactionShippingAddress: DisputeTransactionShippingAddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDisputeTransactionShippingAddress) json.decodeFromJsonElement<DisputeTransactionShippingAddressView>(raw) else null }

  public val matchedBranches: Set<InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cBranch>
    get() = buildSet {
      if (inspection.matchesDisputeTransactionShippingAddress) add(InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cBranch.DisputeTransactionShippingAddress)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c {
      val inspection = inspectInlineDisputeVisaCompellinc87fShippingAddressX9b0e952c(raw)
      if (inspection.matchCount == 0) {
        throw InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cNoMatchException("InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c) {
      encoder.requireJsonEncoder("InlineDisputeVisaCompellinc87fShippingAddressX9b0e952c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDisputeVisaCompellinc87fShippingAddressX9b0e952c(element: JsonElement): InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cInspection {
  val raw = element as? JsonObject ?: return InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cInspection(
    matchesDisputeTransactionShippingAddress = false,
    failures = listOf("DisputeTransactionShippingAddress: expected JSON object"),
  )
  val matchesDisputeTransactionShippingAddress = true
  return InlineDisputeVisaCompellinc87fShippingAddressX9b0e952cInspection(
    matchesDisputeTransactionShippingAddress = matchesDisputeTransactionShippingAddress,
    failures = buildList {
      if (!matchesDisputeTransactionShippingAddress) add("DisputeTransactionShippingAddress: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
