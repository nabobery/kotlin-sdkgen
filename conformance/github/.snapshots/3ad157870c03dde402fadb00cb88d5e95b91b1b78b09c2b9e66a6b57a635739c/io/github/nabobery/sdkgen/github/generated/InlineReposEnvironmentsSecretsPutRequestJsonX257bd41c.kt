package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1secrets~1{secret_name
 * }/put/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1secrets~1{secret_name
 * }/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c.Serializer::class)
public class InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c(
  /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
   * using the public key retrieved from the [Get an environment public
   * key](https://docs.github.com/rest/actions/secrets#get-an-environment-public-key) endpoint.
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

    public fun build(): InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c {
      check(encryptedValueValue != null) { "encryptedValue is required" }
      check(keyIdValue != null) { "keyId is required" }
      return InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c(
        encryptedValue = encryptedValue,
        keyId = keyId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c must be a JSON object")
      val encryptedValue = json.decodeRequired<String>(rawObject, "encrypted_value")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      return InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c(
        encryptedValue = encryptedValue,
        keyId = keyId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_value", value.encryptedValue)
        put("key_id", value.keyId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsSecretsPutRequestJsonX257bd41c(block: InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c.Builder.() -> Unit): InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c = InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposEnvironmentsSecretsPutRequestJsonX257bd41c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
