package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ChargeTransferDataView(
  public val amount: Int? = null,
  public val destination: InlineChargeTransferDataDestinationX0d1b68b9,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge_transfer_data
 */
@Serializable(with = ChargeTransferData.Serializer::class)
public class ChargeTransferData(
  /**
   * ID of an existing, connected Stripe account to transfer funds to if `transfer_data` was specified in the charge
   * request.
   */
  public val destination: InlineChargeTransferDataDestinationX0d1b68b9,
  /**
   * The amount transferred to the destination account, if specified. By default, the entire charge amount is
   * transferred to the destination account.
   */
  public val amount: Int? = null,
) {
  public class Builder {
    private var destinationValue: InlineChargeTransferDataDestinationX0d1b68b9? = null

    public var destination: InlineChargeTransferDataDestinationX0d1b68b9
      get() = requireNotNull(destinationValue) { "destination is required" }
      set(`value`) {
        destinationValue = value
      }

    /**
     * The amount transferred to the destination account, if specified. By default, the entire charge amount is
     * transferred to the destination account.
     */
    public var amount: Int? = null

    public fun build(): ChargeTransferData {
      check(destinationValue != null) { "destination is required" }
      return ChargeTransferData(
        destination = destination,
        amount = amount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChargeTransferData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChargeTransferData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChargeTransferData {
      val jsonDecoder = decoder.requireJsonDecoder("ChargeTransferData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChargeTransferData must be a JSON object")
      val destination = json.decodeRequired<InlineChargeTransferDataDestinationX0d1b68b9>(rawObject, "destination")
      return ChargeTransferData(
        destination = destination,
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChargeTransferData) {
      val jsonEncoder = encoder.requireJsonEncoder("ChargeTransferData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("destination", json.encodeToJsonElement(value.destination))
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chargeTransferData(block: ChargeTransferData.Builder.() -> Unit): ChargeTransferData = ChargeTransferData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChargeTransferData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
