package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class TreasuryFinancialAccountsResourceClosedStatusDetailsView internal constructor(
  public val reasons:
      List<InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334>,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_closed_status_details
 */
@Serializable(with = TreasuryFinancialAccountsResourceClosedStatusDetails.Serializer::class)
public class TreasuryFinancialAccountsResourceClosedStatusDetails(
  reasons: List<InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334>,
) {
  /**
   * The array that contains reasons for a FinancialAccount closure.
   */
  public val reasons:
      List<InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334> =
      reasons.toList()

  public class Builder {
    private var reasonsValue:
        List<InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334>? = null

    public var reasons:
        List<InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334>
      get() = requireNotNull(reasonsValue) { "reasons is required" }.toList()
      set(`value`) {
        reasonsValue = value.toList()
      }

    public fun build(): TreasuryFinancialAccountsResourceClosedStatusDetails {
      check(reasonsValue != null) { "reasons is required" }
      return TreasuryFinancialAccountsResourceClosedStatusDetails(
        reasons = reasons,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceClosedStatusDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryFinancialAccountsResourceClosedStatusDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceClosedStatusDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceClosedStatusDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceClosedStatusDetails must be a JSON object")
      val reasons = json.decodeRequired<List<InlineTreasuryFinancialAccountsResourceClosedStatusDetailsReasonsItemX8c5d4334>>(rawObject, "reasons")
      return TreasuryFinancialAccountsResourceClosedStatusDetails(
        reasons = reasons,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceClosedStatusDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceClosedStatusDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reasons", json.encodeToJsonElement(value.reasons))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryFinancialAccountsResourceClosedStatusDetails(block: TreasuryFinancialAccountsResourceClosedStatusDetails.Builder.() -> Unit): TreasuryFinancialAccountsResourceClosedStatusDetails = TreasuryFinancialAccountsResourceClosedStatusDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryFinancialAccountsResourceClosedStatusDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
