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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_network_token_mastercard
 */
@Serializable(with = IssuingNetworkTokenMastercard.Serializer::class)
public class IssuingNetworkTokenMastercard(
  /**
   * The network-unique identifier for the token.
   */
  public val tokenReferenceId: String,
  /**
   * The ID of the entity requesting tokenization, specific to MasterCard.
   */
  public val tokenRequestorId: String,
  /**
   * A unique reference ID from MasterCard to represent the card account number.
   */
  public val cardReferenceId: String? = null,
  /**
   * The name of the entity requesting tokenization, if known. This is directly provided from MasterCard.
   */
  public val tokenRequestorName: String? = null,
) {
  public class Builder {
    private var tokenReferenceIdValue: String? = null

    public var tokenReferenceId: String
      get() = requireNotNull(tokenReferenceIdValue) { "tokenReferenceId is required" }
      set(`value`) {
        tokenReferenceIdValue = value
      }

    private var tokenRequestorIdValue: String? = null

    public var tokenRequestorId: String
      get() = requireNotNull(tokenRequestorIdValue) { "tokenRequestorId is required" }
      set(`value`) {
        tokenRequestorIdValue = value
      }

    /**
     * A unique reference ID from MasterCard to represent the card account number.
     */
    public var cardReferenceId: String? = null

    /**
     * The name of the entity requesting tokenization, if known. This is directly provided from MasterCard.
     */
    public var tokenRequestorName: String? = null

    public fun build(): IssuingNetworkTokenMastercard {
      check(tokenReferenceIdValue != null) { "tokenReferenceId is required" }
      check(tokenRequestorIdValue != null) { "tokenRequestorId is required" }
      return IssuingNetworkTokenMastercard(
        tokenReferenceId = tokenReferenceId,
        tokenRequestorId = tokenRequestorId,
        cardReferenceId = cardReferenceId,
        tokenRequestorName = tokenRequestorName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingNetworkTokenMastercard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingNetworkTokenMastercard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingNetworkTokenMastercard {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingNetworkTokenMastercard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingNetworkTokenMastercard must be a JSON object")
      val tokenReferenceId = json.decodeRequired<String>(rawObject, "token_reference_id")
      val tokenRequestorId = json.decodeRequired<String>(rawObject, "token_requestor_id")
      return IssuingNetworkTokenMastercard(
        tokenReferenceId = tokenReferenceId,
        tokenRequestorId = tokenRequestorId,
        cardReferenceId = rawObject["card_reference_id"]?.let { json.decodeFromJsonElement<String>(it) },
        tokenRequestorName = rawObject["token_requestor_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingNetworkTokenMastercard) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingNetworkTokenMastercard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("token_reference_id", value.tokenReferenceId)
        put("token_requestor_id", value.tokenRequestorId)
        value.cardReferenceId?.let { put("card_reference_id", it) }
        value.tokenRequestorName?.let { put("token_requestor_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingNetworkTokenMastercard(block: IssuingNetworkTokenMastercard.Builder.() -> Unit): IssuingNetworkTokenMastercard = IssuingNetworkTokenMastercard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingNetworkTokenMastercard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
