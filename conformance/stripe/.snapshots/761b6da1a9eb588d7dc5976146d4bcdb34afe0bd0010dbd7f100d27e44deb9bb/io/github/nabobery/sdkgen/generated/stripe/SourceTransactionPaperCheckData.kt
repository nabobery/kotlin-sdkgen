package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_transaction_paper_check_data
 */
@Serializable(with = SourceTransactionPaperCheckData.Serializer::class)
public class SourceTransactionPaperCheckData(
  /**
   * Time at which the deposited funds will be available for use. Measured in seconds since the Unix epoch.
   */
  public val availableAt: String? = null,
  /**
   * Comma-separated list of invoice IDs associated with the paper check.
   */
  public val invoices: String? = null,
) {
  public class Builder {
    /**
     * Time at which the deposited funds will be available for use. Measured in seconds since the Unix epoch.
     */
    public var availableAt: String? = null

    /**
     * Comma-separated list of invoice IDs associated with the paper check.
     */
    public var invoices: String? = null

    public fun build(): SourceTransactionPaperCheckData = SourceTransactionPaperCheckData(
      availableAt = availableAt,
      invoices = invoices,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTransactionPaperCheckData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTransactionPaperCheckData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTransactionPaperCheckData {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTransactionPaperCheckData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTransactionPaperCheckData must be a JSON object")
      return SourceTransactionPaperCheckData(
        availableAt = rawObject["available_at"]?.let { json.decodeFromJsonElement<String>(it) },
        invoices = rawObject["invoices"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTransactionPaperCheckData) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTransactionPaperCheckData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.availableAt?.let { put("available_at", it) }
        value.invoices?.let { put("invoices", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTransactionPaperCheckData(block: SourceTransactionPaperCheckData.Builder.() -> Unit): SourceTransactionPaperCheckData = SourceTransactionPaperCheckData.build(block)
