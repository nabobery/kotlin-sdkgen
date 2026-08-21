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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * The public key used for setting user Codespaces' Secrets.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespaces-user-public-key
 */
@Serializable(with = CodespacesUserPublicKey.Serializer::class)
public class CodespacesUserPublicKey(
  /**
   * The Base64 encoded public key.
   */
  public val key: String,
  /**
   * The identifier for the key.
   */
  public val keyId: String,
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

    public fun build(): CodespacesUserPublicKey {
      check(keyValue != null) { "key is required" }
      check(keyIdValue != null) { "keyId is required" }
      return CodespacesUserPublicKey(
        key = key,
        keyId = keyId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodespacesUserPublicKey = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodespacesUserPublicKey> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodespacesUserPublicKey {
      val jsonDecoder = decoder.requireJsonDecoder("CodespacesUserPublicKey")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodespacesUserPublicKey must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      return CodespacesUserPublicKey(
        key = key,
        keyId = keyId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodespacesUserPublicKey) {
      val jsonEncoder = encoder.requireJsonEncoder("CodespacesUserPublicKey")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("key_id", value.keyId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codespacesUserPublicKey(block: CodespacesUserPublicKey.Builder.() -> Unit): CodespacesUserPublicKey = CodespacesUserPublicKey.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodespacesUserPublicKey is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
