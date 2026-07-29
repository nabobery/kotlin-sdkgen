package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1ephemeral_keys/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1ephemeral_keys/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema
 */
@Serializable(with = InlineV1EphemeralKeysPostRequestFormX0d4b063f.Serializer::class)
public class InlineV1EphemeralKeysPostRequestFormX0d4b063f(
  /**
   * The ID of the Customer you'd like to modify using the resulting ephemeral key.
   */
  public val customer: String? = null,
  expand: List<String>? = null,
  /**
   * The ID of the Issuing Card you'd like to access using the resulting ephemeral key.
   */
  public val issuingCard: String? = null,
  /**
   * A single-use token, created by Stripe.js, used for creating ephemeral keys for Issuing Cards without exchanging
   * sensitive information.
   */
  public val nonce: String? = null,
  /**
   * The ID of the Identity VerificationSession you'd like to access using the resulting ephemeral key
   */
  public val verificationSession: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The ID of the Customer you'd like to modify using the resulting ephemeral key.
     */
    public var customer: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The ID of the Issuing Card you'd like to access using the resulting ephemeral key.
     */
    public var issuingCard: String? = null

    /**
     * A single-use token, created by Stripe.js, used for creating ephemeral keys for Issuing Cards without exchanging
     * sensitive information.
     */
    public var nonce: String? = null

    /**
     * The ID of the Identity VerificationSession you'd like to access using the resulting ephemeral key
     */
    public var verificationSession: String? = null

    public fun build(): InlineV1EphemeralKeysPostRequestFormX0d4b063f = InlineV1EphemeralKeysPostRequestFormX0d4b063f(
      customer = customer,
      expand = expand,
      issuingCard = issuingCard,
      nonce = nonce,
      verificationSession = verificationSession,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1EphemeralKeysPostRequestFormX0d4b063f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1EphemeralKeysPostRequestFormX0d4b063f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1EphemeralKeysPostRequestFormX0d4b063f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1EphemeralKeysPostRequestFormX0d4b063f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1EphemeralKeysPostRequestFormX0d4b063f must be a JSON object")
      return InlineV1EphemeralKeysPostRequestFormX0d4b063f(
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        issuingCard = rawObject["issuing_card"]?.let { json.decodeFromJsonElement<String>(it) },
        nonce = rawObject["nonce"]?.let { json.decodeFromJsonElement<String>(it) },
        verificationSession = rawObject["verification_session"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1EphemeralKeysPostRequestFormX0d4b063f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1EphemeralKeysPostRequestFormX0d4b063f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customer?.let { put("customer", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.issuingCard?.let { put("issuing_card", it) }
        value.nonce?.let { put("nonce", it) }
        value.verificationSession?.let { put("verification_session", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1EphemeralKeysPostRequestFormX0d4b063f(block: InlineV1EphemeralKeysPostRequestFormX0d4b063f.Builder.() -> Unit): InlineV1EphemeralKeysPostRequestFormX0d4b063f = InlineV1EphemeralKeysPostRequestFormX0d4b063f.build(block)
