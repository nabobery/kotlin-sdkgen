package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1notifications/put/requestBody/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1notifications/put/requestBody/content/application~1json
 * /schema
 */
@Serializable(with = InlineReposNotificationsPutRequestJsonXd4535e9b.Serializer::class)
public class InlineReposNotificationsPutRequestJsonXd4535e9b(
  /**
   * Describes the last point that notifications were checked. Anything updated since this time will not be marked as
   * read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastReadAt: String? = null,
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

    public fun build(): InlineReposNotificationsPutRequestJsonXd4535e9b = InlineReposNotificationsPutRequestJsonXd4535e9b(
      lastReadAt = lastReadAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposNotificationsPutRequestJsonXd4535e9b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposNotificationsPutRequestJsonXd4535e9b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposNotificationsPutRequestJsonXd4535e9b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposNotificationsPutRequestJsonXd4535e9b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposNotificationsPutRequestJsonXd4535e9b must be a JSON object")
      return InlineReposNotificationsPutRequestJsonXd4535e9b(
        lastReadAt = rawObject["last_read_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposNotificationsPutRequestJsonXd4535e9b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposNotificationsPutRequestJsonXd4535e9b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.lastReadAt?.let { put("last_read_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposNotificationsPutRequestJsonXd4535e9b(block: InlineReposNotificationsPutRequestJsonXd4535e9b.Builder.() -> Unit): InlineReposNotificationsPutRequestJsonXd4535e9b = InlineReposNotificationsPutRequestJsonXd4535e9b.build(block)
