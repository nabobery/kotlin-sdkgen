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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1BillingAlertsPostRequestFormX87b5449f.Serializer::class)
public class InlineV1BillingAlertsPostRequestFormX87b5449f(
  /**
   * The type of alert to create.
   */
  public val alertType: InlineV1BillingAlertsPostRequestFormAlertTypeX28271849,
  /**
   * The title of the alert.
   */
  public val title: String,
  expand: List<String>? = null,
  /**
   * The configuration of the usage threshold.
   */
  public val usageThreshold: InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var alertTypeValue: InlineV1BillingAlertsPostRequestFormAlertTypeX28271849? = null

    public var alertType: InlineV1BillingAlertsPostRequestFormAlertTypeX28271849
      get() = requireNotNull(alertTypeValue) { "alertType is required" }
      set(`value`) {
        alertTypeValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

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
     * The configuration of the usage threshold.
     */
    public var usageThreshold: InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5? = null

    public fun build(): InlineV1BillingAlertsPostRequestFormX87b5449f {
      check(alertTypeValue != null) { "alertType is required" }
      check(titleValue != null) { "title is required" }
      return InlineV1BillingAlertsPostRequestFormX87b5449f(
        alertType = alertType,
        title = title,
        expand = expand,
        usageThreshold = usageThreshold,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingAlertsPostRequestFormX87b5449f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingAlertsPostRequestFormX87b5449f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingAlertsPostRequestFormX87b5449f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingAlertsPostRequestFormX87b5449f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingAlertsPostRequestFormX87b5449f must be a JSON object")
      val alertType = json.decodeRequired<InlineV1BillingAlertsPostRequestFormAlertTypeX28271849>(rawObject, "alert_type")
      val title = json.decodeRequired<String>(rawObject, "title")
      return InlineV1BillingAlertsPostRequestFormX87b5449f(
        alertType = alertType,
        title = title,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        usageThreshold = rawObject["usage_threshold"]?.let { json.decodeFromJsonElement<InlineV1BillingAlertsPostRequestFormUsageThresholdX6466c8c5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingAlertsPostRequestFormX87b5449f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingAlertsPostRequestFormX87b5449f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alert_type", json.encodeToJsonElement(value.alertType))
        put("title", value.title)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.usageThreshold?.let { put("usage_threshold", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingAlertsPostRequestFormX87b5449f(block: InlineV1BillingAlertsPostRequestFormX87b5449f.Builder.() -> Unit): InlineV1BillingAlertsPostRequestFormX87b5449f = InlineV1BillingAlertsPostRequestFormX87b5449f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingAlertsPostRequestFormX87b5449f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
