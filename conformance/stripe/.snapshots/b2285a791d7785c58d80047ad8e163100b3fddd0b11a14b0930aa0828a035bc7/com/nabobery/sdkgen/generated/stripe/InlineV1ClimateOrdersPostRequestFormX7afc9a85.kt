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
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema
 */
@Serializable(with = InlineV1ClimateOrdersPostRequestFormX7afc9a85.Serializer::class)
public class InlineV1ClimateOrdersPostRequestFormX7afc9a85(
  /**
   * Publicly sharable reference for the end beneficiary of carbon removal. Assumed to be the Stripe account if not set.
   */
  public val beneficiary: InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
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
     * Publicly sharable reference for the end beneficiary of carbon removal. Assumed to be the Stripe account if not
     * set.
     */
    public var beneficiary: InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7? = null

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

    public fun build(): InlineV1ClimateOrdersPostRequestFormX7afc9a85 = InlineV1ClimateOrdersPostRequestFormX7afc9a85(
      beneficiary = beneficiary,
      expand = expand,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ClimateOrdersPostRequestFormX7afc9a85 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ClimateOrdersPostRequestFormX7afc9a85> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersPostRequestFormX7afc9a85 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ClimateOrdersPostRequestFormX7afc9a85")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ClimateOrdersPostRequestFormX7afc9a85 must be a JSON object")
      return InlineV1ClimateOrdersPostRequestFormX7afc9a85(
        beneficiary = rawObject["beneficiary"]?.let { json.decodeFromJsonElement<InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ClimateOrdersPostRequestFormX7afc9a85) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ClimateOrdersPostRequestFormX7afc9a85")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.beneficiary?.let { put("beneficiary", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ClimateOrdersPostRequestFormX7afc9a85(block: InlineV1ClimateOrdersPostRequestFormX7afc9a85.Builder.() -> Unit): InlineV1ClimateOrdersPostRequestFormX7afc9a85 = InlineV1ClimateOrdersPostRequestFormX7afc9a85.build(block)
