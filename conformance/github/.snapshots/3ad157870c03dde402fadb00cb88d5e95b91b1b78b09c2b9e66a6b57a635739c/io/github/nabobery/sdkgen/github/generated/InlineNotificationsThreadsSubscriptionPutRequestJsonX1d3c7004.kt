package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Unit
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
 * sdkgen://source/openapi.yaml#/paths/~1notifications~1threads~1{thread_id}~1subscription/put/requestBody/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1notifications~1threads~1{thread_id}~1subscription/put/requestBody/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004.Serializer::class)
public class InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004(
  /**
   * Whether to block all notifications from a thread.
   */
  public val ignored: Boolean? = null,
) {
  public class Builder {
    /**
     * Whether to block all notifications from a thread.
     */
    public var ignored: Boolean? = null

    public fun build(): InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004 = InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004(
      ignored = ignored,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004 must be a JSON object")
      return InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004(
        ignored = rawObject["ignored"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ignored?.let { put("ignored", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004(block: InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004.Builder.() -> Unit): InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004 = InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004.build(block)
