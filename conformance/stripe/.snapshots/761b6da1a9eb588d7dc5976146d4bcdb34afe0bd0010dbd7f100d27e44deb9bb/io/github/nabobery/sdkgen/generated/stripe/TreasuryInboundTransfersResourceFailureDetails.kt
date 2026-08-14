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
public data class TreasuryInboundTransfersResourceFailureDetailsView(
  public val code: InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_inbound_transfers_resource_failure_details
 */
@Serializable(with = TreasuryInboundTransfersResourceFailureDetails.Serializer::class)
public class TreasuryInboundTransfersResourceFailureDetails(
  /**
   * Reason for the failure.
   */
  public val code: InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5,
) {
  public class Builder {
    private var codeValue: InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5? = null

    public var code: InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    public fun build(): TreasuryInboundTransfersResourceFailureDetails {
      check(codeValue != null) { "code is required" }
      return TreasuryInboundTransfersResourceFailureDetails(
        code = code,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryInboundTransfersResourceFailureDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryInboundTransfersResourceFailureDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryInboundTransfersResourceFailureDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryInboundTransfersResourceFailureDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryInboundTransfersResourceFailureDetails must be a JSON object")
      val code = json.decodeRequired<InlineTreasuryInboundTransfersResourceFailureDetailsCodeX56a507b5>(rawObject, "code")
      return TreasuryInboundTransfersResourceFailureDetails(
        code = code,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryInboundTransfersResourceFailureDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryInboundTransfersResourceFailureDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryInboundTransfersResourceFailureDetails(block: TreasuryInboundTransfersResourceFailureDetails.Builder.() -> Unit): TreasuryInboundTransfersResourceFailureDetails = TreasuryInboundTransfersResourceFailureDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryInboundTransfersResourceFailureDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
