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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormXb0722b29.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormXb0722b29(
  /**
   * Object representing the subscription schedule's default settings.
   */
  public val defaultSettings:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34? = null,
  /**
   * Behavior of the subscription schedule and underlying subscription when it ends. Possible values are `release` or
   * `cancel` with the default being `release`. `release` will end the subscription schedule and keep the underlying
   * subscription running. `cancel` will end the subscription schedule and cancel the underlying subscription.
   */
  public val endBehavior: InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f? = null,
  phases: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e>? = null,
  /**
   * If the update changes the billing configuration (item price, quantity, etc.) of the current phase, indicates how
   * prorations from this change should be handled. The default value is `create_prorations`.
   */
  public val prorationBehavior:
      InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * List representing phases of the subscription schedule. Each phase can be customized to have different durations,
   * plans, and coupons. If there are multiple phases, the `end_date` of one phase will always equal the `start_date` of
   * the next phase. Note that past phases can be omitted.
   */
  public val phases: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e>? =
      phases?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Object representing the subscription schedule's default settings.
     */
    public var defaultSettings:
        InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34? = null

    /**
     * Behavior of the subscription schedule and underlying subscription when it ends. Possible values are `release` or
     * `cancel` with the default being `release`. `release` will end the subscription schedule and keep the underlying
     * subscription running. `cancel` will end the subscription schedule and cancel the underlying subscription.
     */
    public var endBehavior: InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808? = null

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
    public var metadata: InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f? = null

    private var phasesValue: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e>?
        = null

    /**
     * List representing phases of the subscription schedule. Each phase can be customized to have different durations,
     * plans, and coupons. If there are multiple phases, the `end_date` of one phase will always equal the `start_date`
     * of the next phase. Note that past phases can be omitted.
     */
    public var phases: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e>?
      get() = phasesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        phasesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * If the update changes the billing configuration (item price, quantity, etc.) of the current phase, indicates how
     * prorations from this change should be handled. The default value is `create_prorations`.
     */
    public var prorationBehavior:
        InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormXb0722b29 = InlineV1SubscriptionSchedulesPostRequestFormXb0722b29(
      defaultSettings = defaultSettings,
      endBehavior = endBehavior,
      expand = expand,
      metadata = metadata,
      phases = phases,
      prorationBehavior = prorationBehavior,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormXb0722b29 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormXb0722b29> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormXb0722b29 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormXb0722b29")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormXb0722b29 must be a JSON object")
      return InlineV1SubscriptionSchedulesPostRequestFormXb0722b29(
        defaultSettings = rawObject["default_settings"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsXc9278c34>(it) },
        endBehavior = rawObject["end_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormEndBehaviorX3218b808>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormMetadataX3b47466f>(it) },
        phases = rawObject["phases"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e>>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormProrationBehaviorXf4833d31>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormXb0722b29) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormXb0722b29")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultSettings?.let { put("default_settings", json.encodeToJsonElement(it)) }
        value.endBehavior?.let { put("end_behavior", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.phases?.let { put("phases", json.encodeToJsonElement(it)) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormXb0722b29(block: InlineV1SubscriptionSchedulesPostRequestFormXb0722b29.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormXb0722b29 = InlineV1SubscriptionSchedulesPostRequestFormXb0722b29.build(block)
