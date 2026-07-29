package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Key
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/key
 */
@Serializable(with = Key.Serializer::class)
public class Key(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val id: Long,
  public val key: String,
  public val readOnly: Boolean,
  public val title: String,
  public val url: String,
  public val verified: Boolean,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastUsed: String? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var readOnlyValue: Boolean? = null

    public var readOnly: Boolean
      get() = requireNotNull(readOnlyValue) { "readOnly is required" }
      set(`value`) {
        readOnlyValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var verifiedValue: Boolean? = null

    public var verified: Boolean
      get() = requireNotNull(verifiedValue) { "verified is required" }
      set(`value`) {
        verifiedValue = value
      }

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var lastUsed: String? = null

    public fun build(): Key {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(keyValue != null) { "key is required" }
      check(readOnlyValue != null) { "readOnly is required" }
      check(titleValue != null) { "title is required" }
      check(urlValue != null) { "url is required" }
      check(verifiedValue != null) { "verified is required" }
      return Key(
        createdAt = createdAt,
        id = id,
        key = key,
        readOnly = readOnly,
        title = title,
        url = url,
        verified = verified,
        lastUsed = lastUsed,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Key = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Key> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Key {
      val jsonDecoder = decoder.requireJsonDecoder("Key")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Key must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val key = json.decodeRequired<String>(rawObject, "key")
      val readOnly = json.decodeRequired<Boolean>(rawObject, "read_only")
      val title = json.decodeRequired<String>(rawObject, "title")
      val url = json.decodeRequired<String>(rawObject, "url")
      val verified = json.decodeRequired<Boolean>(rawObject, "verified")
      return Key(
        createdAt = createdAt,
        id = id,
        key = key,
        readOnly = readOnly,
        title = title,
        url = url,
        verified = verified,
        lastUsed = rawObject["last_used"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Key) {
      val jsonEncoder = encoder.requireJsonEncoder("Key")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("key", value.key)
        put("read_only", json.encodeToJsonElement(value.readOnly))
        put("title", value.title)
        put("url", value.url)
        put("verified", json.encodeToJsonElement(value.verified))
        value.lastUsed?.let { put("last_used", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun key(block: Key.Builder.() -> Unit): Key = Key.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Key is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
