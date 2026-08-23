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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1secrets~1{secret_name}/put/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1agents~1secrets~1{secret_name}/put/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposAgentsSecretsPutRequestJsonXf1e2779a.Serializer::class)
public class InlineReposAgentsSecretsPutRequestJsonXf1e2779a(
  /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
   * using the public key retrieved from the [Get a repository public
   * key](https://docs.github.com/rest/agents/secrets#get-a-repository-public-key) endpoint.
   */
  public val encryptedValue: String,
  /**
   * ID of the key you used to encrypt the secret.
   */
  public val keyId: String,
) {
  public class Builder {
    private var encryptedValueValue: String? = null

    public var encryptedValue: String
      get() = requireNotNull(encryptedValueValue) { "encryptedValue is required" }
      set(`value`) {
        encryptedValueValue = value
      }

    private var keyIdValue: String? = null

    public var keyId: String
      get() = requireNotNull(keyIdValue) { "keyId is required" }
      set(`value`) {
        keyIdValue = value
      }

    public fun build(): InlineReposAgentsSecretsPutRequestJsonXf1e2779a {
      check(encryptedValueValue != null) { "encryptedValue is required" }
      check(keyIdValue != null) { "keyId is required" }
      return InlineReposAgentsSecretsPutRequestJsonXf1e2779a(
        encryptedValue = encryptedValue,
        keyId = keyId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAgentsSecretsPutRequestJsonXf1e2779a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposAgentsSecretsPutRequestJsonXf1e2779a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAgentsSecretsPutRequestJsonXf1e2779a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAgentsSecretsPutRequestJsonXf1e2779a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAgentsSecretsPutRequestJsonXf1e2779a must be a JSON object")
      val encryptedValue = json.decodeRequired<String>(rawObject, "encrypted_value")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      return InlineReposAgentsSecretsPutRequestJsonXf1e2779a(
        encryptedValue = encryptedValue,
        keyId = keyId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAgentsSecretsPutRequestJsonXf1e2779a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAgentsSecretsPutRequestJsonXf1e2779a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_value", value.encryptedValue)
        put("key_id", value.keyId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAgentsSecretsPutRequestJsonXf1e2779a(block: InlineReposAgentsSecretsPutRequestJsonXf1e2779a.Builder.() -> Unit): InlineReposAgentsSecretsPutRequestJsonXf1e2779a = InlineReposAgentsSecretsPutRequestJsonXf1e2779a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposAgentsSecretsPutRequestJsonXf1e2779a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
