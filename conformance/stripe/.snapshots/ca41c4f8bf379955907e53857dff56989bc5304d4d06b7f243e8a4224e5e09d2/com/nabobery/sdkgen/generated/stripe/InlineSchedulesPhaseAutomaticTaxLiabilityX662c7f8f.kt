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

public enum class InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fBranch {
  ConnectAccountReference,
}

public sealed class InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fNoMatchException(
  message: String,
) : InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fDecodingException(message)

internal data class InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fInspection(
  public val matchesConnectAccountReference: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConnectAccountReference).count { it }
}

/**
 * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
 * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/schedules_phase_automatic_tax/properties/liability
 */
@Serializable(with = InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f.Serializer::class)
public class InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fInspection,
) {
  public val connectAccountReference: ConnectAccountReferenceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConnectAccountReference) json.decodeFromJsonElement<ConnectAccountReferenceView>(raw) else null }

  public val matchedBranches: Set<InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fBranch>
    get() = buildSet {
      if (inspection.matchesConnectAccountReference) add(InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fBranch.ConnectAccountReference)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f {
      val inspection = inspectInlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f(raw)
      if (inspection.matchCount == 0) {
        throw InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fNoMatchException("InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f) {
      encoder.requireJsonEncoder("InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8f(element: JsonElement): InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fInspection {
  val raw = element as? JsonObject ?: return InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fInspection(
    matchesConnectAccountReference = false,
    failures = listOf("ConnectAccountReference: expected JSON object"),
  )
  val matchesConnectAccountReference = raw["type"] != null
  return InlineSchedulesPhaseAutomaticTaxLiabilityX662c7f8fInspection(
    matchesConnectAccountReference = matchesConnectAccountReference,
    failures = buildList {
      if (!matchesConnectAccountReference) add("ConnectAccountReference: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
