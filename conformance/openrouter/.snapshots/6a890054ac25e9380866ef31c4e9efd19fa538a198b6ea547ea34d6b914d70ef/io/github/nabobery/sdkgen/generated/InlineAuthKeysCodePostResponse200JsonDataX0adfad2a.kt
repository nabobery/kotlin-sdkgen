package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Auth code data
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1auth~1keys~1code/post/responses/200/content/application~1json/schema/properties
 * /data
 */
@Serializable(with = InlineAuthKeysCodePostResponse200JsonDataX0adfad2a.Serializer::class)
public class InlineAuthKeysCodePostResponse200JsonDataX0adfad2a(
  /**
   * The application ID associated with this auth code
   */
  public val appId: Int,
  /**
   * ISO 8601 timestamp of when the auth code was created
   */
  public val createdAt: String,
  /**
   * The authorization code ID to use in the exchange request
   */
  public val id: String,
) {
  public class Builder {
    private var appIdValue: Int? = null

    public var appId: Int
      get() = requireNotNull(appIdValue) { "appId is required" }
      set(`value`) {
        appIdValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): InlineAuthKeysCodePostResponse200JsonDataX0adfad2a {
      check(appIdValue != null) { "appId is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      return InlineAuthKeysCodePostResponse200JsonDataX0adfad2a(
        appId = appId,
        createdAt = createdAt,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAuthKeysCodePostResponse200JsonDataX0adfad2a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAuthKeysCodePostResponse200JsonDataX0adfad2a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAuthKeysCodePostResponse200JsonDataX0adfad2a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAuthKeysCodePostResponse200JsonDataX0adfad2a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAuthKeysCodePostResponse200JsonDataX0adfad2a must be a JSON object")
      val appId = json.decodeRequired<Int>(rawObject, "app_id")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      return InlineAuthKeysCodePostResponse200JsonDataX0adfad2a(
        appId = appId,
        createdAt = createdAt,
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAuthKeysCodePostResponse200JsonDataX0adfad2a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAuthKeysCodePostResponse200JsonDataX0adfad2a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app_id", json.encodeToJsonElement(value.appId))
        put("created_at", value.createdAt)
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAuthKeysCodePostResponse200JsonDataX0adfad2a(block: InlineAuthKeysCodePostResponse200JsonDataX0adfad2a.Builder.() -> Unit): InlineAuthKeysCodePostResponse200JsonDataX0adfad2a = InlineAuthKeysCodePostResponse200JsonDataX0adfad2a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAuthKeysCodePostResponse200JsonDataX0adfad2a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
