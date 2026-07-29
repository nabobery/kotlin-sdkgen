package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormX39da8216.Serializer::class)
public class InlineV1BillingCreditGrantsPostRequestFormX39da8216(
  expand: List<String>? = null,
  /**
   * The time when the billing credits created by this credit grant expire. If set to empty, the billing credits never
   * expire.
   */
  public val expiresAt: InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a? = null,
  metadata: Map<String, String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of key-value pairs you can attach to an object. You can use this to store additional information about the
   * object (for example, cost basis) in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
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
     * The time when the billing credits created by this credit grant expire. If set to empty, the billing credits never
     * expire.
     */
    public var expiresAt: InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of key-value pairs you can attach to an object. You can use this to store additional information about the
     * object (for example, cost basis) in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1BillingCreditGrantsPostRequestFormX39da8216 = InlineV1BillingCreditGrantsPostRequestFormX39da8216(
      expand = expand,
      expiresAt = expiresAt,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormX39da8216 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormX39da8216> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormX39da8216 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditGrantsPostRequestFormX39da8216")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingCreditGrantsPostRequestFormX39da8216 must be a JSON object")
      return InlineV1BillingCreditGrantsPostRequestFormX39da8216(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormX39da8216) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingCreditGrantsPostRequestFormX39da8216")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingCreditGrantsPostRequestFormX39da8216(block: InlineV1BillingCreditGrantsPostRequestFormX39da8216.Builder.() -> Unit): InlineV1BillingCreditGrantsPostRequestFormX39da8216 = InlineV1BillingCreditGrantsPostRequestFormX39da8216.build(block)
