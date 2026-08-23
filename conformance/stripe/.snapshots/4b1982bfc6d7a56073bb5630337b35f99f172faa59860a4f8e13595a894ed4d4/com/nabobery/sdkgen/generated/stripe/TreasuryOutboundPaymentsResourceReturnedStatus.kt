package com.nabobery.sdkgen.generated.stripe

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
public data class TreasuryOutboundPaymentsResourceReturnedStatusView(
  public val code: InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292,
  public val transaction: InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_outbound_payments_resource_returned_status
 */
@Serializable(with = TreasuryOutboundPaymentsResourceReturnedStatus.Serializer::class)
public class TreasuryOutboundPaymentsResourceReturnedStatus(
  /**
   * Reason for the return.
   */
  public val code: InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292,
  /**
   * The Transaction associated with this object.
   */
  public val transaction: InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e,
) {
  public class Builder {
    private var codeValue: InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292? = null

    public var code: InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    private var transactionValue:
        InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e? = null

    public var transaction: InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e
      get() = requireNotNull(transactionValue) { "transaction is required" }
      set(`value`) {
        transactionValue = value
      }

    public fun build(): TreasuryOutboundPaymentsResourceReturnedStatus {
      check(codeValue != null) { "code is required" }
      check(transactionValue != null) { "transaction is required" }
      return TreasuryOutboundPaymentsResourceReturnedStatus(
        code = code,
        transaction = transaction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryOutboundPaymentsResourceReturnedStatus = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryOutboundPaymentsResourceReturnedStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryOutboundPaymentsResourceReturnedStatus {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryOutboundPaymentsResourceReturnedStatus")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryOutboundPaymentsResourceReturnedStatus must be a JSON object")
      val code = json.decodeRequired<InlineTreasuryOutboundPaymentsResourceReturnedStatusCodeX0c1c9292>(rawObject, "code")
      val transaction = json.decodeRequired<InlineTreasuryOutboundPaymentsResourceReturnedStatusTransactionXcd71370e>(rawObject, "transaction")
      return TreasuryOutboundPaymentsResourceReturnedStatus(
        code = code,
        transaction = transaction,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryOutboundPaymentsResourceReturnedStatus) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryOutboundPaymentsResourceReturnedStatus")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        put("transaction", json.encodeToJsonElement(value.transaction))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryOutboundPaymentsResourceReturnedStatus(block: TreasuryOutboundPaymentsResourceReturnedStatus.Builder.() -> Unit): TreasuryOutboundPaymentsResourceReturnedStatus = TreasuryOutboundPaymentsResourceReturnedStatus.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryOutboundPaymentsResourceReturnedStatus is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
