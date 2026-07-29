package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a
 */
@Serializable(with = InlineV1TransfersPostRequestFormX82d647ba.Serializer::class)
public class InlineV1TransfersPostRequestFormX82d647ba(
  /**
   * Three-letter [ISO code for currency](https://www.iso.org/iso-4217-currency-codes.html) in lowercase. Must be a
   * [supported currency](https://docs.stripe.com/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * The ID of a connected Stripe account. <a href="/docs/connect/separate-charges-and-transfers">See the Connect
   * documentation</a> for details.
   */
  public val destination: String,
  /**
   * A positive integer in cents (or local equivalent) representing how much to transfer.
   */
  public val amount: Int? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * You can use this parameter to transfer funds from a charge before they are added to your available balance. A
   * pending balance will transfer immediately but the funds will not become available until the original charge becomes
   * available. [See the Connect
   * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-availability) for details.
   */
  public val sourceTransaction: String? = null,
  /**
   * The source balance to use for this transfer. One of `bank_account`, `card`, or `fpx`. For most users, this will
   * default to `card`.
   */
  public val sourceType: InlineV1TransfersPostRequestFormSourceTypeX11473d86? = null,
  /**
   * A string that identifies this transaction as part of a group. See the [Connect
   * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
   */
  public val transferGroup: String? = null,
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
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var destinationValue: String? = null

    public var destination: String
      get() = requireNotNull(destinationValue) { "destination is required" }
      set(`value`) {
        destinationValue = value
      }

    /**
     * A positive integer in cents (or local equivalent) representing how much to transfer.
     */
    public var amount: Int? = null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

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
     * You can use this parameter to transfer funds from a charge before they are added to your available balance. A
     * pending balance will transfer immediately but the funds will not become available until the original charge
     * becomes available. [See the Connect
     * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-availability) for details.
     */
    public var sourceTransaction: String? = null

    /**
     * The source balance to use for this transfer. One of `bank_account`, `card`, or `fpx`. For most users, this will
     * default to `card`.
     */
    public var sourceType: InlineV1TransfersPostRequestFormSourceTypeX11473d86? = null

    /**
     * A string that identifies this transaction as part of a group. See the [Connect
     * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
     */
    public var transferGroup: String? = null

    public fun build(): InlineV1TransfersPostRequestFormX82d647ba {
      check(currencyValue != null) { "currency is required" }
      check(destinationValue != null) { "destination is required" }
      return InlineV1TransfersPostRequestFormX82d647ba(
        currency = currency,
        destination = destination,
        amount = amount,
        description = description,
        expand = expand,
        metadata = metadata,
        sourceTransaction = sourceTransaction,
        sourceType = sourceType,
        transferGroup = transferGroup,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TransfersPostRequestFormX82d647ba = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TransfersPostRequestFormX82d647ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TransfersPostRequestFormX82d647ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TransfersPostRequestFormX82d647ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TransfersPostRequestFormX82d647ba must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val destination = json.decodeRequired<String>(rawObject, "destination")
      return InlineV1TransfersPostRequestFormX82d647ba(
        currency = currency,
        destination = destination,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        sourceTransaction = rawObject["source_transaction"]?.let { json.decodeFromJsonElement<String>(it) },
        sourceType = rawObject["source_type"]?.let { json.decodeFromJsonElement<InlineV1TransfersPostRequestFormSourceTypeX11473d86>(it) },
        transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TransfersPostRequestFormX82d647ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TransfersPostRequestFormX82d647ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        put("destination", value.destination)
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.sourceTransaction?.let { put("source_transaction", it) }
        value.sourceType?.let { put("source_type", json.encodeToJsonElement(it)) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TransfersPostRequestFormX82d647ba(block: InlineV1TransfersPostRequestFormX82d647ba.Builder.() -> Unit): InlineV1TransfersPostRequestFormX82d647ba = InlineV1TransfersPostRequestFormX82d647ba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TransfersPostRequestFormX82d647ba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
