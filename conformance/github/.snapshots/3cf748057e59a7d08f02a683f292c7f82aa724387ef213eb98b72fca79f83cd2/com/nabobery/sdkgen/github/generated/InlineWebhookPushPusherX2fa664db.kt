package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Metaproperties for Git author/committer information.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/pusher
 */
@Serializable(with = InlineWebhookPushPusherX2fa664db.Serializer::class)
public class InlineWebhookPushPusherX2fa664db(
  /**
   * The git author's name.
   */
  public val name: String,
  public val date: String? = null,
  public val email: String? = null,
  public val username: String? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var date: String? = null

    public var email: String? = null

    public var username: String? = null

    public fun build(): InlineWebhookPushPusherX2fa664db {
      check(nameValue != null) { "name is required" }
      return InlineWebhookPushPusherX2fa664db(
        name = name,
        date = date,
        email = email,
        username = username,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPushPusherX2fa664db = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPushPusherX2fa664db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPushPusherX2fa664db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPushPusherX2fa664db")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPushPusherX2fa664db must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineWebhookPushPusherX2fa664db(
        name = name,
        date = rawObject["date"]?.let { json.decodeFromJsonElement<String>(it) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        username = rawObject["username"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPushPusherX2fa664db) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPushPusherX2fa664db")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.date?.let { put("date", it) }
        value.email?.let { put("email", it) }
        value.username?.let { put("username", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPushPusherX2fa664db(block: InlineWebhookPushPusherX2fa664db.Builder.() -> Unit): InlineWebhookPushPusherX2fa664db = InlineWebhookPushPusherX2fa664db.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPushPusherX2fa664db is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
