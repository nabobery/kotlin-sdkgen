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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries~1public-key/get/responses/200/content/applicati
 * on~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries~1public-key/get/responses/200/content/applicati
 * on~1json/schema
 */
@Serializable(with = InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a.Serializer::class)
public class InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a(
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

    public fun build(): InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a {
      check(keyValue != null) { "key is required" }
      check(keyIdValue != null) { "keyId is required" }
      return InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a(
        key = key,
        keyId = keyId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      return InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a(
        key = key,
        keyId = keyId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("key_id", value.keyId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a(block: InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a.Builder.() -> Unit): InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a = InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPrivateRegistriesPublicKeyGetResponse200JsonX7ee47d1a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
