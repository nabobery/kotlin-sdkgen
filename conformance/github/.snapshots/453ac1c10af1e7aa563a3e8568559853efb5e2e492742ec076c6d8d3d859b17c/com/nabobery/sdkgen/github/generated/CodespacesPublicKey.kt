package com.nabobery.sdkgen.github.generated

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
 * The public key used for setting Codespaces secrets.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespaces-public-key
 */
@Serializable(with = CodespacesPublicKey.Serializer::class)
public class CodespacesPublicKey(
  /**
   * The Base64 encoded public key.
   */
  public val key: String,
  /**
   * The identifier for the key.
   */
  public val keyId: String,
  public val createdAt: String? = null,
  public val id: Int? = null,
  public val title: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var keyIdValue: String? = null

    public var keyId: String
      get() = requireNotNull(keyIdValue) { "keyId is required" }
      set(`value`) {
        keyIdValue = value
      }

    public var createdAt: String? = null

    public var id: Int? = null

    public var title: String? = null

    public var url: String? = null

    public fun build(): CodespacesPublicKey {
      check(keyValue != null) { "key is required" }
      check(keyIdValue != null) { "keyId is required" }
      return CodespacesPublicKey(
        key = key,
        keyId = keyId,
        createdAt = createdAt,
        id = id,
        title = title,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodespacesPublicKey = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodespacesPublicKey> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodespacesPublicKey {
      val jsonDecoder = decoder.requireJsonDecoder("CodespacesPublicKey")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodespacesPublicKey must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      return CodespacesPublicKey(
        key = key,
        keyId = keyId,
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodespacesPublicKey) {
      val jsonEncoder = encoder.requireJsonEncoder("CodespacesPublicKey")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("key_id", value.keyId)
        value.createdAt?.let { put("created_at", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codespacesPublicKey(block: CodespacesPublicKey.Builder.() -> Unit): CodespacesPublicKey = CodespacesPublicKey.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodespacesPublicKey is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
