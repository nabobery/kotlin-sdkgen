package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormXc53c5bbd.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormXc53c5bbd(
  /**
   * The dispute amount in the card's currency and in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal). If not set, defaults to the full transaction amount.
   */
  public val amount: Int? = null,
  /**
   * Evidence provided for the dispute.
   */
  public val evidence: InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * The ID of the issuing transaction to create a dispute for. For transaction on Treasury FinancialAccounts, use
   * `treasury.received_debit`.
   */
  public val transaction: String? = null,
  /**
   * Params for disputes related to Treasury FinancialAccounts
   */
  public val treasury: InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * The dispute amount in the card's currency and in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal). If not set, defaults to the full transaction amount.
     */
    public var amount: Int? = null

    /**
     * Evidence provided for the dispute.
     */
    public var evidence: InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The ID of the issuing transaction to create a dispute for. For transaction on Treasury FinancialAccounts, use
     * `treasury.received_debit`.
     */
    public var transaction: String? = null

    /**
     * Params for disputes related to Treasury FinancialAccounts
     */
    public var treasury: InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29? = null

    public fun build(): InlineV1IssuingDisputesPostRequestFormXc53c5bbd = InlineV1IssuingDisputesPostRequestFormXc53c5bbd(
      amount = amount,
      evidence = evidence,
      expand = expand,
      metadata = metadata,
      transaction = transaction,
      treasury = treasury,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormXc53c5bbd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormXc53c5bbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormXc53c5bbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormXc53c5bbd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormXc53c5bbd must be a JSON object")
      return InlineV1IssuingDisputesPostRequestFormXc53c5bbd(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        evidence = rawObject["evidence"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceXc37b39e9>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        transaction = rawObject["transaction"]?.let { json.decodeFromJsonElement<String>(it) },
        treasury = rawObject["treasury"]?.let { json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormXc53c5bbd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormXc53c5bbd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.evidence?.let { put("evidence", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.transaction?.let { put("transaction", it) }
        value.treasury?.let { put("treasury", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormXc53c5bbd(block: InlineV1IssuingDisputesPostRequestFormXc53c5bbd.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormXc53c5bbd = InlineV1IssuingDisputesPostRequestFormXc53c5bbd.build(block)
