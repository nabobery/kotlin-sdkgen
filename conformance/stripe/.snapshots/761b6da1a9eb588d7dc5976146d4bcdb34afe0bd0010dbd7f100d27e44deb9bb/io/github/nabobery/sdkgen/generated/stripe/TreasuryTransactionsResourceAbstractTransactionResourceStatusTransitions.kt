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
 * sdkgen://source/openapi.json#/components/schemas/treasury_transactions_resource_abstract_transaction_resource_status_
 * transitions
 */
@Serializable(with = TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions.Serializer::class)
public class TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions(
  /**
   * Timestamp describing when the Transaction changed status to `posted`.
   */
  public val postedAt: Int? = null,
  /**
   * Timestamp describing when the Transaction changed status to `void`.
   */
  public val voidAt: Int? = null,
) {
  public class Builder {
    /**
     * Timestamp describing when the Transaction changed status to `posted`.
     */
    public var postedAt: Int? = null

    /**
     * Timestamp describing when the Transaction changed status to `void`.
     */
    public var voidAt: Int? = null

    public fun build(): TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions = TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions(
      postedAt = postedAt,
      voidAt = voidAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions must be a JSON object")
      return TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions(
        postedAt = rawObject["posted_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        voidAt = rawObject["void_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.postedAt?.let { put("posted_at", json.encodeToJsonElement(it)) }
        value.voidAt?.let { put("void_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryTransactionsResourceAbstractTransactionResourceStatusTransitions(block: TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions.Builder.() -> Unit): TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions = TreasuryTransactionsResourceAbstractTransactionResourceStatusTransitions.build(block)
