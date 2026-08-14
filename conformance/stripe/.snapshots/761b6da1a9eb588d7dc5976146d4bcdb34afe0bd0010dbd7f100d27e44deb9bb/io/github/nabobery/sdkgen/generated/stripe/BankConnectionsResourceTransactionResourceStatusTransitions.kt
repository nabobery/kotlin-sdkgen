package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_transaction_resource_status_transitions
 */
@Serializable(with = BankConnectionsResourceTransactionResourceStatusTransitions.Serializer::class)
public class BankConnectionsResourceTransactionResourceStatusTransitions(
  /**
   * Time at which this transaction posted. Measured in seconds since the Unix epoch.
   */
  public val postedAt: Int? = null,
  /**
   * Time at which this transaction was voided. Measured in seconds since the Unix epoch.
   */
  public val voidAt: Int? = null,
) {
  public class Builder {
    /**
     * Time at which this transaction posted. Measured in seconds since the Unix epoch.
     */
    public var postedAt: Int? = null

    /**
     * Time at which this transaction was voided. Measured in seconds since the Unix epoch.
     */
    public var voidAt: Int? = null

    public fun build(): BankConnectionsResourceTransactionResourceStatusTransitions = BankConnectionsResourceTransactionResourceStatusTransitions(
      postedAt = postedAt,
      voidAt = voidAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceTransactionResourceStatusTransitions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BankConnectionsResourceTransactionResourceStatusTransitions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceTransactionResourceStatusTransitions {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceTransactionResourceStatusTransitions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceTransactionResourceStatusTransitions must be a JSON object")
      return BankConnectionsResourceTransactionResourceStatusTransitions(
        postedAt = rawObject["posted_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        voidAt = rawObject["void_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceTransactionResourceStatusTransitions) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceTransactionResourceStatusTransitions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.postedAt?.let { put("posted_at", json.encodeToJsonElement(it)) }
        value.voidAt?.let { put("void_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceTransactionResourceStatusTransitions(block: BankConnectionsResourceTransactionResourceStatusTransitions.Builder.() -> Unit): BankConnectionsResourceTransactionResourceStatusTransitions = BankConnectionsResourceTransactionResourceStatusTransitions.build(block)
