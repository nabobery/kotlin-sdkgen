package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
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
 * sdkgen://source/openapi.yaml#/paths/~1notifications/put/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1notifications/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineNotificationsPutRequestJsonX2f65c918.Serializer::class)
public class InlineNotificationsPutRequestJsonX2f65c918(
  /**
   * Describes the last point that notifications were checked. Anything updated since this time will not be marked as
   * read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastReadAt: String? = null,
  /**
   * Whether the notification has been read.
   */
  public val read: Boolean? = null,
) {
  public class Builder {
    /**
     * Describes the last point that notifications were checked. Anything updated since this time will not be marked as
     * read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var lastReadAt: String? = null

    /**
     * Whether the notification has been read.
     */
    public var read: Boolean? = null

    public fun build(): InlineNotificationsPutRequestJsonX2f65c918 = InlineNotificationsPutRequestJsonX2f65c918(
      lastReadAt = lastReadAt,
      read = read,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNotificationsPutRequestJsonX2f65c918 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineNotificationsPutRequestJsonX2f65c918> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNotificationsPutRequestJsonX2f65c918 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNotificationsPutRequestJsonX2f65c918")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNotificationsPutRequestJsonX2f65c918 must be a JSON object")
      return InlineNotificationsPutRequestJsonX2f65c918(
        lastReadAt = rawObject["last_read_at"]?.let { json.decodeFromJsonElement<String>(it) },
        read = rawObject["read"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNotificationsPutRequestJsonX2f65c918) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNotificationsPutRequestJsonX2f65c918")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.lastReadAt?.let { put("last_read_at", it) }
        value.read?.let { put("read", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNotificationsPutRequestJsonX2f65c918(block: InlineNotificationsPutRequestJsonX2f65c918.Builder.() -> Unit): InlineNotificationsPutRequestJsonX2f65c918 = InlineNotificationsPutRequestJsonX2f65c918.build(block)
