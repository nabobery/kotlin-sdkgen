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

public enum class InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dBranch {
  TreasuryFinancialAccountsResourceClosedStatusDetails,
}

public sealed class InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dNoMatchException(
  message: String,
) : InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dDecodingException(message)

internal data class InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dInspection(
  public val matchesTreasuryFinancialAccountsResourceClosedStatusDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTreasuryFinancialAccountsResourceClosedStatusDetails).count { it }
}

/**
 * Details related to the closure of this FinancialAccount
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_status_details/properties/close
 * d
 */
@Serializable(with = InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d.Serializer::class)
public class InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dInspection,
) {
  public val treasuryFinancialAccountsResourceClosedStatusDetails:
      TreasuryFinancialAccountsResourceClosedStatusDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTreasuryFinancialAccountsResourceClosedStatusDetails) json.decodeFromJsonElement<TreasuryFinancialAccountsResourceClosedStatusDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dBranch>
    get() = buildSet {
      if (inspection.matchesTreasuryFinancialAccountsResourceClosedStatusDetails) add(InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dBranch.TreasuryFinancialAccountsResourceClosedStatusDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d {
      val inspection = inspectInlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d(raw)
      if (inspection.matchCount == 0) {
        throw InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dNoMatchException("InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d) {
      encoder.requireJsonEncoder("InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d(element: JsonElement): InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dInspection {
  val raw = element as? JsonObject ?: return InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dInspection(
    matchesTreasuryFinancialAccountsResourceClosedStatusDetails = false,
    failures = listOf("TreasuryFinancialAccountsResourceClosedStatusDetails: expected JSON object"),
  )
  val matchesTreasuryFinancialAccountsResourceClosedStatusDetails = raw["reasons"] != null
  return InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936dInspection(
    matchesTreasuryFinancialAccountsResourceClosedStatusDetails = matchesTreasuryFinancialAccountsResourceClosedStatusDetails,
    failures = buildList {
      if (!matchesTreasuryFinancialAccountsResourceClosedStatusDetails) add("TreasuryFinancialAccountsResourceClosedStatusDetails: required properties 'reasons' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
