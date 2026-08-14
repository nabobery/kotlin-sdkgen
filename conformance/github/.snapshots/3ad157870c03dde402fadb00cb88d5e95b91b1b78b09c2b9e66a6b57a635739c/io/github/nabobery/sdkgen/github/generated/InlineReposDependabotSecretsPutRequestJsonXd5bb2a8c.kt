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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1secrets~1{secret_name}/put/requestBody/cont
 * ent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1secrets~1{secret_name}/put/requestBody/cont
 * ent/application~1json/schema
 */
@Serializable(with = InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c.Serializer::class)
public class InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c(
  /**
   * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
   * using the public key retrieved from the [Get a repository public
   * key](https://docs.github.com/rest/dependabot/secrets#get-a-repository-public-key) endpoint.
   */
  public val encryptedValue: String? = null,
  /**
   * ID of the key you used to encrypt the secret.
   */
  public val keyId: String? = null,
) {
  public class Builder {
    /**
     * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages)
     * using the public key retrieved from the [Get a repository public
     * key](https://docs.github.com/rest/dependabot/secrets#get-a-repository-public-key) endpoint.
     */
    public var encryptedValue: String? = null

    /**
     * ID of the key you used to encrypt the secret.
     */
    public var keyId: String? = null

    public fun build(): InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c = InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c(
      encryptedValue = encryptedValue,
      keyId = keyId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c must be a JSON object")
      return InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c(
        encryptedValue = rawObject["encrypted_value"]?.let { json.decodeFromJsonElement<String>(it) },
        keyId = rawObject["key_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.encryptedValue?.let { put("encrypted_value", it) }
        value.keyId?.let { put("key_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDependabotSecretsPutRequestJsonXd5bb2a8c(block: InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c.Builder.() -> Unit): InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c = InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c.build(block)
