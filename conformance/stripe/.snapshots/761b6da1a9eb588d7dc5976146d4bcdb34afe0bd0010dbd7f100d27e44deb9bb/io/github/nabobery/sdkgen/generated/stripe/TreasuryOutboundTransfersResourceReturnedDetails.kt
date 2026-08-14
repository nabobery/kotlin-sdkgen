package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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

@Serializable
public data class TreasuryOutboundTransfersResourceReturnedDetailsView(
  public val code: InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46,
  public val transaction:
      InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_outbound_transfers_resource_returned_details
 */
@Serializable(with = TreasuryOutboundTransfersResourceReturnedDetails.Serializer::class)
public class TreasuryOutboundTransfersResourceReturnedDetails(
  /**
   * Reason for the return.
   */
  public val code: InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46,
  /**
   * The Transaction associated with this object.
   */
  public val transaction:
      InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee,
) {
  public class Builder {
    private var codeValue: InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46? =
        null

    public var code: InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    private var transactionValue:
        InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee? = null

    public var transaction:
        InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee
      get() = requireNotNull(transactionValue) { "transaction is required" }
      set(`value`) {
        transactionValue = value
      }

    public fun build(): TreasuryOutboundTransfersResourceReturnedDetails {
      check(codeValue != null) { "code is required" }
      check(transactionValue != null) { "transaction is required" }
      return TreasuryOutboundTransfersResourceReturnedDetails(
        code = code,
        transaction = transaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryOutboundTransfersResourceReturnedDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryOutboundTransfersResourceReturnedDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryOutboundTransfersResourceReturnedDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryOutboundTransfersResourceReturnedDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryOutboundTransfersResourceReturnedDetails must be a JSON object")
      val code = json.decodeRequired<InlineTreasuryOutboundTransfersResourceReturnedDetailsCodeX5770bf46>(rawObject, "code")
      val transaction = json.decodeRequired<InlineTreasuryOutboundTransfersResourceReturnedDetailsTransactionX427e24ee>(rawObject, "transaction")
      return TreasuryOutboundTransfersResourceReturnedDetails(
        code = code,
        transaction = transaction,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryOutboundTransfersResourceReturnedDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryOutboundTransfersResourceReturnedDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        put("transaction", json.encodeToJsonElement(value.transaction))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryOutboundTransfersResourceReturnedDetails(block: TreasuryOutboundTransfersResourceReturnedDetails.Builder.() -> Unit): TreasuryOutboundTransfersResourceReturnedDetails = TreasuryOutboundTransfersResourceReturnedDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryOutboundTransfersResourceReturnedDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
