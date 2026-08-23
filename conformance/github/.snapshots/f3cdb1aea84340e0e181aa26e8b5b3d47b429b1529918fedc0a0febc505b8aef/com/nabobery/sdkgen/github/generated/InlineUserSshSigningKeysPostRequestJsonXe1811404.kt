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
 * sdkgen://source/openapi.yaml#/paths/~1user~1ssh_signing_keys/post/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1ssh_signing_keys/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserSshSigningKeysPostRequestJsonXe1811404.Serializer::class)
public class InlineUserSshSigningKeysPostRequestJsonXe1811404(
  /**
   * The public SSH key to add to your GitHub account. For more information, see "[Checking for existing SSH
   * keys](https://docs.github.com/authentication/connecting-to-github-with-ssh/checking-for-existing-ssh-keys)."
   */
  public val key: String,
  /**
   * A descriptive name for the new key.
   */
  public val title: String? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    /**
     * A descriptive name for the new key.
     */
    public var title: String? = null

    public fun build(): InlineUserSshSigningKeysPostRequestJsonXe1811404 {
      check(keyValue != null) { "key is required" }
      return InlineUserSshSigningKeysPostRequestJsonXe1811404(
        key = key,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserSshSigningKeysPostRequestJsonXe1811404 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserSshSigningKeysPostRequestJsonXe1811404> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserSshSigningKeysPostRequestJsonXe1811404 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserSshSigningKeysPostRequestJsonXe1811404")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserSshSigningKeysPostRequestJsonXe1811404 must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      return InlineUserSshSigningKeysPostRequestJsonXe1811404(
        key = key,
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserSshSigningKeysPostRequestJsonXe1811404) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserSshSigningKeysPostRequestJsonXe1811404")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserSshSigningKeysPostRequestJsonXe1811404(block: InlineUserSshSigningKeysPostRequestJsonXe1811404.Builder.() -> Unit): InlineUserSshSigningKeysPostRequestJsonXe1811404 = InlineUserSshSigningKeysPostRequestJsonXe1811404.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserSshSigningKeysPostRequestJsonXe1811404 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
