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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1secrets~1{secret_name}/put/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1secrets~1{secret_name}/put/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineReposActionsSecretsPutRequestJsonX8ddde01b.Serializer::class)
public class InlineReposActionsSecretsPutRequestJsonX8ddde01b(
  /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
   * using the public key retrieved from the [Get a repository public
   * key](https://docs.github.com/rest/actions/secrets#get-a-repository-public-key) endpoint.
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

    public fun build(): InlineReposActionsSecretsPutRequestJsonX8ddde01b {
      check(encryptedValueValue != null) { "encryptedValue is required" }
      check(keyIdValue != null) { "keyId is required" }
      return InlineReposActionsSecretsPutRequestJsonX8ddde01b(
        encryptedValue = encryptedValue,
        keyId = keyId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsSecretsPutRequestJsonX8ddde01b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposActionsSecretsPutRequestJsonX8ddde01b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsSecretsPutRequestJsonX8ddde01b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsSecretsPutRequestJsonX8ddde01b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsSecretsPutRequestJsonX8ddde01b must be a JSON object")
      val encryptedValue = json.decodeRequired<String>(rawObject, "encrypted_value")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      return InlineReposActionsSecretsPutRequestJsonX8ddde01b(
        encryptedValue = encryptedValue,
        keyId = keyId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsSecretsPutRequestJsonX8ddde01b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsSecretsPutRequestJsonX8ddde01b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_value", value.encryptedValue)
        put("key_id", value.keyId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsSecretsPutRequestJsonX8ddde01b(block: InlineReposActionsSecretsPutRequestJsonX8ddde01b.Builder.() -> Unit): InlineReposActionsSecretsPutRequestJsonX8ddde01b = InlineReposActionsSecretsPutRequestJsonX8ddde01b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsSecretsPutRequestJsonX8ddde01b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
