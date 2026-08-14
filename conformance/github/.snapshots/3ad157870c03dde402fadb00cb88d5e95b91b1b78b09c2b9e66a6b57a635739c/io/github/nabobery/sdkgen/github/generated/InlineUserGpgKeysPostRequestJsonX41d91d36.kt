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
 * sdkgen://source/openapi.yaml#/paths/~1user~1gpg_keys/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1gpg_keys/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserGpgKeysPostRequestJsonX41d91d36.Serializer::class)
public class InlineUserGpgKeysPostRequestJsonX41d91d36(
  /**
   * A GPG key in ASCII-armored format.
   */
  public val armoredPublicKey: String,
  /**
   * A descriptive name for the new key.
   */
  public val name: String? = null,
) {
  public class Builder {
    private var armoredPublicKeyValue: String? = null

    public var armoredPublicKey: String
      get() = requireNotNull(armoredPublicKeyValue) { "armoredPublicKey is required" }
      set(`value`) {
        armoredPublicKeyValue = value
      }

    /**
     * A descriptive name for the new key.
     */
    public var name: String? = null

    public fun build(): InlineUserGpgKeysPostRequestJsonX41d91d36 {
      check(armoredPublicKeyValue != null) { "armoredPublicKey is required" }
      return InlineUserGpgKeysPostRequestJsonX41d91d36(
        armoredPublicKey = armoredPublicKey,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserGpgKeysPostRequestJsonX41d91d36 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserGpgKeysPostRequestJsonX41d91d36> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserGpgKeysPostRequestJsonX41d91d36 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserGpgKeysPostRequestJsonX41d91d36")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserGpgKeysPostRequestJsonX41d91d36 must be a JSON object")
      val armoredPublicKey = json.decodeRequired<String>(rawObject, "armored_public_key")
      return InlineUserGpgKeysPostRequestJsonX41d91d36(
        armoredPublicKey = armoredPublicKey,
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserGpgKeysPostRequestJsonX41d91d36) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserGpgKeysPostRequestJsonX41d91d36")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("armored_public_key", value.armoredPublicKey)
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserGpgKeysPostRequestJsonX41d91d36(block: InlineUserGpgKeysPostRequestJsonX41d91d36.Builder.() -> Unit): InlineUserGpgKeysPostRequestJsonX41d91d36 = InlineUserGpgKeysPostRequestJsonX41d91d36.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserGpgKeysPostRequestJsonX41d91d36 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
