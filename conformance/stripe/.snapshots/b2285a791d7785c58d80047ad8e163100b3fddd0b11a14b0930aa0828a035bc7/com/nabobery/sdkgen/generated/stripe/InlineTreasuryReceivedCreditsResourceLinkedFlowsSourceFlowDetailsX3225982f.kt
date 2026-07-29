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

public enum class InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fBranch {
  TreasuryReceivedCreditsResourceSourceFlowsDetails,
}

public sealed class InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fNoMatchException(
  message: String,
) : InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fDecodingException(message)

internal data class InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fInspection(
  public val matchesTreasuryReceivedCreditsResourceSourceFlowsDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryReceivedCreditsResourceSourceFlowsDetails).count { it }
}

/**
 * The expandable object of the source flow.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_received_credits_resource_linked_flows/properties/source_fl
 * ow_details
 */
@Serializable(with = InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f.Serializer::class)
public class InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fInspection,
) {
  public val treasuryReceivedCreditsResourceSourceFlowsDetails:
      TreasuryReceivedCreditsResourceSourceFlowsDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryReceivedCreditsResourceSourceFlowsDetails) json.decodeFromJsonElement<TreasuryReceivedCreditsResourceSourceFlowsDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fBranch>
    get() = buildSet {
      if (inspection.matchesTreasuryReceivedCreditsResourceSourceFlowsDetails) add(InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fBranch.TreasuryReceivedCreditsResourceSourceFlowsDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f {
      val inspection = inspectInlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fNoMatchException("InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f) {
      encoder.requireJsonEncoder("InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f(element: JsonElement): InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fInspection(
    matchesTreasuryReceivedCreditsResourceSourceFlowsDetails = false,
    failures = listOf("TreasuryReceivedCreditsResourceSourceFlowsDetails: expected JSON object"),
  )
  val matchesTreasuryReceivedCreditsResourceSourceFlowsDetails = raw["type"] != null
  return InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982fInspection(
    matchesTreasuryReceivedCreditsResourceSourceFlowsDetails = matchesTreasuryReceivedCreditsResourceSourceFlowsDetails,
    failures = buildList {
      if (!matchesTreasuryReceivedCreditsResourceSourceFlowsDetails) add("TreasuryReceivedCreditsResourceSourceFlowsDetails: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
