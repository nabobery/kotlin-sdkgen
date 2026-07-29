package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1plans~1{plan}/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans~1{plan}/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema
 */
@Serializable(with = InlineV1PlansPostRequestFormX3ea3b05f.Serializer::class)
public class InlineV1PlansPostRequestFormX3ea3b05f(
  /**
   * Whether the plan is currently available for new subscriptions.
   */
  public val active: Boolean? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1PlansPostRequestFormMetadataXe8118113? = null,
  /**
   * A brief description of the plan, hidden from customers.
   */
  public val nickname: String? = null,
  /**
   * The product the plan belongs to. This cannot be changed once it has been used in a subscription or subscription
   * schedule.
   */
  public val product: String? = null,
  /**
   * Default number of trial days when subscribing a customer to this plan using
   * [`trial_from_plan=true`](https://docs.stripe.com/api#create_subscription-trial_from_plan).
   */
  public val trialPeriodDays: Int? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Whether the plan is currently available for new subscriptions.
     */
    public var active: Boolean? = null

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
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1PlansPostRequestFormMetadataXe8118113? = null

    /**
     * A brief description of the plan, hidden from customers.
     */
    public var nickname: String? = null

    /**
     * The product the plan belongs to. This cannot be changed once it has been used in a subscription or subscription
     * schedule.
     */
    public var product: String? = null

    /**
     * Default number of trial days when subscribing a customer to this plan using
     * [`trial_from_plan=true`](https://docs.stripe.com/api#create_subscription-trial_from_plan).
     */
    public var trialPeriodDays: Int? = null

    public fun build(): InlineV1PlansPostRequestFormX3ea3b05f = InlineV1PlansPostRequestFormX3ea3b05f(
      active = active,
      expand = expand,
      metadata = metadata,
      nickname = nickname,
      product = product,
      trialPeriodDays = trialPeriodDays,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PlansPostRequestFormX3ea3b05f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PlansPostRequestFormX3ea3b05f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormX3ea3b05f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PlansPostRequestFormX3ea3b05f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PlansPostRequestFormX3ea3b05f must be a JSON object")
      return InlineV1PlansPostRequestFormX3ea3b05f(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PlansPostRequestFormMetadataXe8118113>(it) },
        nickname = rawObject["nickname"]?.let { json.decodeFromJsonElement<String>(it) },
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PlansPostRequestFormX3ea3b05f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PlansPostRequestFormX3ea3b05f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nickname?.let { put("nickname", it) }
        value.product?.let { put("product", it) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PlansPostRequestFormX3ea3b05f(block: InlineV1PlansPostRequestFormX3ea3b05f.Builder.() -> Unit): InlineV1PlansPostRequestFormX3ea3b05f = InlineV1PlansPostRequestFormX3ea3b05f.build(block)
