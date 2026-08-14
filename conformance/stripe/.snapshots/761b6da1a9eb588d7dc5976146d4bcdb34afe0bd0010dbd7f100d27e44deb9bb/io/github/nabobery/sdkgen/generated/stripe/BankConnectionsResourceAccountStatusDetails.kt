package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_status_details
 */
@Serializable(with = BankConnectionsResourceAccountStatusDetails.Serializer::class)
public class BankConnectionsResourceAccountStatusDetails(
  public val active:
      BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails? = null,
) {
  public class Builder {
    public var active: BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails? =
        null

    public fun build(): BankConnectionsResourceAccountStatusDetails = BankConnectionsResourceAccountStatusDetails(
      active = active,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceAccountStatusDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BankConnectionsResourceAccountStatusDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceAccountStatusDetails {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceAccountStatusDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceAccountStatusDetails must be a JSON object")
      return BankConnectionsResourceAccountStatusDetails(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceAccountStatusDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceAccountStatusDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceAccountStatusDetails(block: BankConnectionsResourceAccountStatusDetails.Builder.() -> Unit): BankConnectionsResourceAccountStatusDetails = BankConnectionsResourceAccountStatusDetails.build(block)
