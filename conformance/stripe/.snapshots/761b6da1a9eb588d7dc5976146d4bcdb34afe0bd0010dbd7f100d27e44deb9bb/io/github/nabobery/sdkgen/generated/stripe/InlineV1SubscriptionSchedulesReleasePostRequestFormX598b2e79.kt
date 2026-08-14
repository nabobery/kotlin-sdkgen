package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}~1release/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}~1release/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79.Serializer::class)
public class InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79(
  expand: List<String>? = null,
  /**
   * Keep any cancellation on the subscription that the schedule has set
   */
  public val preserveCancelDate: Boolean? = null,
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

    /**
     * Keep any cancellation on the subscription that the schedule has set
     */
    public var preserveCancelDate: Boolean? = null

    public fun build(): InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79 = InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79(
      expand = expand,
      preserveCancelDate = preserveCancelDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79 must be a JSON object")
      return InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        preserveCancelDate = rawObject["preserve_cancel_date"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.preserveCancelDate?.let { put("preserve_cancel_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79(block: InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79.Builder.() -> Unit): InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79 = InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79.build(block)
