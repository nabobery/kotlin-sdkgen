package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class NotificationEventRequestView(
  public val id: String? = null,
  @SerialName("idempotency_key")
  public val idempotencyKey: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/notification_event_request
 */
@Serializable(with = NotificationEventRequest.Serializer::class)
public class NotificationEventRequest(
  /**
   * ID of the API request that caused the event. If null, the event was automatic (e.g., Stripe's automatic
   * subscription handling). Request logs are available in the [dashboard](https://dashboard.stripe.com/logs), but
   * currently not in the API.
   */
  public val id: String? = null,
  /**
   * The idempotency key transmitted during the request, if any. *Note: This property is populated only for events on or
   * after May 23, 2017*.
   */
  public val idempotencyKey: String? = null,
) {
  public class Builder {
    /**
     * ID of the API request that caused the event. If null, the event was automatic (e.g., Stripe's automatic
     * subscription handling). Request logs are available in the [dashboard](https://dashboard.stripe.com/logs), but
     * currently not in the API.
     */
    public var id: String? = null

    /**
     * The idempotency key transmitted during the request, if any. *Note: This property is populated only for events on
     * or after May 23, 2017*.
     */
    public var idempotencyKey: String? = null

    public fun build(): NotificationEventRequest = NotificationEventRequest(
      id = id,
      idempotencyKey = idempotencyKey,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NotificationEventRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NotificationEventRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NotificationEventRequest {
      val jsonDecoder = decoder.requireJsonDecoder("NotificationEventRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NotificationEventRequest must be a JSON object")
      return NotificationEventRequest(
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        idempotencyKey = rawObject["idempotency_key"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: NotificationEventRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("NotificationEventRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", it) }
        value.idempotencyKey?.let { put("idempotency_key", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun notificationEventRequest(block: NotificationEventRequest.Builder.() -> Unit): NotificationEventRequest = NotificationEventRequest.build(block)
