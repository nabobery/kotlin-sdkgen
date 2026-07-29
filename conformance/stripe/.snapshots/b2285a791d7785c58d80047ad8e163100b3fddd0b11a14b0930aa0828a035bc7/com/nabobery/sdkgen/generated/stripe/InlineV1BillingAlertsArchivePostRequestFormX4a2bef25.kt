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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts~1{id}~1archive/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts~1{id}~1archive/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema
 */
@Serializable(with = InlineV1BillingAlertsArchivePostRequestFormX4a2bef25.Serializer::class)
public class InlineV1BillingAlertsArchivePostRequestFormX4a2bef25(
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

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

    public fun build(): InlineV1BillingAlertsArchivePostRequestFormX4a2bef25 = InlineV1BillingAlertsArchivePostRequestFormX4a2bef25(
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingAlertsArchivePostRequestFormX4a2bef25 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingAlertsArchivePostRequestFormX4a2bef25> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingAlertsArchivePostRequestFormX4a2bef25 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingAlertsArchivePostRequestFormX4a2bef25")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingAlertsArchivePostRequestFormX4a2bef25 must be a JSON object")
      return InlineV1BillingAlertsArchivePostRequestFormX4a2bef25(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingAlertsArchivePostRequestFormX4a2bef25) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingAlertsArchivePostRequestFormX4a2bef25")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingAlertsArchivePostRequestFormX4a2bef25(block: InlineV1BillingAlertsArchivePostRequestFormX4a2bef25.Builder.() -> Unit): InlineV1BillingAlertsArchivePostRequestFormX4a2bef25 = InlineV1BillingAlertsArchivePostRequestFormX4a2bef25.build(block)
